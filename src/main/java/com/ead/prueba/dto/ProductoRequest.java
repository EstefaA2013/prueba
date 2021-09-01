package com.ead.prueba.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
public class ProductoRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty(value = "tipo_producto")
	private String tipoProducto;
	@JsonProperty(value = "cantidad_producto")
	private int cantidadProducto;
	@JsonProperty(value = "id_cliente")
	private int idCliente;
	@JsonProperty(value = "id_logistica")
	private int idLogistica;
}
