package com.ead.prueba.services.implementation;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ead.prueba.dto.JwtResponse;
import com.ead.prueba.dto.JwtUserDTO;
import com.ead.prueba.security.JwtIO;
import com.ead.prueba.utils.helpers.DateUtils;

@Service
public class AuthService {

	@Autowired
	private JwtIO jwtIO;
	@Autowired
	private DateUtils dateUtils;

	@Value("${ead.jwt.token.expires-in}")
	private int EXPIRES_IN;

	public JwtResponse login(String clientId, String clientSecret) {

		UUID uid = UUID.randomUUID();
		
		JwtUserDTO user = JwtUserDTO.builder()
				.name("Estefania")
				.lastname("Aguirre")
				.role("ADMIN")
				.country("Colombia")
				.uid(uid.toString())
				.build();
		
		JwtResponse jwt = JwtResponse.builder()
				.tokenType("bearer")
				.accessToken(jwtIO.generateToken(user))
				.issuedAt(dateUtils.getDateMillis() +"")
				.cliendId(clientId)
				.expiresIn(EXPIRES_IN)
				.build();

		return jwt;
	}

}