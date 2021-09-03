package com.ead.prueba.dto;

import java.io.Serializable;
import java.util.Date;


import com.ead.prueba.entities.Transporte;

import lombok.Data;

@Data
public class LogisticaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Date fechaRegistro;
	private Date fechaEntrega;
	private double precioEnvio;
	private Transporte transporte;
	private double descuento;
}
