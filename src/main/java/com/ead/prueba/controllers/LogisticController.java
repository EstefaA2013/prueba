package com.ead.prueba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ead.prueba.dto.LogisticaRequest;
import com.ead.prueba.services.interfaces.ILogisticService;


@CrossOrigin("*")
@RestController
@RequestMapping("/logisticas")
public class LogisticController {

	@Autowired
	private ILogisticService logisticService;
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> index() {
		/*
		 * Nos trae todos los datos de la tabla logistica de la base de datos
		 */
		return ResponseEntity.ok(this.logisticService.findAll());
	}
	
	@GetMapping(value = "/by/{logisticaId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findByProductId(@PathVariable("logisticaId") int id) {

		/*
		 * Nos trae los datos correspondientes al id que insertemos
		 */
		return ResponseEntity.ok(this.logisticService.findByLogisticId(id));
	}
	
	public ResponseEntity<Object> saveLogistic(@RequestBody LogisticaRequest request) {
		
		this.logisticService.save(request);
		
		return ResponseEntity.ok(Boolean.TRUE);
	}
	

}