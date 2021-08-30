package com.ead.prueba.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.ead.prueba.entities.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

	@Transactional(readOnly = true)
	Optional<Cliente> findByUsername(String username);
}
