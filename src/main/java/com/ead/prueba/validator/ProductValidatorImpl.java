package com.ead.prueba.validator;

import org.springframework.stereotype.Component;

import com.ead.prueba.dto.ProductoRequest;
import com.ead.prueba.utils.exceptions.ApiUnprocessableEntity;

@Component
public class ProductValidatorImpl implements ProductValidator {

	@Override
	public void validator(ProductoRequest request) throws ApiUnprocessableEntity {

		if (request.getTipoProducto() == null || request.getTipoProducto().isEmpty()) {
			message("El tipo de producto es obligatorio");
		}
		if (request.getTipoProducto().length() < 3) {
			message("El nombre del producto es muy corto, debe tener mínimo 3 caracteres");
		}
		if (request.getCantidadProducto() < 0) {
			message("La cantidad del producto debe ser mayor de 0");
		}
		if (request.getFechaEntrega() == null) {
			message("La fecha de entrega es obligatoria");
		}
		if (request.getPrecioEnvio() < 0) {
			message("El precio del envio debe ser mayor a 0");
		}

	}

	private void message(String message) throws ApiUnprocessableEntity {

		throw new ApiUnprocessableEntity(message);

	}

}
