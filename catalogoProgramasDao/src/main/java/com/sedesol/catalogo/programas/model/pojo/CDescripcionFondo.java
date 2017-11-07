package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the C_DESCRIPCION_FONDO database table.
 * 
 */
@Entity
@Table(name="C_DESCRIPCION_FONDO")
@NamedQuery(name="CDescripcionFondo.findAll", query="SELECT c FROM CDescripcionFondo c")
public class CDescripcionFondo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_DESCRIPCION_FONDO_CSCDESCRIPCIONFONDO_GENERATOR", sequenceName="SEQ_CSC_DESCRIPCION_FONDO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_DESCRIPCION_FONDO_CSCDESCRIPCIONFONDO_GENERATOR")
	@Column(name="CSC_DESCRIPCION_FONDO")
	private long cscDescripcionFondo;

	@Column(name="CHR_CLAVE_FONDO")
	private String chrClaveFondo;

	@Column(name="CHR_CONTRIBUCION_FONDO_NACIONA")
	private String chrContribucionFondoNaciona;

	@Column(name="CHR_CVE_DEPENDENCIA_NACIONAL")
	private String chrCveDependenciaNacional;

	@Column(name="CHR_NOMBRE_DEPENDENCIA_NACIONA")
	private String chrNombreDependenciaNaciona;

	@Column(name="CHR_NOMBRE_FONDO")
	private String chrNombreFondo;

	@Column(name="CHR_POBLACION_OBJETIVO_FONDO")
	private String chrPoblacionObjetivoFondo;

	@Column(name="CHR_PROPOSITO_FONDO_NACIONAL")
	private String chrPropositoFondoNacional;

	@Column(name="PRESUPUESTO_FONDO_NACIONAL")
	private BigDecimal presupuestoFondoNacional;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to CIdentificadorEjecutorFondo
	/*@OneToMany(mappedBy="CDescripcionFondo")
	private List<CIdentificadorEjecutorFondo> CIdentificadorEjecutorFondos;

	//bi-directional many-to-one association to CVertiente
	@OneToMany(mappedBy="CDescripcionFondo")
	private List<CVertiente> CVertientes;

	//bi-directional many-to-one association to FondosEspeciale
	@OneToMany(mappedBy="CDescripcionFondo")
	private List<FondosEspeciale> fondosEspeciales;

	//bi-directional many-to-one association to FondosEspecialesRegAdhesion
	@OneToMany(mappedBy="CDescripcionFondo")
	private List<FondosEspecialesRegAdhesion> fondosEspecialesRegAdhesions;*/

	public CDescripcionFondo() {
	}

	public long getCscDescripcionFondo() {
		return this.cscDescripcionFondo;
	}

	public void setCscDescripcionFondo(long cscDescripcionFondo) {
		this.cscDescripcionFondo = cscDescripcionFondo;
	}

	public String getChrClaveFondo() {
		return this.chrClaveFondo;
	}

	public void setChrClaveFondo(String chrClaveFondo) {
		this.chrClaveFondo = chrClaveFondo;
	}

	public String getChrContribucionFondoNaciona() {
		return this.chrContribucionFondoNaciona;
	}

	public void setChrContribucionFondoNaciona(String chrContribucionFondoNaciona) {
		this.chrContribucionFondoNaciona = chrContribucionFondoNaciona;
	}

	public String getChrCveDependenciaNacional() {
		return this.chrCveDependenciaNacional;
	}

	public void setChrCveDependenciaNacional(String chrCveDependenciaNacional) {
		this.chrCveDependenciaNacional = chrCveDependenciaNacional;
	}

	public String getChrNombreDependenciaNaciona() {
		return this.chrNombreDependenciaNaciona;
	}

	public void setChrNombreDependenciaNaciona(String chrNombreDependenciaNaciona) {
		this.chrNombreDependenciaNaciona = chrNombreDependenciaNaciona;
	}

	public String getChrNombreFondo() {
		return this.chrNombreFondo;
	}

	public void setChrNombreFondo(String chrNombreFondo) {
		this.chrNombreFondo = chrNombreFondo;
	}

	public String getChrPoblacionObjetivoFondo() {
		return this.chrPoblacionObjetivoFondo;
	}

	public void setChrPoblacionObjetivoFondo(String chrPoblacionObjetivoFondo) {
		this.chrPoblacionObjetivoFondo = chrPoblacionObjetivoFondo;
	}

	public String getChrPropositoFondoNacional() {
		return this.chrPropositoFondoNacional;
	}

	public void setChrPropositoFondoNacional(String chrPropositoFondoNacional) {
		this.chrPropositoFondoNacional = chrPropositoFondoNacional;
	}

	public BigDecimal getPresupuestoFondoNacional() {
		return this.presupuestoFondoNacional;
	}

	public void setPresupuestoFondoNacional(BigDecimal presupuestoFondoNacional) {
		this.presupuestoFondoNacional = presupuestoFondoNacional;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}
/*
	public List<CIdentificadorEjecutorFondo> getCIdentificadorEjecutorFondos() {
		return this.CIdentificadorEjecutorFondos;
	}

	public void setCIdentificadorEjecutorFondos(List<CIdentificadorEjecutorFondo> CIdentificadorEjecutorFondos) {
		this.CIdentificadorEjecutorFondos = CIdentificadorEjecutorFondos;
	}

	public CIdentificadorEjecutorFondo addCIdentificadorEjecutorFondo(CIdentificadorEjecutorFondo CIdentificadorEjecutorFondo) {
		getCIdentificadorEjecutorFondos().add(CIdentificadorEjecutorFondo);
		CIdentificadorEjecutorFondo.setCDescripcionFondo(this);

		return CIdentificadorEjecutorFondo;
	}

	public CIdentificadorEjecutorFondo removeCIdentificadorEjecutorFondo(CIdentificadorEjecutorFondo CIdentificadorEjecutorFondo) {
		getCIdentificadorEjecutorFondos().remove(CIdentificadorEjecutorFondo);
		CIdentificadorEjecutorFondo.setCDescripcionFondo(null);

		return CIdentificadorEjecutorFondo;
	}

	public List<CVertiente> getCVertientes() {
		return this.CVertientes;
	}

	public void setCVertientes(List<CVertiente> CVertientes) {
		this.CVertientes = CVertientes;
	}

	public CVertiente addCVertiente(CVertiente CVertiente) {
		getCVertientes().add(CVertiente);
		CVertiente.setCDescripcionFondo(this);

		return CVertiente;
	}

	public CVertiente removeCVertiente(CVertiente CVertiente) {
		getCVertientes().remove(CVertiente);
		CVertiente.setCDescripcionFondo(null);

		return CVertiente;
	}

	public List<FondosEspeciale> getFondosEspeciales() {
		return this.fondosEspeciales;
	}

	public void setFondosEspeciales(List<FondosEspeciale> fondosEspeciales) {
		this.fondosEspeciales = fondosEspeciales;
	}

	public FondosEspeciale addFondosEspeciale(FondosEspeciale fondosEspeciale) {
		getFondosEspeciales().add(fondosEspeciale);
		fondosEspeciale.setCDescripcionFondo(this);

		return fondosEspeciale;
	}

	public FondosEspeciale removeFondosEspeciale(FondosEspeciale fondosEspeciale) {
		getFondosEspeciales().remove(fondosEspeciale);
		fondosEspeciale.setCDescripcionFondo(null);

		return fondosEspeciale;
	}

	public List<FondosEspecialesRegAdhesion> getFondosEspecialesRegAdhesions() {
		return this.fondosEspecialesRegAdhesions;
	}

	public void setFondosEspecialesRegAdhesions(List<FondosEspecialesRegAdhesion> fondosEspecialesRegAdhesions) {
		this.fondosEspecialesRegAdhesions = fondosEspecialesRegAdhesions;
	}

	public FondosEspecialesRegAdhesion addFondosEspecialesRegAdhesion(FondosEspecialesRegAdhesion fondosEspecialesRegAdhesion) {
		getFondosEspecialesRegAdhesions().add(fondosEspecialesRegAdhesion);
		fondosEspecialesRegAdhesion.setCDescripcionFondo(this);

		return fondosEspecialesRegAdhesion;
	}

	public FondosEspecialesRegAdhesion removeFondosEspecialesRegAdhesion(FondosEspecialesRegAdhesion fondosEspecialesRegAdhesion) {
		getFondosEspecialesRegAdhesions().remove(fondosEspecialesRegAdhesion);
		fondosEspecialesRegAdhesion.setCDescripcionFondo(null);

		return fondosEspecialesRegAdhesion;
	}*/

}