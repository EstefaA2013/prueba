package com.ead.prueba.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

/*
 * Clase padre
 */

@Data
@Entity
@Table(name = "transporte")
@Inheritance(strategy = InheritanceType.JOINED)
public class Transporte implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "numero_guia")
	private String numero_guia;
}
