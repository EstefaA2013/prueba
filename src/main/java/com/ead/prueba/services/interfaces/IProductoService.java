package com.ead.prueba.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ead.prueba.dto.ProductoDTO;
import com.ead.prueba.dto.ProductoRequest;

@Service
public interface IProductoService {

	List<ProductoDTO> findAll();

	ProductoDTO findByProductId(int productoId);

	void save(ProductoRequest producto);

	void update(ProductoRequest producto, int productoId);

	void saveAll(List<ProductoRequest> producto);

	void deleteById(int productoId);

}
