package com.ead.prueba.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ClienteRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty(value = "nombre")
	private String nombre;
	@JsonProperty(value = "apellido")
	private String apellido;
	@JsonProperty(value = "cedula")
	private String cedula;
	@JsonProperty(value = "celular")
	private String celular;
}
