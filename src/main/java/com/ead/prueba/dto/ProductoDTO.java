package com.ead.prueba.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ead.prueba.entities.Producto;
import com.ead.prueba.repository.ProductRepository;
import com.ead.prueba.services.interfaces.IProductoService;
import com.ead.prueba.utils.helpers.MHelpers;

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
	private int idCliente;
	private int idLogistica;

}
	
	
	