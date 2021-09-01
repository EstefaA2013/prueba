package com.ead.prueba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ead.prueba.services.interfaces.IProductoService;

@CrossOrigin("*")
@RestController
@RequestMapping("/productos")
public class ProductController {

	@Autowired
	private IProductoService productoService;
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> index() {
		return ResponseEntity.ok(this.productoService.findAll());
	}
}
