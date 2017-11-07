package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the RESPONSABLE_PROGRAMA_SOCIAL database table.
 * 
 */
@Entity
@Table(name="RESPONSABLE_PROGRAMA_SOCIAL")
@NamedQuery(name="ResponsableProgramaSocial.findAll", query="SELECT r FROM ResponsableProgramaSocial r")
public class ResponsableProgramaSocial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RESPONSABLE_PROGRAMA_SOCIAL_CSCRESPONSABLEPROSOC_GENERATOR", sequenceName="SEQ_CSC_RESPONSABLE_PRO_SOC",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RESPONSABLE_PROGRAMA_SOCIAL_CSCRESPONSABLEPROSOC_GENERATOR")
	@Column(name="CSC_RESPONSABLE_PRO_SOC")
	private long cscResponsableProSoc;

	@Column(name="RP_CARGO")
	private String rpCargo;

	@Column(name="RP_CORREO")
	private String rpCorreo;

	@Column(name="RP_EXT")
	private String rpExt;

	@Column(name="RP_NOMBRE")
	private String rpNombre;

	@Column(name="RP_PRIMER_AP")
	private String rpPrimerAp;

	@Column(name="RP_SEGUNDO_AP")
	private String rpSegundoAp;

	@Column(name="RP_TEL")
	private String rpTel;

	//bi-directional many-to-one association to ProgramasSocResponsablePro
	@OneToMany(mappedBy="responsableProgramaSocial")
	private List<ProgramasSocResponsablePro> programasSocResponsablePros;

	public ResponsableProgramaSocial() {
	}

	public long getCscResponsableProSoc() {
		return this.cscResponsableProSoc;
	}

	public void setCscResponsableProSoc(long cscResponsableProSoc) {
		this.cscResponsableProSoc = cscResponsableProSoc;
	}

	public String getRpCargo() {
		return this.rpCargo;
	}

	public void setRpCargo(String rpCargo) {
		this.rpCargo = rpCargo;
	}

	public String getRpCorreo() {
		return this.rpCorreo;
	}

	public void setRpCorreo(String rpCorreo) {
		this.rpCorreo = rpCorreo;
	}

	public String getRpExt() {
		return this.rpExt;
	}

	public void setRpExt(String rpExt) {
		this.rpExt = rpExt;
	}

	public String getRpNombre() {
		return this.rpNombre;
	}

	public void setRpNombre(String rpNombre) {
		this.rpNombre = rpNombre;
	}

	public String getRpPrimerAp() {
		return this.rpPrimerAp;
	}

	public void setRpPrimerAp(String rpPrimerAp) {
		this.rpPrimerAp = rpPrimerAp;
	}

	public String getRpSegundoAp() {
		return this.rpSegundoAp;
	}

	public void setRpSegundoAp(String rpSegundoAp) {
		this.rpSegundoAp = rpSegundoAp;
	}

	public String getRpTel() {
		return this.rpTel;
	}

	public void setRpTel(String rpTel) {
		this.rpTel = rpTel;
	}

	public List<ProgramasSocResponsablePro> getProgramasSocResponsablePros() {
		return this.programasSocResponsablePros;
	}

	public void setProgramasSocResponsablePros(List<ProgramasSocResponsablePro> programasSocResponsablePros) {
		this.programasSocResponsablePros = programasSocResponsablePros;
	}

	public ProgramasSocResponsablePro addProgramasSocResponsablePro(ProgramasSocResponsablePro programasSocResponsablePro) {
		getProgramasSocResponsablePros().add(programasSocResponsablePro);
		programasSocResponsablePro.setResponsableProgramaSocial(this);

		return programasSocResponsablePro;
	}

	public ProgramasSocResponsablePro removeProgramasSocResponsablePro(ProgramasSocResponsablePro programasSocResponsablePro) {
		getProgramasSocResponsablePros().remove(programasSocResponsablePro);
		programasSocResponsablePro.setResponsableProgramaSocial(null);

		return programasSocResponsablePro;
	}

}