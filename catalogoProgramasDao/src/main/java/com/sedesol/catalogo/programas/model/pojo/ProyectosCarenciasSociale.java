package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PROYECTOS_CARENCIAS_SOCIALES database table.
 * 
 */
@Entity
@Table(name="PROYECTOS_CARENCIAS_SOCIALES")
@NamedQuery(name="ProyectosCarenciasSociale.findAll", query="SELECT p FROM ProyectosCarenciasSociale p")
public class ProyectosCarenciasSociale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROYECTOS_CARENCIAS_SOCIALES_CSCPROYECTOSCAR_GENERATOR", sequenceName="SEQ_CSC_PROYECTOS_CAR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROYECTOS_CARENCIAS_SOCIALES_CSCPROYECTOSCAR_GENERATOR")
	@Column(name="CSC_PROYECTOS_CAR")
	private long cscProyectosCar;

	@Column(name="SN_ACEPTA")
	private BigDecimal snAcepta;

	//bi-directional many-to-one association to CCarenciasSociale
	@ManyToOne
	@JoinColumn(name="CSC_CARENCIAS_SOCIALES_FK")
	private CCarenciasSociale CCarenciasSociale;

	//bi-directional many-to-one association to Proyecto
	@ManyToOne
	@JoinColumn(name="CSC_PROYECTOS_FONDOS_FK")
	private Proyecto proyecto;

	public ProyectosCarenciasSociale() {
	}

	public long getCscProyectosCar() {
		return this.cscProyectosCar;
	}

	public void setCscProyectosCar(long cscProyectosCar) {
		this.cscProyectosCar = cscProyectosCar;
	}

	public BigDecimal getSnAcepta() {
		return this.snAcepta;
	}

	public void setSnAcepta(BigDecimal snAcepta) {
		this.snAcepta = snAcepta;
	}

	public CCarenciasSociale getCCarenciasSociale() {
		return this.CCarenciasSociale;
	}

	public void setCCarenciasSociale(CCarenciasSociale CCarenciasSociale) {
		this.CCarenciasSociale = CCarenciasSociale;
	}

	public Proyecto getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

}