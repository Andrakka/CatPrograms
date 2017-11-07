package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TITULAR_CONVENIO database table.
 * 
 */
@Entity
@Table(name="TITULAR_CONVENIO")
@NamedQuery(name="TitularConvenio.findAll", query="SELECT t FROM TitularConvenio t")
public class TitularConvenio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TITULAR_CONVENIO_CSCTITULARCONVENIO_GENERATOR", sequenceName="SEQ_CSC_TITULAR_CONVENIO",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TITULAR_CONVENIO_CSCTITULARCONVENIO_GENERATOR")
	@Column(name="CSC_TITULAR_CONVENIO")
	private long cscTitularConvenio;

	@Column(name="CHR_CARGO")
	private String chrCargo;

	@Column(name="CHR_EMAIL")
	private String chrEmail;

	@Column(name="CHR_EXTENSION")
	private String chrExtension;

	@Column(name="CHR_NOMBRE")
	private String chrNombre;

	@Column(name="CHR_TELEFONO")
	private String chrTelefono;
	
	//bi-directional many-to-one association to Convenio
	@OneToMany(mappedBy="titularConvenio")
	private List<Convenio> convenios;

	
	public TitularConvenio() {
	}

	public long getCscTitularConvenio() {
		return this.cscTitularConvenio;
	}

	public void setCscTitularConvenio(long cscTitularConvenio) {
		this.cscTitularConvenio = cscTitularConvenio;
	}

	public String getChrCargo() {
		return this.chrCargo;
	}

	public void setChrCargo(String chrCargo) {
		this.chrCargo = chrCargo;
	}

	public String getChrEmail() {
		return this.chrEmail;
	}

	public void setChrEmail(String chrEmail) {
		this.chrEmail = chrEmail;
	}

	public String getChrExtension() {
		return this.chrExtension;
	}

	public void setChrExtension(String chrExtension) {
		this.chrExtension = chrExtension;
	}

	public String getChrNombre() {
		return this.chrNombre;
	}

	public void setChrNombre(String chrNombre) {
		this.chrNombre = chrNombre;
	}

	public String getChrTelefono() {
		return this.chrTelefono;
	}

	public void setChrTelefono(String chrTelefono) {
		this.chrTelefono = chrTelefono;
	}

	public List<Convenio> getConvenios() {
		return this.convenios;
	}

	public void setConvenios(List<Convenio> convenios) {
		this.convenios = convenios;
	}

	public Convenio addConvenio(Convenio convenio) {
		getConvenios().add(convenio);
		convenio.setTitularConvenio(this);

		return convenio;
	}

	public Convenio removeConvenio(Convenio convenio) {
		getConvenios().remove(convenio);
		convenio.setTitularConvenio(null);

		return convenio;
	}

}