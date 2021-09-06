package com.ead.prueba.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ead.prueba.dto.ProductoDTO;
import com.ead.prueba.dto.ProductoRequest;
import com.ead.prueba.entities.Cliente;
import com.ead.prueba.entities.Logistica;
import com.ead.prueba.entities.Producto;
import com.ead.prueba.repository.ProductRepository;
import com.ead.prueba.services.interfaces.IProductoService;
import com.ead.prueba.utils.exceptions.ApiUnprocessableEntity;
import com.ead.prueba.utils.helpers.MHelpers;

@Component
public class ProductImpl implements IProductoService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<ProductoDTO> findAll() {
		List<ProductoDTO> dto = new ArrayList<>();

		Iterable<Producto> productos = this.productRepository.findAll();

		for (Producto producto : productos) {

			ProductoDTO productoDTO = MHelpers.modelMapper().map(producto, ProductoDTO.class);

			dto.add(productoDTO);

		}

		return dto;
	}

	@Override
	public ProductoDTO findByProductId(int productoId) {
		/*
		 * Método para buscar un producto por su Id, si el Id no existe en la base de
		 * datos nos retorna null
		 */
		Optional<Producto> producto = this.productRepository.findById(productoId);

		if (!producto.isPresent()) {
			return null;
		}

		return MHelpers.modelMapper().map(producto.get(), ProductoDTO.class);

	}

	@Override
	public void save(ProductoRequest producto) {
		Producto productos = MHelpers.modelMapper().map(producto, Producto.class);
        Cliente cliente = new Cliente();
        cliente.setId(cliente.getId());
		productos.setCliente(cliente);
		Logistica logistica = new Logistica();
		logistica.setId(logistica.getId());
		productos.setLogistica(logistica);
		this.productRepository.save(productos);
	}

	@Override
	public void update(ProductoRequest request, int productoId) throws ApiUnprocessableEntity {
        Optional<Producto> productos = this.productRepository.findById(productoId);
        
        if(productos.isPresent()) {
        	Producto producto = productos.get();
        	
        	producto.setTipoProducto(request.getTipoProducto());;
        	producto.setCantidadProducto(request.getCantidadProducto());        	
        
        	this.productRepository.save(producto);
        } else {
        	message("El id del producto no existe");
        }

		

	}

	@Override
	public void saveAll(List<ProductoRequest> producto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int productoId) {

		this.productRepository.deleteById(productoId);

	}

	private ProductoDTO convertToProductosDTO(final Producto producto) {
		return MHelpers.modelMapper().map(producto, ProductoDTO.class);
	}
	
	private void message(String message) throws ApiUnprocessableEntity {

		throw new ApiUnprocessableEntity(message);

	}
}