package com.ead.prueba.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "tipo_producto")
	private String tipoProducto;
	@Column(name = "cantidad_producto")
	private int cantidadProducto;
	@Column(name = "fecha_registro")
	private Date fechaRegistro;
	@Column(name = "fecha_entrega")
	private Date fechaEntrega;
	@Column(name = "precio_envio")
	private double precioEnvio;
	@Column(name = "numero_guia")
	private String numeroGuia;
	@Column(name = "id_cliente")
	private int idCliente;
	@Column(name = "codigo_transporte")
	private int codigoTransporte;
	

}
