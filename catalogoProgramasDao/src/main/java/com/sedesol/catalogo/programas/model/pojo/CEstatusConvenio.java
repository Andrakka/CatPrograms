package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_ESTATUS_CONVENIO database table.
 * 
 */
@Entity
@Table(name="C_ESTATUS_CONVENIO")
@NamedQuery(name="CEstatusConvenio.findAll", query="SELECT c FROM CEstatusConvenio c")
public class CEstatusConvenio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_ESTATUS_CONVENIO_CSCESTATUS_GENERATOR", sequenceName="SEQ_CSC_ESTATUS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_ESTATUS_CONVENIO_CSCESTATUS_GENERATOR")
	@Column(name="CSC_ESTATUS")
	private long cscEstatus;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	/*//bi-directional many-to-one association to Convenio
	@OneToMany(mappedBy="CEstatusConvenio")
	private List<Convenio> convenios;*/


	public CEstatusConvenio() {
	}

	public long getCscEstatus() {
		return this.cscEstatus;
	}

	public void setCscEstatus(long cscEstatus) {
		this.cscEstatus = cscEstatus;
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

	/*public List<Convenio> getConvenios() {
		return this.convenios;
	}

	public void setConvenios(List<Convenio> convenios) {
		this.convenios = convenios;
	}

	public Convenio addConvenio(Convenio convenio) {
		getConvenios().add(convenio);
		convenio.setcEstatusConvenio(this);

		return convenio;
	}

	public Convenio removeConvenio(Convenio convenio) {
		getConvenios().remove(convenio);
		convenio.setcEstatusConvenio(null);

		return convenio;
	}*/
	
}