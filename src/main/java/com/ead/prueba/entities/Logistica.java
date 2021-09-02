package com.ead.prueba.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "logistica")
public class Logistica implements Serializable {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "fecha_registro")
	private Date fechaRegistro;
	@Column(name = "fecha_entrega")
	private Date fechaEntrega;
	@Column(name = "precio_envio")
	private double precioEnvio;
	@ManyToOne
	@JoinColumn(name = "codigo_transporte")
	private Transporte transporte;
	@Column(name = "descuento")
	private double descuento;
	
}
