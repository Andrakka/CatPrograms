package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the C_DER_SOCIAL_BIE_ECO database table.
 * 
 */
@Entity
@Table(name="C_DER_SOCIAL_BIE_ECO")
@NamedQuery(name="CDerSocialBieEco.findAll", query="SELECT c FROM CDerSocialBieEco c")
public class CDerSocialBieEco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_DER_SOCIAL_BIE_ECO_CSCDERSOCIAL_GENERATOR", sequenceName="SEQ_CSC_DER_SOCIAL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_DER_SOCIAL_BIE_ECO_CSCDERSOCIAL_GENERATOR")
	@Column(name="CSC_DER_SOCIAL")
	private long cscDerSocial;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	/*//bi-directional many-to-one association to DatosAdmBienestar
	@OneToMany(mappedBy="CDerSocialBieEco")
	private List<DatosAdmBienestar> datosAdmBienestars;

	//bi-directional many-to-one association to ProyectosDerechosSociale
	@OneToMany(mappedBy="CDerSocialBieEco")
	private List<ProyectosDerechosSociale> proyectosDerechosSociales;*/

	public CDerSocialBieEco() {
	}

	public long getCscDerSocial() {
		return this.cscDerSocial;
	}

	public void setCscDerSocial(long cscDerSocial) {
		this.cscDerSocial = cscDerSocial;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}

	/*public List<DatosAdmBienestar> getDatosAdmBienestars() {
		return this.datosAdmBienestars;
	}

	public void setDatosAdmBienestars(List<DatosAdmBienestar> datosAdmBienestars) {
		this.datosAdmBienestars = datosAdmBienestars;
	}

	public DatosAdmBienestar addDatosAdmBienestar(DatosAdmBienestar datosAdmBienestar) {
		getDatosAdmBienestars().add(datosAdmBienestar);
		datosAdmBienestar.setCDerSocialBieEco(this);

		return datosAdmBienestar;
	}

	public DatosAdmBienestar removeDatosAdmBienestar(DatosAdmBienestar datosAdmBienestar) {
		getDatosAdmBienestars().remove(datosAdmBienestar);
		datosAdmBienestar.setCDerSocialBieEco(null);

		return datosAdmBienestar;
	}

	public List<ProyectosDerechosSociale> getProyectosDerechosSociales() {
		return this.proyectosDerechosSociales;
	}

	public void setProyectosDerechosSociales(List<ProyectosDerechosSociale> proyectosDerechosSociales) {
		this.proyectosDerechosSociales = proyectosDerechosSociales;
	}

	public ProyectosDerechosSociale addProyectosDerechosSociale(ProyectosDerechosSociale proyectosDerechosSociale) {
		getProyectosDerechosSociales().add(proyectosDerechosSociale);
		proyectosDerechosSociale.setCDerSocialBieEco(this);

		return proyectosDerechosSociale;
	}

	public ProyectosDerechosSociale removeProyectosDerechosSociale(ProyectosDerechosSociale proyectosDerechosSociale) {
		getProyectosDerechosSociales().remove(proyectosDerechosSociale);
		proyectosDerechosSociale.setCDerSocialBieEco(null);

		return proyectosDerechosSociale;
	}*/

}