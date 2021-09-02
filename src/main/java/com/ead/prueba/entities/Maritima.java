package com.ead.prueba.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

/*
 * Clase hija maritima
 */
@Data
@Entity
@Table(name = "trans_maritima")
@PrimaryKeyJoinColumn(referencedColumnName = "codigo")
public class Maritima extends Transporte implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "numero_flota")
	private String numero_flota;
}
