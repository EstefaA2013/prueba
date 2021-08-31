package com.ead.prueba.services.implementation;

import org.springframework.stereotype.Service;

import com.ead.prueba.dto.JwtResponse;



@Service
public class AuthService {

public JwtResponse login(String clientId, String clientSecret) {


		JwtResponse jwt = JwtResponse.builder()
				.tokenType("bearer")
				.accessToken("kajushdiffhf")
				.issuedAt(System.currentTimeMillis()+"")
				.cliendId(clientId)
				.expiresIn(3600)
				.build();

		return jwt;
	}

}