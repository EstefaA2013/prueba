package com.ead.prueba.validator;

import org.springframework.stereotype.Component;

import com.ead.prueba.dto.ClienteRequest;
import com.ead.prueba.utils.exceptions.ApiUnprocessableEntity;


@Component
public class ClienteValidatorImpl {

	public void validator(ClienteRequest request) throws ApiUnprocessableEntity {

		if (request.getNombre() == null || request.getNombre().isEmpty()) {
			message("El nombre es obligatorio");
		}
		if (request.getNombre().length() < 3) {
			message("El nombre es muy corto, debe tener mínimo 3 caracteres");
		}
		if (request.getApellido() == null || request.getApellido().isEmpty()) {
			message("El Apellido es obligatorio");
		}
		if (request.getApellido().length() < 3) {
			message("El apellido es muy corto, debe tener mínimo 3 caracteres");
		}
		if (request.getCedula() == null || request.getCedula().isEmpty()) {
			message("La cedula es obligatoria");
		}
		if (request.getCedula().length() == 10) {
			message("La cedula es muy corta, debe tener 10 caracteres");
		}
		if (request.getCelular() == null || request.getCelular().isEmpty()) {
			message("El número celular es obligatorio");
		}
		if (request.getCelular().length() == 10) {
			message("El número celular es muy corto, debe tener 10 caracteres");
		}

	}

	private void message(String message) throws ApiUnprocessableEntity {

		throw new ApiUnprocessableEntity(message);

	}

}

