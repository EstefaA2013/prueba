package com.ead.prueba.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ead.prueba.entities.Producto;


@Repository
public interface ProductRepository extends CrudRepository<Producto, Integer> {

	@Transactional(readOnly = true)
	Optional<Producto> findByProductType(String tipoProducto);
}
