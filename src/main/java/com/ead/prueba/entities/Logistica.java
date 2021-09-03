package com.ead.prueba.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "logisticas")
public class Logistica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "fecha_registro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;
	@Column(name = "fecha_entrega")
	private Date fechaEntrega;
	@Column(name = "precio_envio")
	private double precioEnvio;
	@OneToOne
	@MapsId
	@JoinColumn(name = "codigo_transporte")
	private Transporte transporte;
	@Column(name = "descuento")
	private double descuento;
	
	
	@PrePersist
	public void prePersist() {
		this.fechaRegistro = new Date();
	}
}
