package com.ead.prueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ead.prueba.entities.Logistica;

@Repository
public interface LogisticRepository extends CrudRepository<Logistica, Integer> {

}
