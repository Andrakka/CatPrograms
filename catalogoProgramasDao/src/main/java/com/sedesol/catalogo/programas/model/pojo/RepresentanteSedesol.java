package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the REPRESENTANTE_SEDESOL database table.
 * 
 */
@Entity
@Table(name="REPRESENTANTE_SEDESOL")
@NamedQuery(name="RepresentanteSedesol.findAll", query="SELECT r FROM RepresentanteSedesol r")
public class RepresentanteSedesol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REPRESENTANTE_SEDESOL_CSCREPRESENTANTESEDESOL_GENERATOR", sequenceName="SEQ_CSC_REPRESENTANTE_SEDESOL",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REPRESENTANTE_SEDESOL_CSCREPRESENTANTESEDESOL_GENERATOR")
	@Column(name="CSC_REPRESENTANTE_SEDESOL")
	private long cscRepresentanteSedesol;

	@Column(name="CHR_CARGO")
	private String chrCargo;

	@Column(name="CHR_NOMBRE")
	private String chrNombre;

	//bi-directional many-to-one association to Convenio
	@OneToMany(mappedBy="representanteSedesol")
	private List<Convenio> convenios;

	
	public RepresentanteSedesol() {
	}

	public long getCscRepresentanteSedesol() {
		return this.cscRepresentanteSedesol;
	}

	public void setCscRepresentanteSedesol(long cscRepresentanteSedesol) {
		this.cscRepresentanteSedesol = cscRepresentanteSedesol;
	}

	public String getChrCargo() {
		return this.chrCargo;
	}

	public void setChrCargo(String chrCargo) {
		this.chrCargo = chrCargo;
	}

	public String getChrNombre() {
		return this.chrNombre;
	}

	public void setChrNombre(String chrNombre) {
		this.chrNombre = chrNombre;
	}

	public List<Convenio> getConvenios() {
		return this.convenios;
	}

	public void setConvenios(List<Convenio> convenios) {
		this.convenios = convenios;
	}

	public Convenio addConvenio(Convenio convenio) {
		getConvenios().add(convenio);
		convenio.setRepresentanteSedesol(this);

		return convenio;
	}

	public Convenio removeConvenio(Convenio convenio) {
		getConvenios().remove(convenio);
		convenio.setRepresentanteSedesol(null);

		return convenio;
	}

}