package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DATOS_ADM_BIENESTAR database table.
 * 
 */
@Entity
@Table(name="DATOS_ADM_BIENESTAR")
@NamedQuery(name="DatosAdmBienestar.findAll", query="SELECT d FROM DatosAdmBienestar d")
public class DatosAdmBienestar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DATOS_ADM_BIENESTAR_CSCDATOSADMBIE_GENERATOR", sequenceName="SEQ_CSC_DATOS_ADM_BIE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATOS_ADM_BIENESTAR_CSCDATOSADMBIE_GENERATOR")
	@Column(name="CSC_DATOS_ADM_BIE")
	private long cscDatosAdmBie;

	//bi-directional many-to-one association to CDerSocialBieEco
	@ManyToOne
	@JoinColumn(name="CSC_DER_SOCIAL_FK")
	private CDerSocialBieEco CDerSocialBieEco;

	//bi-directional many-to-one association to CTematicaBienestar
	@ManyToOne
	@JoinColumn(name="CSC_TEMATICA_BIE_FK")
	private CTematicaBienestar CTematicaBienestar;

	//bi-directional many-to-one association to DatosAdministrativo
	@ManyToOne
	@JoinColumn(name="CSC_DATOS_ADMINISTRATIVOS_FK")
	private DatosAdministrativo datosAdministrativo;

	public DatosAdmBienestar() {
	}

	public long getCscDatosAdmBie() {
		return this.cscDatosAdmBie;
	}

	public void setCscDatosAdmBie(long cscDatosAdmBie) {
		this.cscDatosAdmBie = cscDatosAdmBie;
	}

	public CDerSocialBieEco getCDerSocialBieEco() {
		return this.CDerSocialBieEco;
	}

	public void setCDerSocialBieEco(CDerSocialBieEco CDerSocialBieEco) {
		this.CDerSocialBieEco = CDerSocialBieEco;
	}

	public CTematicaBienestar getCTematicaBienestar() {
		return this.CTematicaBienestar;
	}

	public void setCTematicaBienestar(CTematicaBienestar CTematicaBienestar) {
		this.CTematicaBienestar = CTematicaBienestar;
	}

	public DatosAdministrativo getDatosAdministrativo() {
		return this.datosAdministrativo;
	}

	public void setDatosAdministrativo(DatosAdministrativo datosAdministrativo) {
		this.datosAdministrativo = datosAdministrativo;
	}

}