package com.ead.prueba.validator;

import org.springframework.stereotype.Service;

import com.ead.prueba.dto.ClienteRequest;
import com.ead.prueba.utils.exceptions.ApiUnprocessableEntity;

@Service
public interface ClienteValidator {
	void validator(ClienteRequest request) throws ApiUnprocessableEntity;
}
