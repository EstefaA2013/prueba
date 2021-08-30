package com.ead.prueba.dto;

import java.io.Serializable;


import lombok.Data;

@Data
public class ClienteDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String apellido;
	private String cedula;
	private String celular;
	
}
