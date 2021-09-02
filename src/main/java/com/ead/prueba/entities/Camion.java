package com.ead.prueba.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

/*
 * Clase hija camion
 */
@Data
@Entity
@Table(name = "trans_camion")
@PrimaryKeyJoinColumn(referencedColumnName = "codigo")
public class Camion extends Transporte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "placa_vehiculo")
	private String placa_vehiculo;
	
}
