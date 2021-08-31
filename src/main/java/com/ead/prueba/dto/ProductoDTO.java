package com.ead.prueba.dto;

import java.io.Serializable;
import java.util.Date;


import lombok.Data;

@Data
public class ProductoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String tipoProducto;
	private int cantidadProducto;
	private Date fechaRegistro;
	private Date fechaEntrega;
	private double precioEnvio;
	private int idCliente;
	private int codigoTransporte;
	
}
