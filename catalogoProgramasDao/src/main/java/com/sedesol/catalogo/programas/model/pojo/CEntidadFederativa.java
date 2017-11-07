package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_ENTIDAD_FEDERATIVA database table.
 * 
 */
@Entity
@Table(name="C_ENTIDAD_FEDERATIVA")
@NamedQuery(name="CEntidadFederativa.findAll", query="SELECT c FROM CEntidadFederativa c")
public class CEntidadFederativa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_ENTIDAD_FEDERATIVA_CSCENTIDADFEDERATIVA_GENERATOR", sequenceName="SEQ_CSC_ENTIDAD_FEDERATIVA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_ENTIDAD_FEDERATIVA_CSCENTIDADFEDERATIVA_GENERATOR")
	@Column(name="CSC_ENTIDAD_FEDERATIVA")
	private long cscEntidadFederativa;

	@Column(name="CHR_ABREVIATURA")
	private String chrAbreviatura;

	@Column(name="CHR_DESCRIPCION_ENTIDAD_FED")
	private String chrDescripcionEntidadFed;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;
	
	@Column(name="CVE_ENTIDAD")
	private String cveEntidad;
	
	//bi-directional many-to-one association to CMunicipio
	@OneToMany(mappedBy="CEntidadFederativa")
	private List<CMunicipio> CMunicipios;

	//bi-directional many-to-one association to RegistroAdhesion
	@OneToMany(mappedBy="CEntidadFederativa")
	private List<RegistroAdhesion> registroAdhesions;

	public CEntidadFederativa() {
	}

	public long getCscEntidadFederativa() {
		return this.cscEntidadFederativa;
	}

	public void setCscEntidadFederativa(long cscEntidadFederativa) {
		this.cscEntidadFederativa = cscEntidadFederativa;
	}

	public String getCveEntidad() {
		return this.cveEntidad;
	}

	public void setCveEntidad(String cveEntidad) {
		this.cveEntidad = cveEntidad;
	}
	
	public String getChrAbreviatura() {
		return this.chrAbreviatura;
	}

	public void setChrAbreviatura(String chrAbreviatura) {
		this.chrAbreviatura = chrAbreviatura;
	}

	public String getChrDescripcionEntidadFed() {
		return this.chrDescripcionEntidadFed;
	}

	public void setChrDescripcionEntidadFed(String chrDescripcionEntidadFed) {
		this.chrDescripcionEntidadFed = chrDescripcionEntidadFed;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}
	
	public List<CMunicipio> getCMunicipios() {
		return this.CMunicipios;
	}

	public void setCMunicipios(List<CMunicipio> CMunicipios) {
		this.CMunicipios = CMunicipios;
	}

	public CMunicipio addCMunicipio(CMunicipio CMunicipio) {
		getCMunicipios().add(CMunicipio);
		CMunicipio.setCEntidadFederativa(this);

		return CMunicipio;
	}

	public CMunicipio removeCMunicipio(CMunicipio CMunicipio) {
		getCMunicipios().remove(CMunicipio);
		CMunicipio.setCEntidadFederativa(null);

		return CMunicipio;
	}

	public List<RegistroAdhesion> getRegistroAdhesions() {
		return this.registroAdhesions;
	}

	public void setRegistroAdhesions(List<RegistroAdhesion> registroAdhesions) {
		this.registroAdhesions = registroAdhesions;
	}

	public RegistroAdhesion addRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().add(registroAdhesion);
		registroAdhesion.setCEntidadFederativa(this);

		return registroAdhesion;
	}

	public RegistroAdhesion removeRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().remove(registroAdhesion);
		registroAdhesion.setCEntidadFederativa(null);

		return registroAdhesion;
	}

}