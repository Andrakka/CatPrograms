package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the RESPONSABLE_FONDO database table.
 * 
 */
@Entity
@Table(name="RESPONSABLE_FONDO")
@NamedQuery(name="ResponsableFondo.findAll", query="SELECT r FROM ResponsableFondo r")
public class ResponsableFondo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RESPONSABLE_FONDO_CSCRESPONSABLEFONDO_GENERATOR", sequenceName="SEQ_CSC_RESPONSABLE_FONDO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RESPONSABLE_FONDO_CSCRESPONSABLEFONDO_GENERATOR")
	@Column(name="CSC_RESPONSABLE_FONDO")
	private long cscResponsableFondo;

	@Column(name="CHR_CARGO_RES_FONDO")
	private String chrCargoResFondo;

	@Column(name="CHR_CORREO_RES_FONDO")
	private String chrCorreoResFondo;

	@Column(name="CHR_EXTENSION_RES_FONDO")
	private String chrExtensionResFondo;

	@Column(name="CHR_NOMBRE_RES_FONDO")
	private String chrNombreResFondo;

	@Column(name="CHR_PRIMER_AP_RES_FONDO")
	private String chrPrimerApResFondo;

	@Column(name="CHR_SEGUNDO_AP_RES_FONDO")
	private String chrSegundoApResFondo;

	@Column(name="CHR_TELEFONO_RES_FONDO")
	private String chrTelefonoResFondo;

	//bi-directional many-to-one association to FondosEspeciale
	@OneToMany(mappedBy="responsableFondo")
	private List<FondosEspeciale> fondosEspeciales;

	public ResponsableFondo() {
	}

	public long getCscResponsableFondo() {
		return this.cscResponsableFondo;
	}

	public void setCscResponsableFondo(long cscResponsableFondo) {
		this.cscResponsableFondo = cscResponsableFondo;
	}

	public String getChrCargoResFondo() {
		return this.chrCargoResFondo;
	}

	public void setChrCargoResFondo(String chrCargoResFondo) {
		this.chrCargoResFondo = chrCargoResFondo;
	}

	public String getChrCorreoResFondo() {
		return this.chrCorreoResFondo;
	}

	public void setChrCorreoResFondo(String chrCorreoResFondo) {
		this.chrCorreoResFondo = chrCorreoResFondo;
	}

	public String getChrExtensionResFondo() {
		return this.chrExtensionResFondo;
	}

	public void setChrExtensionResFondo(String chrExtensionResFondo) {
		this.chrExtensionResFondo = chrExtensionResFondo;
	}

	public String getChrNombreResFondo() {
		return this.chrNombreResFondo;
	}

	public void setChrNombreResFondo(String chrNombreResFondo) {
		this.chrNombreResFondo = chrNombreResFondo;
	}

	public String getChrPrimerApResFondo() {
		return this.chrPrimerApResFondo;
	}

	public void setChrPrimerApResFondo(String chrPrimerApResFondo) {
		this.chrPrimerApResFondo = chrPrimerApResFondo;
	}

	public String getChrSegundoApResFondo() {
		return this.chrSegundoApResFondo;
	}

	public void setChrSegundoApResFondo(String chrSegundoApResFondo) {
		this.chrSegundoApResFondo = chrSegundoApResFondo;
	}

	public String getChrTelefonoResFondo() {
		return this.chrTelefonoResFondo;
	}

	public void setChrTelefonoResFondo(String chrTelefonoResFondo) {
		this.chrTelefonoResFondo = chrTelefonoResFondo;
	}

	public List<FondosEspeciale> getFondosEspeciales() {
		return this.fondosEspeciales;
	}

	public void setFondosEspeciales(List<FondosEspeciale> fondosEspeciales) {
		this.fondosEspeciales = fondosEspeciales;
	}

	public FondosEspeciale addFondosEspeciale(FondosEspeciale fondosEspeciale) {
		getFondosEspeciales().add(fondosEspeciale);
		fondosEspeciale.setResponsableFondo(this);

		return fondosEspeciale;
	}

	public FondosEspeciale removeFondosEspeciale(FondosEspeciale fondosEspeciale) {
		getFondosEspeciales().remove(fondosEspeciale);
		fondosEspeciale.setResponsableFondo(null);

		return fondosEspeciale;
	}

}