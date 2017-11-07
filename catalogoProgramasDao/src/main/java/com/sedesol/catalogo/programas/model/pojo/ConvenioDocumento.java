package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CONVENIO_DOCUMENTOS database table.
 * 
 */
@Entity
@Table(name="CONVENIO_DOCUMENTOS")
@NamedQuery(name="ConvenioDocumento.findAll", query="SELECT c FROM ConvenioDocumento c")
public class ConvenioDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONVENIO_DOCUMENTOS_CSCCONVENIODOC_GENERATOR", sequenceName="SEQ_CSC_CONVENIO_DOC")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONVENIO_DOCUMENTOS_CSCCONVENIODOC_GENERATOR")
	@Column(name="CSC_CONVENIO_DOC")
	private long cscConvenioDoc;

	@Lob
	@Column(name="BLOB_CONVENIO_DOCUMENTO")
	private byte[] blobConvenioDocumento;

	@Column(name="CHR_NUMERO_FOLIO_DOC")
	private String chrNumeroFolioDoc;

	@Column(name="CHR_OBSERVACION_DOC")
	private String chrObservacionDoc;

	@Temporal(TemporalType.DATE)
	@Column(name="FCH_DOCUMENTO")
	private Date fchDocumento;

	//bi-directional many-to-one association to Convenio
	@ManyToOne
	@JoinColumn(name="CSC_CONVENIO_FK")
	private Convenio convenio;

	//bi-directional many-to-one association to CTipoDocumento
	@ManyToOne
	@JoinColumn(name="CSC_TIPO_DOCUMENTO_FK")
	private CTipoDocumento CTipoDocumento;

	public ConvenioDocumento() {
	}

	public long getCscConvenioDoc() {
		return this.cscConvenioDoc;
	}

	public void setCscConvenioDoc(long cscConvenioDoc) {
		this.cscConvenioDoc = cscConvenioDoc;
	}

	public byte[] getBlobConvenioDocumento() {
		return this.blobConvenioDocumento;
	}

	public void setBlobConvenioDocumento(byte[] blobConvenioDocumento) {
		this.blobConvenioDocumento = blobConvenioDocumento;
	}

	public String getChrNumeroFolioDoc() {
		return this.chrNumeroFolioDoc;
	}

	public void setChrNumeroFolioDoc(String chrNumeroFolioDoc) {
		this.chrNumeroFolioDoc = chrNumeroFolioDoc;
	}

	public String getChrObservacionDoc() {
		return this.chrObservacionDoc;
	}

	public void setChrObservacionDoc(String chrObservacionDoc) {
		this.chrObservacionDoc = chrObservacionDoc;
	}

	public Date getFchDocumento() {
		return this.fchDocumento;
	}

	public void setFchDocumento(Date fchDocumento) {
		this.fchDocumento = fchDocumento;
	}

	public Convenio getConvenio() {
		return this.convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public CTipoDocumento getCTipoDocumento() {
		return this.CTipoDocumento;
	}

	public void setCTipoDocumento(CTipoDocumento CTipoDocumento) {
		this.CTipoDocumento = CTipoDocumento;
	}

}