package com.ead.prueba.validator;

import java.util.Objects;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.ead.prueba.utils.exceptions.ApiUnauthorized;


@Component
public class AuthValidator {

	private static final String CLIENT_CREDENTIALS="client_credentials";
	
	public void Validate(MultiValueMap<String, String>paraMap, String grantType) throws ApiUnauthorized {
		
		if(grantType.isEmpty() || !grantType.equals(CLIENT_CREDENTIALS)) {
			message("El campo grant_type es invalido");
		}
		
		if (Objects.isNull(paraMap) || 
				paraMap.getFirst("client_id").isEmpty() ||
				paraMap.getFirst("client_secret").isEmpty()
				) {
			message("client_id y/o client_secret son invalidos");
			
		}
		
	}
	
	private void message(String message) throws ApiUnauthorized {
		throw new ApiUnauthorized(message);
	}
}
