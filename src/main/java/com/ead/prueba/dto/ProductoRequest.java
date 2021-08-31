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
	@JsonProperty(value = "fecha_entrega")
	private Date fechaEntrega;
	@JsonProperty(value = "precio_envio")
	private double precioEnvio;
	@JsonProperty(value = "numero_guia")
	private String numeroGuia;
	@JsonProperty(value = "id_cliente")
	private int idCliente;
	@JsonProperty(value = "codigo_transporte")
	private int codigoTransporte;
}
