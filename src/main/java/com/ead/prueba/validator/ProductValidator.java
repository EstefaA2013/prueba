package com.ead.prueba.validator;

import org.springframework.stereotype.Service;

import com.ead.prueba.dto.ProductoRequest;
import com.ead.prueba.utils.exceptions.ApiUnprocessableEntity;

@Service
public interface ProductValidator {

	void validator(ProductoRequest request) throws ApiUnprocessableEntity;
}
