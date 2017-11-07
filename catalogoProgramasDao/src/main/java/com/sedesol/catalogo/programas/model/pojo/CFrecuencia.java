package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_FRECUENCIA database table.
 * 
 */
@Entity
@Table(name="C_FRECUENCIA")
@NamedQuery(name="CFrecuencia.findAll", query="SELECT c FROM CFrecuencia c")
public class CFrecuencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_FRECUENCIA_CSCFRECUENCIA_GENERATOR", sequenceName="SEQ_CSC_FRECUENCIA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_FRECUENCIA_CSCFRECUENCIA_GENERATOR")
	@Column(name="CSC_FRECUENCIA")
	private long cscFrecuencia;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	/*
	//bi-directional many-to-one association to RegistrosAdministrativo
	@OneToMany(mappedBy="CFrecuencia")
	private List<RegistrosAdministrativo> registrosAdministrativos;*/

	public CFrecuencia() {
	}

	public long getCscFrecuencia() {
		return this.cscFrecuencia;
	}

	public void setCscFrecuencia(long cscFrecuencia) {
		this.cscFrecuencia = cscFrecuencia;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}

	/*
	public List<RegistrosAdministrativo> getRegistrosAdministrativos() {
		return this.registrosAdministrativos;
	}

	public void setRegistrosAdministrativos(List<RegistrosAdministrativo> registrosAdministrativos) {
		this.registrosAdministrativos = registrosAdministrativos;
	}

	public RegistrosAdministrativo addRegistrosAdministrativo(RegistrosAdministrativo registrosAdministrativo) {
		getRegistrosAdministrativos().add(registrosAdministrativo);
		registrosAdministrativo.setCFrecuencia(this);

		return registrosAdministrativo;
	}

	public RegistrosAdministrativo removeRegistrosAdministrativo(RegistrosAdministrativo registrosAdministrativo) {
		getRegistrosAdministrativos().remove(registrosAdministrativo);
		registrosAdministrativo.setCFrecuencia(null);

		return registrosAdministrativo;
	}*/

}