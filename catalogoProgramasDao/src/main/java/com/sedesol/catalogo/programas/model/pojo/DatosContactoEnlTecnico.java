package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DATOS_CONTACTO_ENL_TECNICO database table.
 * 
 */
@Entity
@Table(name="DATOS_CONTACTO_ENL_TECNICO")
@NamedQuery(name="DatosContactoEnlTecnico.findAll", query="SELECT d FROM DatosContactoEnlTecnico d")
public class DatosContactoEnlTecnico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DATOS_CONTACTO_ENL_TECNICO_CSCCONTACTOENLACETEC_GENERATOR", sequenceName="SEQ_CSC_CONTACTO_ENLACE_TEC",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATOS_CONTACTO_ENL_TECNICO_CSCCONTACTOENLACETEC_GENERATOR")
	@Column(name="CSC_CONTACTO_ENLACE_TEC")
	private long cscContactoEnlaceTec;

	@Column(name="CHR_CARGO_CON_ENL_TECNICO")
	private String chrCargoConEnlTecnico;

	@Column(name="CHR_EMAIL_CON_ENL_TECNICO")
	private String chrEmailConEnlTecnico;

	@Column(name="CHR_EXTENSION_CON_ENL_TECNICO")
	private String chrExtensionConEnlTecnico;

	@Column(name="CHR_NOMBRE_CON_ENL_TECNICO")
	private String chrNombreConEnlTecnico;

	@Column(name="CHR_TELEFONO_CON_ENL_TEC")
	private String chrTelefonoConEnlTec;

	@Column(name="SN_INF_GEOESPACIAL_CON_ENL_TEC")
	private BigDecimal snInfGeoespacialConEnlTec;

	@Column(name="SN_INFO_SOCIO_CON_ENL_TECNICO")
	private BigDecimal snInfoSocioConEnlTecnico;

	@Column(name="SN_INTEGRACION_PAD_CON_ENL_TEC")
	private BigDecimal snIntegracionPadConEnlTec;

	//bi-directional many-to-one association to RegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_REGISTRO_ADHESION_FK")
	private RegistroAdhesion registroAdhesion;

	public DatosContactoEnlTecnico() {
	}

	public long getCscContactoEnlaceTec() {
		return this.cscContactoEnlaceTec;
	}

	public void setCscContactoEnlaceTec(long cscContactoEnlaceTec) {
		this.cscContactoEnlaceTec = cscContactoEnlaceTec;
	}

	public String getChrCargoConEnlTecnico() {
		return this.chrCargoConEnlTecnico;
	}

	public void setChrCargoConEnlTecnico(String chrCargoConEnlTecnico) {
		this.chrCargoConEnlTecnico = chrCargoConEnlTecnico;
	}

	public String getChrEmailConEnlTecnico() {
		return this.chrEmailConEnlTecnico;
	}

	public void setChrEmailConEnlTecnico(String chrEmailConEnlTecnico) {
		this.chrEmailConEnlTecnico = chrEmailConEnlTecnico;
	}

	public String getChrExtensionConEnlTecnico() {
		return this.chrExtensionConEnlTecnico;
	}

	public void setChrExtensionConEnlTecnico(String chrExtensionConEnlTecnico) {
		this.chrExtensionConEnlTecnico = chrExtensionConEnlTecnico;
	}

	public String getChrNombreConEnlTecnico() {
		return this.chrNombreConEnlTecnico;
	}

	public void setChrNombreConEnlTecnico(String chrNombreConEnlTecnico) {
		this.chrNombreConEnlTecnico = chrNombreConEnlTecnico;
	}

	public String getChrTelefonoConEnlTec() {
		return this.chrTelefonoConEnlTec;
	}

	public void setChrTelefonoConEnlTec(String chrTelefonoConEnlTec) {
		this.chrTelefonoConEnlTec = chrTelefonoConEnlTec;
	}

	public BigDecimal getSnInfGeoespacialConEnlTec() {
		return this.snInfGeoespacialConEnlTec;
	}

	public void setSnInfGeoespacialConEnlTec(BigDecimal snInfGeoespacialConEnlTec) {
		this.snInfGeoespacialConEnlTec = snInfGeoespacialConEnlTec;
	}

	public BigDecimal getSnInfoSocioConEnlTecnico() {
		return this.snInfoSocioConEnlTecnico;
	}

	public void setSnInfoSocioConEnlTecnico(BigDecimal snInfoSocioConEnlTecnico) {
		this.snInfoSocioConEnlTecnico = snInfoSocioConEnlTecnico;
	}

	public BigDecimal getSnIntegracionPadConEnlTec() {
		return this.snIntegracionPadConEnlTec;
	}

	public void setSnIntegracionPadConEnlTec(BigDecimal snIntegracionPadConEnlTec) {
		this.snIntegracionPadConEnlTec = snIntegracionPadConEnlTec;
	}

	public RegistroAdhesion getRegistroAdhesion() {
		return this.registroAdhesion;
	}

	public void setRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		this.registroAdhesion = registroAdhesion;
	}

}