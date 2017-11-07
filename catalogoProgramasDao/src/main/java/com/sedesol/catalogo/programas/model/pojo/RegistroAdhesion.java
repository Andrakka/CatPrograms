package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sedesol.catalogo.programas.model.serializer.CustomDateSerializer;

/**
 * The persistent class for the REGISTRO_ADHESION database table.
 * 
 */
@Entity
@Table(name="REGISTRO_ADHESION")
@NamedQuery(name="RegistroAdhesion.findAll", query="SELECT r FROM RegistroAdhesion r")
public class RegistroAdhesion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REGISTRO_ADHESION_CSCREGISTROADHESION_GENERATOR", sequenceName="SEQ_CSC_REGISTRO_ADHESION",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REGISTRO_ADHESION_CSCREGISTROADHESION_GENERATOR")
	@Column(name="CSC_REGISTRO_ADHESION")
	private long cscRegistroAdhesion;
	
	@Column(name="CHR_CVE_DEPENDENCIA")
	private String chrCveDependencia;

	@Column(name="CHR_CVE_UNIDAD_ADM")
	private String chrCveUnidadAdm;

	@Column(name="CHR_DESCRIPCION_DEPENDENCIA")
	private String chrDescripcionDependencia;

	@Column(name="CHR_OBSERVACIONES_REG_ADH")
	private String chrObservacionesRegAdh;
	
	@Column(name="CHR_UNIDAD_ADMINISTRATIVA")
	private String chrUnidadAdministrativa;

	@Temporal(TemporalType.DATE)
	@Column(name="FCH_REGISTRO_ADHESION")
	private Date fchRegistroAdhesion;

	@Column(name="INT_NUMERO_PROGRAMAS_SOCIALES")
	private BigDecimal intNumeroProgramasSociales;

	@Column(name="RA_FOLIO")
	private String raFolio;

	@Column(name="SN_ENTIDAD_NORMADA")
	private BigDecimal snEntidadNormada;

	@Column(name="SN_OPERA_PROGRAMAS_SOCIALES")
	private BigDecimal snOperaProgramasSociales;

	//bi-directional many-to-one association to DatosAdministrativo
	@OneToMany(mappedBy="registroAdhesion")
	@JsonIgnore
	private List<DatosAdministrativo> datosAdministrativos;

	//bi-directional many-to-one association to DatosContactoEnlTecnico
	/*@OneToMany(mappedBy="registroAdhesion")
	private List<DatosContactoEnlTecnico> datosContactoEnlTecnicos;*/

	//bi-directional many-to-one association to FondosEspeciale
	@OneToMany(mappedBy="registroAdhesion")
	private List<FondosEspeciale> fondosEspeciales;

	//bi-directional many-to-one association to InsumosRegistroAdhesion
	/*@OneToMany(mappedBy="registroAdhesion")
	private List<InsumosRegistroAdhesion> insumosRegistroAdhesions;*/

	//bi-directional many-to-one association to Convenio
	@ManyToOne
	@JoinColumn(name="CSC_CONVENIO_FK")
	private Convenio convenio;

	//bi-directional many-to-one association to CEntidadFederativa
	@ManyToOne 
	@JoinColumn(name="CSC_ENTIDAD_FEDERATIVA_FK")
	private CEntidadFederativa CEntidadFederativa;

	//bi-directional many-to-one association to CEstatusRa
	@ManyToOne
	@JoinColumn(name="CSC_ESTATUS_RA_FK")
	private CEstatusRa CEstatusRa;

	//bi-directional many-to-one association to CMunicipio
	@ManyToOne 
	@JoinColumn(name="CSC_MUNICIPIO_FK")
	private CMunicipio CMunicipio;

	//bi-directional many-to-one association to COrdenDeGobierno
	@ManyToOne
	@JoinColumn(name="CSC_ORDEN_DE_GOBIERNO_FK")
	private COrdenDeGobierno COrdenDeGobierno;

	//bi-directional many-to-one association to CUnidadAdministrativa
	@ManyToOne
	@JoinColumn(name="CSC_UNIDAD_ADMINISTRATIVA")
	private CUnidadAdministrativa CUnidadAdministrativa;

	//bi-directional many-to-one association to DatosContactoEnlace
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="CSC_DATOS_CONTACTO_ENLACE_FK")
	private DatosContactoEnlace datosContactoEnlace;

	//bi-directional many-to-one association to DatosContactoTitular
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="CSC_DATOS_CONTACTO_TITULAR_FK")
	private DatosContactoTitular datosContactoTitular;

	//bi-directional many-to-one association to RegistroAdhesionAutorizacion
	@OneToMany(mappedBy="registroAdhesion")
	private List<RegistroAdhesionAutorizacion> registroAdhesionAutorizacions;

	public RegistroAdhesion() {
	}

	public long getCscRegistroAdhesion() {
		return this.cscRegistroAdhesion;
	}

	public void setCscRegistroAdhesion(long cscRegistroAdhesion) {
		this.cscRegistroAdhesion = cscRegistroAdhesion;
	}

	public String getChrObservacionesRegAdh() {
		return this.chrObservacionesRegAdh;
	}

	public void setChrObservacionesRegAdh(String chrObservacionesRegAdh) {
		this.chrObservacionesRegAdh = chrObservacionesRegAdh;
	}
	
	public String getChrDescripcionDependencia() {
		return this.chrDescripcionDependencia;
	}

	public void setChrDescripcionDependencia(String chrDescripcionDependencia) {
		this.chrDescripcionDependencia = chrDescripcionDependencia;
	}
	
	public String getChrCveDependencia() {
		return this.chrCveDependencia;
	}

	public void setChrCveDependencia(String chrCveDependencia) {
		this.chrCveDependencia = chrCveDependencia;
	}
	
	public String getChrUnidadAdministrativa() {
		return this.chrUnidadAdministrativa;
	}

	public void setChrUnidadAdministrativa(String chrUnidadAdministrativa) {
		this.chrUnidadAdministrativa = chrUnidadAdministrativa;
	}
	
	public String getChrCveUnidadAdm() {
		return this.chrCveUnidadAdm;
	}

	public void setChrCveUnidadAdm(String chrCveUnidadAdm) {
		this.chrCveUnidadAdm = chrCveUnidadAdm;
	}


	public Date getFchRegistroAdhesion() {
		return this.fchRegistroAdhesion;
	}

	public void setFchRegistroAdhesion(Date fchRegistroAdhesion) {
		this.fchRegistroAdhesion = fchRegistroAdhesion;
	}

	public BigDecimal getIntNumeroProgramasSociales() {
		return this.intNumeroProgramasSociales;
	}

	public void setIntNumeroProgramasSociales(BigDecimal intNumeroProgramasSociales) {
		this.intNumeroProgramasSociales = intNumeroProgramasSociales;
	}

	public String getRaFolio() {
		return this.raFolio;
	}

	public void setRaFolio(String raFolio) {
		this.raFolio = raFolio;
	}

	public BigDecimal getSnEntidadNormada() {
		return this.snEntidadNormada;
	}

	public void setSnEntidadNormada(BigDecimal snEntidadNormada) {
		this.snEntidadNormada = snEntidadNormada;
	}

	public BigDecimal getSnOperaProgramasSociales() {
		return this.snOperaProgramasSociales;
	}

	public void setSnOperaProgramasSociales(BigDecimal snOperaProgramasSociales) {
		this.snOperaProgramasSociales = snOperaProgramasSociales;
	}

	public List<DatosAdministrativo> getDatosAdministrativos() {
		return this.datosAdministrativos;
	}

	public void setDatosAdministrativos(List<DatosAdministrativo> datosAdministrativos) {
		this.datosAdministrativos = datosAdministrativos;
	}

	public DatosAdministrativo addDatosAdministrativo(DatosAdministrativo datosAdministrativo) {
		getDatosAdministrativos().add(datosAdministrativo);
		datosAdministrativo.setRegistroAdhesion(this);

		return datosAdministrativo;
	}

	public DatosAdministrativo removeDatosAdministrativo(DatosAdministrativo datosAdministrativo) {
		getDatosAdministrativos().remove(datosAdministrativo);
		datosAdministrativo.setRegistroAdhesion(null);

		return datosAdministrativo;
	}

	/*public List<DatosContactoEnlTecnico> getDatosContactoEnlTecnicos() {
		return this.datosContactoEnlTecnicos;
	}

	public void setDatosContactoEnlTecnicos(List<DatosContactoEnlTecnico> datosContactoEnlTecnicos) {
		this.datosContactoEnlTecnicos = datosContactoEnlTecnicos;
	}

	public DatosContactoEnlTecnico addDatosContactoEnlTecnico(DatosContactoEnlTecnico datosContactoEnlTecnico) {
		getDatosContactoEnlTecnicos().add(datosContactoEnlTecnico);
		datosContactoEnlTecnico.setRegistroAdhesion(this);

		return datosContactoEnlTecnico;
	}

	public DatosContactoEnlTecnico removeDatosContactoEnlTecnico(DatosContactoEnlTecnico datosContactoEnlTecnico) {
		getDatosContactoEnlTecnicos().remove(datosContactoEnlTecnico);
		datosContactoEnlTecnico.setRegistroAdhesion(null);

		return datosContactoEnlTecnico;
	}
*/
	public List<FondosEspeciale> getFondosEspeciales() {
		return this.fondosEspeciales;
	}

	public void setFondosEspeciales(List<FondosEspeciale> fondosEspeciales) {
		this.fondosEspeciales = fondosEspeciales;
	}

	public FondosEspeciale addFondosEspeciale(FondosEspeciale fondosEspeciale) {
		getFondosEspeciales().add(fondosEspeciale);
		fondosEspeciale.setRegistroAdhesion(this);

		return fondosEspeciale;
	}

	public FondosEspeciale removeFondosEspeciale(FondosEspeciale fondosEspeciale) {
		getFondosEspeciales().remove(fondosEspeciale);
		fondosEspeciale.setRegistroAdhesion(null);

		return fondosEspeciale;
	}

/*	public List<InsumosRegistroAdhesion> getInsumosRegistroAdhesions() {
		return this.insumosRegistroAdhesions;
	}

	public void setInsumosRegistroAdhesions(List<InsumosRegistroAdhesion> insumosRegistroAdhesions) {
		this.insumosRegistroAdhesions = insumosRegistroAdhesions;
	}

	public InsumosRegistroAdhesion addInsumosRegistroAdhesion(InsumosRegistroAdhesion insumosRegistroAdhesion) {
		getInsumosRegistroAdhesions().add(insumosRegistroAdhesion);
		insumosRegistroAdhesion.setRegistroAdhesion(this);

		return insumosRegistroAdhesion;
	}

	public InsumosRegistroAdhesion removeInsumosRegistroAdhesion(InsumosRegistroAdhesion insumosRegistroAdhesion) {
		getInsumosRegistroAdhesions().remove(insumosRegistroAdhesion);
		insumosRegistroAdhesion.setRegistroAdhesion(null);

		return insumosRegistroAdhesion;
	}*/

	public Convenio getConvenio() {
		return this.convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public CEntidadFederativa getCEntidadFederativa() {
		return this.CEntidadFederativa;
	}

	public void setCEntidadFederativa(CEntidadFederativa CEntidadFederativa) {
		this.CEntidadFederativa = CEntidadFederativa;
	}

	public CEstatusRa getCEstatusRa() {
		return this.CEstatusRa;
	}

	public void setCEstatusRa(CEstatusRa CEstatusRa) {
		this.CEstatusRa = CEstatusRa;
	}

	public CMunicipio getCMunicipio() {
		return this.CMunicipio;
	}

	public void setCMunicipio(CMunicipio CMunicipio) {
		this.CMunicipio = CMunicipio;
	}

	public COrdenDeGobierno getCOrdenDeGobierno() {
		return this.COrdenDeGobierno;
	}

	public void setCOrdenDeGobierno(COrdenDeGobierno COrdenDeGobierno) {
		this.COrdenDeGobierno = COrdenDeGobierno;
	}

	public CUnidadAdministrativa getCUnidadAdministrativa() {
		return this.CUnidadAdministrativa;
	}

	public void setCUnidadAdministrativa(CUnidadAdministrativa CUnidadAdministrativa) {
		this.CUnidadAdministrativa = CUnidadAdministrativa;
	}

	public DatosContactoEnlace getDatosContactoEnlace() {
		return this.datosContactoEnlace;
	}

	public void setDatosContactoEnlace(DatosContactoEnlace datosContactoEnlace) {
		this.datosContactoEnlace = datosContactoEnlace;
	}

	public DatosContactoTitular getDatosContactoTitular() {
		return this.datosContactoTitular;
	}

	public void setDatosContactoTitular(DatosContactoTitular datosContactoTitular) {
		this.datosContactoTitular = datosContactoTitular;
	}

	public List<RegistroAdhesionAutorizacion> getRegistroAdhesionAutorizacions() {
		return this.registroAdhesionAutorizacions;
	}

	public void setRegistroAdhesionAutorizacions(List<RegistroAdhesionAutorizacion> registroAdhesionAutorizacions) {
		this.registroAdhesionAutorizacions = registroAdhesionAutorizacions;
	}

	public RegistroAdhesionAutorizacion addRegistroAdhesionAutorizacion(RegistroAdhesionAutorizacion registroAdhesionAutorizacion) {
		getRegistroAdhesionAutorizacions().add(registroAdhesionAutorizacion);
		registroAdhesionAutorizacion.setRegistroAdhesion(this);

		return registroAdhesionAutorizacion;
	}

	public RegistroAdhesionAutorizacion removeRegistroAdhesionAutorizacion(RegistroAdhesionAutorizacion registroAdhesionAutorizacion) {
		getRegistroAdhesionAutorizacions().remove(registroAdhesionAutorizacion);
		registroAdhesionAutorizacion.setRegistroAdhesion(null);

		return registroAdhesionAutorizacion;
	}

}