package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_MUNICIPIO database table.
 * 
 */
@Entity
@Table(name="C_MUNICIPIO")
@NamedQuery(name="CMunicipio.findAll", query="SELECT c FROM CMunicipio c")
public class CMunicipio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="C_MUNICIPIO_CSCMUNICIPIO_GENERATOR", sequenceName="SEQ_CSC_MUNICIPIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_MUNICIPIO_CSCMUNICIPIO_GENERATOR")
	@Column(name="CSC_MUNICIPIO")
	private long cscMunicipio;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="CVE_MUNICIPIO")
	private BigDecimal cveMunicipio;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to CDependencia
	/*@ManyToOne
	@JoinColumn(name="CVE_ESTADO_FK")
	private CDependencia CDependencia;*/

	//bi-directional many-to-one association to CEntidadFederativa
	@ManyToOne
	@JoinColumn(name="CVE_ESTADO_FK")
	private CEntidadFederativa CEntidadFederativa;

	//bi-directional many-to-one association to RegistroAdhesion
	@OneToMany(mappedBy="CMunicipio")
	private List<RegistroAdhesion> registroAdhesions;

	
	public CMunicipio() {
	}

	public long getCscMunicipio() {
		return this.cscMunicipio;
	}

	public void setCscMunicipio(long cscMunicipio) {
		this.cscMunicipio = cscMunicipio;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	public BigDecimal getCveMunicipio() {
		return this.cveMunicipio;
	}

	public void setCveMunicipio(BigDecimal cveMunicipio) {
		this.cveMunicipio = cveMunicipio;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}

	/*public CDependencia getCDependencia() {
		return this.CDependencia;
	}

	public void setCDependencia(CDependencia CDependencia) {
		this.CDependencia = CDependencia;
	}*/

	public CEntidadFederativa getCEntidadFederativa() {
		return this.CEntidadFederativa;
	}

	public void setCEntidadFederativa(CEntidadFederativa CEntidadFederativa) {
		this.CEntidadFederativa = CEntidadFederativa;
	}

	public List<RegistroAdhesion> getRegistroAdhesions() {
		return this.registroAdhesions;
	}

	public void setRegistroAdhesions(List<RegistroAdhesion> registroAdhesions) {
		this.registroAdhesions = registroAdhesions;
	}

	public RegistroAdhesion addRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().add(registroAdhesion);
		registroAdhesion.setCMunicipio(this);

		return registroAdhesion;
	}

	public RegistroAdhesion removeRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().remove(registroAdhesion);
		registroAdhesion.setCMunicipio(null);

		return registroAdhesion;
	}
}