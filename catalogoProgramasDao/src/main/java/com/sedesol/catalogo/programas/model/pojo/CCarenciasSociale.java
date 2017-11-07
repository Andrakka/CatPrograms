package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the C_CARENCIAS_SOCIALES database table.
 * 
 */
@Entity
@Table(name="C_CARENCIAS_SOCIALES")
@NamedQuery(name="CCarenciasSociale.findAll", query="SELECT c FROM CCarenciasSociale c")
public class CCarenciasSociale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_CARENCIAS_SOCIALES_CSCCARENCIASSOCIALES_GENERATOR", sequenceName="SEQ_CSC_CARENCIAS_SOCIALES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_CARENCIAS_SOCIALES_CSCCARENCIASSOCIALES_GENERATOR")
	@Column(name="CSC_CARENCIAS_SOCIALES")
	private long cscCarenciasSociales;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACEPTA")
	private BigDecimal snAcepta;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to ProyectosCarenciasSociale
	/*@OneToMany(mappedBy="CCarenciasSociale")
	private List<ProyectosCarenciasSociale> proyectosCarenciasSociales;*/

	public CCarenciasSociale() {
	}

	public long getCscCarenciasSociales() {
		return this.cscCarenciasSociales;
	}

	public void setCscCarenciasSociales(long cscCarenciasSociales) {
		this.cscCarenciasSociales = cscCarenciasSociales;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	public BigDecimal getSnAcepta() {
		return this.snAcepta;
	}

	public void setSnAcepta(BigDecimal snAcepta) {
		this.snAcepta = snAcepta;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}
	
	/*
	public List<ProyectosCarenciasSociale> getProyectosCarenciasSociales() {
		return this.proyectosCarenciasSociales;
	}

	public void setProyectosCarenciasSociales(List<ProyectosCarenciasSociale> proyectosCarenciasSociales) {
		this.proyectosCarenciasSociales = proyectosCarenciasSociales;
	}

	public ProyectosCarenciasSociale addProyectosCarenciasSociale(ProyectosCarenciasSociale proyectosCarenciasSociale) {
		getProyectosCarenciasSociales().add(proyectosCarenciasSociale);
		proyectosCarenciasSociale.setCCarenciasSociale(this);

		return proyectosCarenciasSociale;
	}

	public ProyectosCarenciasSociale removeProyectosCarenciasSociale(ProyectosCarenciasSociale proyectosCarenciasSociale) {
		getProyectosCarenciasSociales().remove(proyectosCarenciasSociale);
		proyectosCarenciasSociale.setCCarenciasSociale(null);

		return proyectosCarenciasSociale;
	} */

}