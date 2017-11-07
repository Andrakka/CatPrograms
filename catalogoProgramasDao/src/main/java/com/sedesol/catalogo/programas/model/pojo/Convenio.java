package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sedesol.catalogo.programas.model.serializer.JsonDateDeserializer;
import com.sedesol.catalogo.programas.model.serializer.JsonDateSerializer;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CONVENIO database table.
 * 
 */
@Entity
@NamedQuery(name="Convenio.findAll", query="SELECT c FROM Convenio c")
public class Convenio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONVENIO_CSCCONVENIO_GENERATOR", sequenceName="SEQ_CSC_CONVENIO",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONVENIO_CSCCONVENIO_GENERATOR")
	@Column(name="CSC_CONVENIO")
	private long cscConvenio;

	@Lob
	@Column(name="BLOB_CONVENIO")
	private byte[] blobConvenio;

	@Column(name="CHR_FOLIO_CONVENIO")
	private String chrFolioConvenio;

	@Column(name="CHR_OBSERVACIONES")
	private String chrObservaciones;

	@Temporal(TemporalType.DATE)
	@Column(name="FCH_CONVENIO")	
	private Date fchConvenio;

	//bi-directional many-to-one association to CEstatusConvenio
	@ManyToOne
	@JoinColumn(name="CSC_ESTATUS_FK")
	private CEstatusConvenio cEstatusConvenio;

	//bi-directional many-to-one association to ColaboradorSisi
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CSC_COLABORADOR_SISI_FK")
	private ColaboradorSisi colaboradorSisi;

	//bi-directional many-to-one association to CTipoConvenio
	@ManyToOne
	@JoinColumn(name="CSC_TIPO_CONVENIO_FK")
	private CTipoConvenio cTipoConvenio;

	//bi-directional many-to-one association to RepresentanteSedesol
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CSC_REPRESENTANTE_SEDESOL_FK")
	private RepresentanteSedesol representanteSedesol;

	//bi-directional many-to-one association to TitularConvenio
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CSC_TITULAR_CONVENIO_FK")
	private TitularConvenio titularConvenio;

	//bi-directional many-to-one association to VigenciaConvenio
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CSC_VIGENCIA_CONVENIO_FK")
	private VigenciaConvenio vigenciaConvenio;

	//bi-directional many-to-one association to ConvenioDocumento
	@OneToMany(mappedBy="convenio")
	private List<ConvenioDocumento> convenioDocumentos;
	

	

	public Convenio() {
	}

	public long getCscConvenio() {
		return this.cscConvenio;
	}

	public void setCscConvenio(long cscConvenio) {
		this.cscConvenio = cscConvenio;
	}

	public byte[] getBlobConvenio() {
		return this.blobConvenio;
	}

	public void setBlobConvenio(byte[] blobConvenio) {
		this.blobConvenio = blobConvenio;
	}

	public String getChrFolioConvenio() {
		return this.chrFolioConvenio;
	}

	public void setChrFolioConvenio(String chrFolioConvenio) {
		this.chrFolioConvenio = chrFolioConvenio;
	}

	public String getChrObservaciones() {
		return this.chrObservaciones;
	}

	public void setChrObservaciones(String chrObservaciones) {
		this.chrObservaciones = chrObservaciones;
	}
	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getFchConvenio() {
		return this.fchConvenio;
	}
	@JsonDeserialize(using = JsonDateDeserializer.class)
	public void setFchConvenio(Date fchConvenio) {
		this.fchConvenio = fchConvenio;
	}

	

	public CEstatusConvenio getcEstatusConvenio() {
		return cEstatusConvenio;
	}

	public void setcEstatusConvenio(CEstatusConvenio cEstatusConvenio) {
		this.cEstatusConvenio = cEstatusConvenio;
	}

	public ColaboradorSisi getColaboradorSisi() {
		return this.colaboradorSisi;
	}

	public void setColaboradorSisi(ColaboradorSisi colaboradorSisi) {
		this.colaboradorSisi = colaboradorSisi;
	}

	public CTipoConvenio getcTipoConvenio() {
		return cTipoConvenio;
	}

	public void setcTipoConvenio(CTipoConvenio cTipoConvenio) {
		this.cTipoConvenio = cTipoConvenio;
	}

	public RepresentanteSedesol getRepresentanteSedesol() {
		return this.representanteSedesol;
	}

	public void setRepresentanteSedesol(RepresentanteSedesol representanteSedesol) {
		this.representanteSedesol = representanteSedesol;
	}

	public TitularConvenio getTitularConvenio() {
		return this.titularConvenio;
	}

	public void setTitularConvenio(TitularConvenio titularConvenio) {
		this.titularConvenio = titularConvenio;
	}

	public VigenciaConvenio getVigenciaConvenio() {
		return this.vigenciaConvenio;
	}

	public void setVigenciaConvenio(VigenciaConvenio vigenciaConvenio) {
		this.vigenciaConvenio = vigenciaConvenio;
	}

	public List<ConvenioDocumento> getConvenioDocumentos() {
		return this.convenioDocumentos;
	}

	public void setConvenioDocumentos(List<ConvenioDocumento> convenioDocumentos) {
		this.convenioDocumentos = convenioDocumentos;
	}

	public ConvenioDocumento addConvenioDocumento(ConvenioDocumento convenioDocumento) {
		getConvenioDocumentos().add(convenioDocumento);
		convenioDocumento.setConvenio(this);

		return convenioDocumento;
	}

	public ConvenioDocumento removeConvenioDocumento(ConvenioDocumento convenioDocumento) {
		getConvenioDocumentos().remove(convenioDocumento);
		convenioDocumento.setConvenio(null);

		return convenioDocumento;
	}
	
	

}