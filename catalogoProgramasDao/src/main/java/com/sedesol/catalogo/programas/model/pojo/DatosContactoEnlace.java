package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the DATOS_CONTACTO_ENLACE database table.
 * 
 */
@Entity
@Table(name="DATOS_CONTACTO_ENLACE")
@NamedQuery(name="DatosContactoEnlace.findAll", query="SELECT d FROM DatosContactoEnlace d")
public class DatosContactoEnlace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DATOS_CONTACTO_ENLACE_CSCDATOSCONTACTOENLACE_GENERATOR", sequenceName="SEQ_CSC_DATOS_CONTACTO_ENLACE",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATOS_CONTACTO_ENLACE_CSCDATOSCONTACTOENLACE_GENERATOR")
	@Column(name="CSC_DATOS_CONTACTO_ENLACE")
	private long cscDatosContactoEnlace;

	@Column(name="CHR_CARGO_CONTACTO_ENL")
	private String chrCargoContactoEnl;

	@Column(name="CHR_EMAIL")
	private String chrEmail;

	@Column(name="CHR_EXTENSION_CONTACTO_ENL")
	private String chrExtensionContactoEnl;

	@Column(name="CHR_NOMBRE_CONTACTO_ENL")
	private String chrNombreContactoEnl;

	@Column(name="CHR_PRIMER_AP")
	private String chrPrimerAp;

	@Column(name="CHR_SEGUNDO_AP")
	private String chrSegundoAp;

	@Column(name="CHR_TELEFONO")
	private String chrTelefono;

	//bi-directional many-to-one association to RegistroAdhesion
	@OneToMany(mappedBy="datosContactoEnlace")
	@JsonIgnore
	private List<RegistroAdhesion> registroAdhesions;

	public DatosContactoEnlace() {
	}

	public long getCscDatosContactoEnlace() {
		return this.cscDatosContactoEnlace;
	}

	public void setCscDatosContactoEnlace(long cscDatosContactoEnlace) {
		this.cscDatosContactoEnlace = cscDatosContactoEnlace;
	}

	public String getChrCargoContactoEnl() {
		return this.chrCargoContactoEnl;
	}

	public void setChrCargoContactoEnl(String chrCargoContactoEnl) {
		this.chrCargoContactoEnl = chrCargoContactoEnl;
	}

	public String getChrEmail() {
		return this.chrEmail;
	}

	public void setChrEmail(String chrEmail) {
		this.chrEmail = chrEmail;
	}

	public String getChrExtensionContactoEnl() {
		return this.chrExtensionContactoEnl;
	}

	public void setChrExtensionContactoEnl(String chrExtensionContactoEnl) {
		this.chrExtensionContactoEnl = chrExtensionContactoEnl;
	}

	public String getChrNombreContactoEnl() {
		return this.chrNombreContactoEnl;
	}

	public void setChrNombreContactoEnl(String chrNombreContactoEnl) {
		this.chrNombreContactoEnl = chrNombreContactoEnl;
	}

	public String getChrPrimerAp() {
		return this.chrPrimerAp;
	}

	public void setChrPrimerAp(String chrPrimerAp) {
		this.chrPrimerAp = chrPrimerAp;
	}

	public String getChrSegundoAp() {
		return this.chrSegundoAp;
	}

	public void setChrSegundoAp(String chrSegundoAp) {
		this.chrSegundoAp = chrSegundoAp;
	}

	public String getChrTelefono() {
		return this.chrTelefono;
	}

	public void setChrTelefono(String chrTelefono) {
		this.chrTelefono = chrTelefono;
	}

	public List<RegistroAdhesion> getRegistroAdhesions() {
		return this.registroAdhesions;
	}

	public void setRegistroAdhesions(List<RegistroAdhesion> registroAdhesions) {
		this.registroAdhesions = registroAdhesions;
	}

	public RegistroAdhesion addRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().add(registroAdhesion);
		registroAdhesion.setDatosContactoEnlace(this);

		return registroAdhesion;
	}

	public RegistroAdhesion removeRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().remove(registroAdhesion);
		registroAdhesion.setDatosContactoEnlace(null);

		return registroAdhesion;
	}

}