package com.ead.prueba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ead.prueba.services.implementation.AuthService;
import com.ead.prueba.utils.exceptions.ApiUnauthorized;
import com.ead.prueba.validator.AuthValidator;

@RestController
@RequestMapping(path = "v1.0")
public class AuthController {

	@Autowired
	private AuthService authService;
	
	@Autowired 
	private AuthValidator validator; 
	
	@PostMapping(path = "oauth/client_credential/accesstoken",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> login(@RequestBody MultiValueMap<String, String>paraMap,@RequestParam("grant_type")String grantType) throws ApiUnauthorized {

		validator.Validate(paraMap, grantType);
		return ResponseEntity.ok(authService.login(paraMap.getFirst("client_id"), paraMap.getFirst("client_secret")));
	}
}
