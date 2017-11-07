package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PROYECTOS_DERECHOS_SOCIALES database table.
 * 
 */
@Entity
@Table(name="PROYECTOS_DERECHOS_SOCIALES")
@NamedQuery(name="ProyectosDerechosSociale.findAll", query="SELECT p FROM ProyectosDerechosSociale p")
public class ProyectosDerechosSociale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROYECTOS_DERECHOS_SOCIALES_CSCDERECHOSSOCIALES_GENERATOR", sequenceName="SEQ_CSC_DERECHOS_SOCIALES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROYECTOS_DERECHOS_SOCIALES_CSCDERECHOSSOCIALES_GENERATOR")
	@Column(name="CSC_DERECHOS_SOCIALES")
	private long cscDerechosSociales;

	@Column(name="SN_ACEPTA")
	private BigDecimal snAcepta;

	//bi-directional many-to-one association to CDerSocialBieEco
	@ManyToOne
	@JoinColumn(name="CSC_DER_SOCIAL_FK")
	private CDerSocialBieEco CDerSocialBieEco;

	//bi-directional many-to-one association to Proyecto
	@ManyToOne
	@JoinColumn(name="CSC_PROYECTOS_FONDOS_FK")
	private Proyecto proyecto;

	public ProyectosDerechosSociale() {
	}

	public long getCscDerechosSociales() {
		return this.cscDerechosSociales;
	}

	public void setCscDerechosSociales(long cscDerechosSociales) {
		this.cscDerechosSociales = cscDerechosSociales;
	}

	public BigDecimal getSnAcepta() {
		return this.snAcepta;
	}

	public void setSnAcepta(BigDecimal snAcepta) {
		this.snAcepta = snAcepta;
	}

	public CDerSocialBieEco getCDerSocialBieEco() {
		return this.CDerSocialBieEco;
	}

	public void setCDerSocialBieEco(CDerSocialBieEco CDerSocialBieEco) {
		this.CDerSocialBieEco = CDerSocialBieEco;
	}

	public Proyecto getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

}