package com.ead.prueba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ead.prueba.dto.ClienteRequest;
import com.ead.prueba.services.interfaces.IClienteService;
import com.ead.prueba.utils.exceptions.ApiUnprocessableEntity;
import com.ead.prueba.validator.ClienteValidatorImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@Autowired
	private ClienteValidatorImpl clienteValidator;

	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> index() {

		return ResponseEntity.ok(this.clienteService.findAll());
	}

	@GetMapping(value = "/by/{clienteId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findByCustomerId(@PathVariable("clienteId") int id) {

		return ResponseEntity.ok(this.clienteService.findByCustomerId(id));
	}

	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveCustomer(@RequestBody ClienteRequest request) throws ApiUnprocessableEntity {

		this.clienteValidator.validator(request);

		this.clienteService.save(request);

		return ResponseEntity.ok(Boolean.TRUE);

	}

	@DeleteMapping(value = "/{clienteId}/delete")
	public ResponseEntity<Object> deleteCustomer(@PathVariable int clienteId) {
		
		this.clienteService.deleteById(clienteId);
		return ResponseEntity.ok(Boolean.TRUE);
		
	}
	
	@PutMapping(value = "/{clienteId}/update")
	public ResponseEntity<Object> updateCustomer(@RequestBody ClienteRequest request, @PathVariable int clienteId) throws ApiUnprocessableEntity {
		
		this.clienteService.update(request, clienteId);
		return ResponseEntity.ok(Boolean.TRUE);
	}
}
