package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the DATOS_CONTACTO_TITULAR database table.
 * 
 */
@Entity
@Table(name="DATOS_CONTACTO_TITULAR")
@NamedQuery(name="DatosContactoTitular.findAll", query="SELECT d FROM DatosContactoTitular d")
public class DatosContactoTitular implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DATOS_CONTACTO_TITULAR_CSCDATOSCONTACTOTITULAR_GENERATOR", sequenceName="SEQ_CSC_DATOS_CONTACTO_TITULAR",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATOS_CONTACTO_TITULAR_CSCDATOSCONTACTOTITULAR_GENERATOR")
	@Column(name="CSC_DATOS_CONTACTO_TITULAR")
	private long cscDatosContactoTitular;

	@Column(name="TUA_CARGO")
	private String tuaCargo;

	@Column(name="TUA_CORREO")
	private String tuaCorreo;

	@Column(name="TUA_EXT")
	private String tuaExt;

	@Column(name="TUA_NOMBRE")
	private String tuaNombre;

	@Column(name="TUA_PRIMER_AP")
	private String tuaPrimerAp;

	@Column(name="TUA_SEGUNDO_AP")
	private String tuaSegundoAp;

	@Column(name="TUA_TEL")
	private String tuaTel;

	//bi-directional many-to-one association to RegistroAdhesion
	@OneToMany(mappedBy="datosContactoTitular")
	@JsonIgnore
	private List<RegistroAdhesion> registroAdhesions;

	public DatosContactoTitular() {
	}

	public long getCscDatosContactoTitular() {
		return this.cscDatosContactoTitular;
	}

	public void setCscDatosContactoTitular(long cscDatosContactoTitular) {
		this.cscDatosContactoTitular = cscDatosContactoTitular;
	}

	public String getTuaCargo() {
		return this.tuaCargo;
	}

	public void setTuaCargo(String tuaCargo) {
		this.tuaCargo = tuaCargo;
	}

	public String getTuaCorreo() {
		return this.tuaCorreo;
	}

	public void setTuaCorreo(String tuaCorreo) {
		this.tuaCorreo = tuaCorreo;
	}

	public String getTuaExt() {
		return this.tuaExt;
	}

	public void setTuaExt(String tuaExt) {
		this.tuaExt = tuaExt;
	}

	public String getTuaNombre() {
		return this.tuaNombre;
	}

	public void setTuaNombre(String tuaNombre) {
		this.tuaNombre = tuaNombre;
	}

	public String getTuaPrimerAp() {
		return this.tuaPrimerAp;
	}

	public void setTuaPrimerAp(String tuaPrimerAp) {
		this.tuaPrimerAp = tuaPrimerAp;
	}

	public String getTuaSegundoAp() {
		return this.tuaSegundoAp;
	}

	public void setTuaSegundoAp(String tuaSegundoAp) {
		this.tuaSegundoAp = tuaSegundoAp;
	}

	public String getTuaTel() {
		return this.tuaTel;
	}

	public void setTuaTel(String tuaTel) {
		this.tuaTel = tuaTel;
	}

	public List<RegistroAdhesion> getRegistroAdhesions() {
		return this.registroAdhesions;
	}

	public void setRegistroAdhesions(List<RegistroAdhesion> registroAdhesions) {
		this.registroAdhesions = registroAdhesions;
	}

	public RegistroAdhesion addRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().add(registroAdhesion);
		registroAdhesion.setDatosContactoTitular(this);

		return registroAdhesion;
	}

	public RegistroAdhesion removeRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().remove(registroAdhesion);
		registroAdhesion.setDatosContactoTitular(null);

		return registroAdhesion;
	}

}