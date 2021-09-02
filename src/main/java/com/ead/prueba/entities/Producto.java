package com.ead.prueba.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@Column(name = "cantidad_ producto")
	private int cantidadProducto;
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "id_logistica")
	private Logistica logistica;

}

