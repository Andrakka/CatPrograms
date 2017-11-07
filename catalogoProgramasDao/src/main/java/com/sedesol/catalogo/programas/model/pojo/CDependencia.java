package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_DEPENDENCIA database table.
 * 
 */
@Entity
@Table(name="C_DEPENDENCIA")
@NamedQuery(name="CDependencia.findAll", query="SELECT c FROM CDependencia c")
public class CDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_DEPENDENCIA_CSCDEPENDENCIA_GENERATOR", sequenceName="SEQ_CSC_DEPENDENCIA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_DEPENDENCIA_CSCDEPENDENCIA_GENERATOR")
	@Column(name="CSC_DEPENDENCIA")
	private long cscDependencia;

	@Column(name="CHR_ABREVIATURA")
	private String chrAbreviatura;

	@Column(name="CHR_CVE_DEPENDENCIA")
	private String chrCveDependencia;

	@Column(name="CHR_IDENTIFICADOR")
	private String chrIdentificador;

	@Column(name="CHR_NOMBRE_DEPENDENCIA")
	private String chrNombreDependencia;

	@Column(name="RAMO_PRESUPUESTAL")
	private String ramoPresupuestal;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	
	//bi-directional many-to-one association to CMunicipio
	/*@OneToMany(mappedBy="CDependencia")
	private List<CMunicipio> CMunicipios;*/

	//bi-directional many-to-one association to CUnidadAdministrativa
	@OneToMany(mappedBy="CDependencia")
	private List<CUnidadAdministrativa> CUnidadAdministrativas;

	//bi-directional many-to-one association to ProgramaCuap
	@OneToMany(mappedBy="CDependencia")
	private List<ProgramaCuap> programaCuaps;
	

	public CDependencia() {
	}

	public long getCscDependencia() {
		return this.cscDependencia;
	}

	public void setCscDependencia(long cscDependencia) {
		this.cscDependencia = cscDependencia;
	}

	public String getChrAbreviatura() {
		return this.chrAbreviatura;
	}

	public void setChrAbreviatura(String chrAbreviatura) {
		this.chrAbreviatura = chrAbreviatura;
	}

	public String getChrCveDependencia() {
		return this.chrCveDependencia;
	}

	public void setChrCveDependencia(String chrCveDependencia) {
		this.chrCveDependencia = chrCveDependencia;
	}

	public String getChrIdentificador() {
		return this.chrIdentificador;
	}

	public void setChrIdentificador(String chrIdentificador) {
		this.chrIdentificador = chrIdentificador;
	}

	public String getChrNombreDependencia() {
		return this.chrNombreDependencia;
	}

	public void setChrNombreDependencia(String chrNombreDependencia) {
		this.chrNombreDependencia = chrNombreDependencia;
	}
	
	public String getRamoPresupuestal() {
		return this.ramoPresupuestal;
	}

	public void setRamoPresupuestal(String ramoPresupuestal) {
		this.ramoPresupuestal = ramoPresupuestal;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}
	
	
	/*public List<CMunicipio> getCMunicipios() {
		return this.CMunicipios;
	}

	public void setCMunicipios(List<CMunicipio> CMunicipios) {
		this.CMunicipios = CMunicipios;
	}*/

	/*public CMunicipio addCMunicipio(CMunicipio CMunicipio) {
		getCMunicipios().add(CMunicipio);
		CMunicipio.setCDependencia(this);

		return CMunicipio;
	}

	public CMunicipio removeCMunicipio(CMunicipio CMunicipio) {
		getCMunicipios().remove(CMunicipio);
		CMunicipio.setCDependencia(null);

		return CMunicipio;
	}*/

	public List<CUnidadAdministrativa> getCUnidadAdministrativas() {
		return this.CUnidadAdministrativas;
	}

	public void setCUnidadAdministrativas(List<CUnidadAdministrativa> CUnidadAdministrativas) {
		this.CUnidadAdministrativas = CUnidadAdministrativas;
	}

	public CUnidadAdministrativa addCUnidadAdministrativa(CUnidadAdministrativa CUnidadAdministrativa) {
		getCUnidadAdministrativas().add(CUnidadAdministrativa);
		CUnidadAdministrativa.setCDependencia(this);

		return CUnidadAdministrativa;
	}

	public CUnidadAdministrativa removeCUnidadAdministrativa(CUnidadAdministrativa CUnidadAdministrativa) {
		getCUnidadAdministrativas().remove(CUnidadAdministrativa);
		CUnidadAdministrativa.setCDependencia(null);

		return CUnidadAdministrativa;
	}

	public List<ProgramaCuap> getProgramaCuaps() {
		return this.programaCuaps;
	}

	public void setProgramaCuaps(List<ProgramaCuap> programaCuaps) {
		this.programaCuaps = programaCuaps;
	}

	public ProgramaCuap addProgramaCuap(ProgramaCuap programaCuap) {
		getProgramaCuaps().add(programaCuap);
		programaCuap.setCDependencia(this);

		return programaCuap;
	}

	public ProgramaCuap removeProgramaCuap(ProgramaCuap programaCuap) {
		getProgramaCuaps().remove(programaCuap);
		programaCuap.setCDependencia(null);

		return programaCuap;
	}
}