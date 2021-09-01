package com.ead.prueba.repository;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ead.prueba.entities.Producto;




@Repository
public interface ProductRepository extends CrudRepository<Producto, Integer>{

}
