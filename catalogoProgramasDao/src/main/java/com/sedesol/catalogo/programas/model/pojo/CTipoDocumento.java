package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_TIPO_DOCUMENTO database table.
 * 
 */
@Entity
@Table(name="C_TIPO_DOCUMENTO")
@NamedQuery(name="CTipoDocumento.findAll", query="SELECT c FROM CTipoDocumento c")
public class CTipoDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_TIPO_DOCUMENTO_CSCTIPODOCUMENTO_GENERATOR", sequenceName="SEQ_CSC_TIPO_DOCUMENTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_TIPO_DOCUMENTO_CSCTIPODOCUMENTO_GENERATOR")
	@Column(name="CSC_TIPO_DOCUMENTO")
	private long cscTipoDocumento;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to ConvenioDocumento
	@OneToMany(mappedBy="CTipoDocumento")
	private List<ConvenioDocumento> convenioDocumentos;

	public CTipoDocumento() {
	}

	public long getCscTipoDocumento() {
		return this.cscTipoDocumento;
	}

	public void setCscTipoDocumento(long cscTipoDocumento) {
		this.cscTipoDocumento = cscTipoDocumento;
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

	public List<ConvenioDocumento> getConvenioDocumentos() {
		return this.convenioDocumentos;
	}

	public void setConvenioDocumentos(List<ConvenioDocumento> convenioDocumentos) {
		this.convenioDocumentos = convenioDocumentos;
	}

	public ConvenioDocumento addConvenioDocumento(ConvenioDocumento convenioDocumento) {
		getConvenioDocumentos().add(convenioDocumento);
		convenioDocumento.setCTipoDocumento(this);

		return convenioDocumento;
	}

	public ConvenioDocumento removeConvenioDocumento(ConvenioDocumento convenioDocumento) {
		getConvenioDocumentos().remove(convenioDocumento);
		convenioDocumento.setCTipoDocumento(null);

		return convenioDocumento;
	}

}