package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_TIPO_CONVENIO database table.
 * 
 */
@Entity
@Table(name="C_TIPO_CONVENIO")
@NamedQuery(name="CTipoConvenio.findAll", query="SELECT c FROM CTipoConvenio c")
public class CTipoConvenio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_TIPO_CONVENIO_CSCTIPOCONVENIO_GENERATOR", sequenceName="SEQ_CSC_TIPO_CONVENIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_TIPO_CONVENIO_CSCTIPOCONVENIO_GENERATOR")
	@Column(name="CSC_TIPO_CONVENIO")
	private long cscTipoConvenio;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="C_TIPO")
	private BigDecimal cTipo;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to Convenio
	/*@OneToMany(mappedBy="CTipoConvenio")
	private List<Convenio> convenios;*/

	public CTipoConvenio() {
	}

	public long getCscTipoConvenio() {
		return this.cscTipoConvenio;
	}

	public void setCscTipoConvenio(long cscTipoConvenio) {
		this.cscTipoConvenio = cscTipoConvenio;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	

	public BigDecimal getcTipo() {
		return cTipo;
	}

	public void setcTipo(BigDecimal cTipo) {
		this.cTipo = cTipo;
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
		convenio.setcTipoConvenio(this);

		return convenio;
	}

	public Convenio removeConvenio(Convenio convenio) {
		getConvenios().remove(convenio);
		convenio.setcTipoConvenio(null);

		return convenio;
	}*/

}