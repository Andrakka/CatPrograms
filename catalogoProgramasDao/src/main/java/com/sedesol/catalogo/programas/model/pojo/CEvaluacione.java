package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_EVALUACIONES database table.
 * 
 */
@Entity
@Table(name="C_EVALUACIONES")
@NamedQuery(name="CEvaluacione.findAll", query="SELECT c FROM CEvaluacione c")
public class CEvaluacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_EVALUACIONES_CSCEVALUACIONES_GENERATOR", sequenceName="SEQ_CSC_EVALUACIONES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_EVALUACIONES_CSCEVALUACIONES_GENERATOR")
	@Column(name="CSC_EVALUACIONES")
	private long cscEvaluaciones;

	private BigDecimal anio;

	@Column(name="CVE_PP")
	private String cvePp;

	@Column(name="CVE_RAMO")
	private String cveRamo;

	private String liga;

	private String programa;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	private String tema;

	@Column(name="TIPO_EVALUACION")
	private String tipoEvaluacion;

	//bi-directional many-to-one association to DetallePrograma
	@OneToMany(mappedBy="CEvaluacione")
	private List<DetallePrograma> detalleProgramas;

	public CEvaluacione() {
	}

	public long getCscEvaluaciones() {
		return this.cscEvaluaciones;
	}

	public void setCscEvaluaciones(long cscEvaluaciones) {
		this.cscEvaluaciones = cscEvaluaciones;
	}

	public BigDecimal getAnio() {
		return this.anio;
	}

	public void setAnio(BigDecimal anio) {
		this.anio = anio;
	}

	public String getCvePp() {
		return this.cvePp;
	}

	public void setCvePp(String cvePp) {
		this.cvePp = cvePp;
	}

	public String getCveRamo() {
		return this.cveRamo;
	}

	public void setCveRamo(String cveRamo) {
		this.cveRamo = cveRamo;
	}

	public String getLiga() {
		return this.liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}

	public String getPrograma() {
		return this.programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}

	public String getTema() {
		return this.tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getTipoEvaluacion() {
		return this.tipoEvaluacion;
	}

	public void setTipoEvaluacion(String tipoEvaluacion) {
		this.tipoEvaluacion = tipoEvaluacion;
	}

	public List<DetallePrograma> getDetalleProgramas() {
		return this.detalleProgramas;
	}

	public void setDetalleProgramas(List<DetallePrograma> detalleProgramas) {
		this.detalleProgramas = detalleProgramas;
	}

	public DetallePrograma addDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().add(detallePrograma);
		detallePrograma.setCEvaluacione(this);

		return detallePrograma;
	}

	public DetallePrograma removeDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().remove(detallePrograma);
		detallePrograma.setCEvaluacione(null);

		return detallePrograma;
	}

}