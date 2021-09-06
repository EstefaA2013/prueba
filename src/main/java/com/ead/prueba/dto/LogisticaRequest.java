package com.ead.prueba.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LogisticaRequest implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty(value = "fecha_entrega")
	private Date fechaEntrega;
	@JsonProperty(value = "precio_envio")
	private double precioEnvio;
	@JsonProperty(value = "codigo_transporte")
	private int transporte;
	@JsonProperty(value = "descuento")
	private double descuento;
}
