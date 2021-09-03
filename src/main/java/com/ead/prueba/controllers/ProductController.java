package com.ead.prueba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ead.prueba.dto.ProductoRequest;
import com.ead.prueba.services.interfaces.IProductoService;
import com.ead.prueba.utils.exceptions.ApiUnprocessableEntity;
import com.ead.prueba.validator.ProductValidatorImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/productos")
public class ProductController {

	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private ProductValidatorImpl productValidator;
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> index() {
		return ResponseEntity.ok(this.productoService.findAll());
	}
	
	@GetMapping(value = "/by/{productoId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findByProductId(@PathVariable("productoId") int id) {

		return ResponseEntity.ok(this.productoService.findByProductId(id));
	}
	
	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveProduct(@RequestBody ProductoRequest request) throws ApiUnprocessableEntity {

		this.productValidator.validator(request);

		this.productoService.save(request);

		return ResponseEntity.ok(Boolean.TRUE);

	}
}
