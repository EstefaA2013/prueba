package com.ead.prueba.dto;

import java.io.Serializable;

import com.ead.prueba.entities.Cliente;
import com.ead.prueba.entities.Logistica;

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
	private Cliente cliente;
	private Logistica logistica;

}
