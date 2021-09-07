package com.ead.prueba.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "productos")
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
	@Column(name = "id_cliente")
	private int idCliente;
	@Column(name = "id_logistica")
	private int idLogistica;

}
