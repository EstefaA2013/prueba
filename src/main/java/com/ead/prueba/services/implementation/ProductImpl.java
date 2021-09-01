package com.ead.prueba.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ead.prueba.dto.ClienteDTO;
import com.ead.prueba.dto.ProductoDTO;
import com.ead.prueba.dto.ProductoRequest;
import com.ead.prueba.entities.Cliente;
import com.ead.prueba.entities.Producto;
import com.ead.prueba.repository.ProductRepository;
import com.ead.prueba.services.interfaces.IProductoService;
import com.ead.prueba.utils.helpers.MHelpers;

@Component
public class ProductImpl implements IProductoService {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(ProductoRequest producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ProductoRequest producto, int productoId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(List<ProductoRequest> producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int productoId) {
		// TODO Auto-generated method stub
		
	}

	private ProductoDTO convertToProductosDTO(final Producto producto) {
	    return MHelpers.modelMapper().map(producto, ProductoDTO.class);
	}
	
}
