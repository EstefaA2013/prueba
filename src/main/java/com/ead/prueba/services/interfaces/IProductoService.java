package com.ead.prueba.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ead.prueba.dto.ProductoDTO;
import com.ead.prueba.dto.ProductoRequest;
import com.ead.prueba.utils.exceptions.ApiUnprocessableEntity;

@Service
public interface IProductoService {

	List<ProductoDTO> findAll();

	ProductoDTO findByProductId(int productoId);

	void save(ProductoRequest producto);

	void update(ProductoRequest producto, int productoId) throws ApiUnprocessableEntity;

	void saveAll(List<ProductoRequest> producto);

	void deleteById(int productoId);

}
