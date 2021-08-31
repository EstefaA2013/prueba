package com.ead.prueba.services.implementation;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ead.prueba.dto.ProductoDTO;
import com.ead.prueba.dto.ProductoRequest;
import com.ead.prueba.services.interfaces.IProductoService;



@Component
public class ProductImpl implements IProductoService {

	@Override
	public List<ProductoDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO findByProductType(String tipoProducto) {
		// TODO Auto-generated method stub
		return null;
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

}
