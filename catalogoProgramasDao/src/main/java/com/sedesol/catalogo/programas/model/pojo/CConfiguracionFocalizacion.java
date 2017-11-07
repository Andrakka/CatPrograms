package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_CONFIGURACION_FOCALIZACION database table.
 * 
 */
@Entity
@Table(name="C_CONFIGURACION_FOCALIZACION")
@NamedQuery(name="CConfiguracionFocalizacion.findAll", query="SELECT c FROM CConfiguracionFocalizacion c")
public class CConfiguracionFocalizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_CONFIGURACION_FOCALIZACION_CSCCONFIGURACIONFOC_GENERATOR", sequenceName="SEQ_CSC_CONFIGURACION_FOC")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_CONFIGURACION_FOCALIZACION_CSCCONFIGURACIONFOC_GENERATOR")
	@Column(name="CSC_CONFIGURACION_FOC")
	private long cscConfiguracionFoc;

	@Column(name="CODIFICACION_SINTAXIS")
	private String codificacionSintaxis;

	@Column(name="NIVEL_1_DESCRIPCION")
	private String nivel1Descripcion;

	@Column(name="NIVEL_2_DESCRIPCION")
	private String nivel2Descripcion;

	@Column(name="NIVEL_3_DESCRIPCION")
	private String nivel3Descripcion;

	@Column(name="NIVEL_4_DESCRIPCION")
	private String nivel4Descripcion;

	private BigDecimal niveles;

	@Column(name="RESUMEN_NARRATIVO")
	private String resumenNarrativo;

	//bi-directional many-to-one association to CNivelCero
	@ManyToOne
	@JoinColumn(name="CSC_C_NIVEL_CERO_FK")
	private CNivelCero CNivelCero;

	//bi-directional many-to-one association to MatrizFocalizacion
	@OneToMany(mappedBy="CConfiguracionFocalizacion")
	private List<MatrizFocalizacion> matrizFocalizacions;

	public CConfiguracionFocalizacion() {
	}

	public long getCscConfiguracionFoc() {
		return this.cscConfiguracionFoc;
	}

	public void setCscConfiguracionFoc(long cscConfiguracionFoc) {
		this.cscConfiguracionFoc = cscConfiguracionFoc;
	}

	public String getCodificacionSintaxis() {
		return this.codificacionSintaxis;
	}

	public void setCodificacionSintaxis(String codificacionSintaxis) {
		this.codificacionSintaxis = codificacionSintaxis;
	}

	public String getNivel1Descripcion() {
		return this.nivel1Descripcion;
	}

	public void setNivel1Descripcion(String nivel1Descripcion) {
		this.nivel1Descripcion = nivel1Descripcion;
	}

	public String getNivel2Descripcion() {
		return this.nivel2Descripcion;
	}

	public void setNivel2Descripcion(String nivel2Descripcion) {
		this.nivel2Descripcion = nivel2Descripcion;
	}

	public String getNivel3Descripcion() {
		return this.nivel3Descripcion;
	}

	public void setNivel3Descripcion(String nivel3Descripcion) {
		this.nivel3Descripcion = nivel3Descripcion;
	}

	public String getNivel4Descripcion() {
		return this.nivel4Descripcion;
	}

	public void setNivel4Descripcion(String nivel4Descripcion) {
		this.nivel4Descripcion = nivel4Descripcion;
	}

	public BigDecimal getNiveles() {
		return this.niveles;
	}

	public void setNiveles(BigDecimal niveles) {
		this.niveles = niveles;
	}

	public String getResumenNarrativo() {
		return this.resumenNarrativo;
	}

	public void setResumenNarrativo(String resumenNarrativo) {
		this.resumenNarrativo = resumenNarrativo;
	}

	public CNivelCero getCNivelCero() {
		return this.CNivelCero;
	}

	public void setCNivelCero(CNivelCero CNivelCero) {
		this.CNivelCero = CNivelCero;
	}

	public List<MatrizFocalizacion> getMatrizFocalizacions() {
		return this.matrizFocalizacions;
	}

	public void setMatrizFocalizacions(List<MatrizFocalizacion> matrizFocalizacions) {
		this.matrizFocalizacions = matrizFocalizacions;
	}

	public MatrizFocalizacion addMatrizFocalizacion(MatrizFocalizacion matrizFocalizacion) {
		getMatrizFocalizacions().add(matrizFocalizacion);
		matrizFocalizacion.setCConfiguracionFocalizacion(this);

		return matrizFocalizacion;
	}

	public MatrizFocalizacion removeMatrizFocalizacion(MatrizFocalizacion matrizFocalizacion) {
		getMatrizFocalizacions().remove(matrizFocalizacion);
		matrizFocalizacion.setCConfiguracionFocalizacion(null);

		return matrizFocalizacion;
	}

}