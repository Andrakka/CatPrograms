package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DOCUMENTO_NORMATIVO_FONDO database table.
 * 
 */
@Entity
@Table(name="DOCUMENTO_NORMATIVO_FONDO")
@NamedQuery(name="DocumentoNormativoFondo.findAll", query="SELECT d FROM DocumentoNormativoFondo d")
public class DocumentoNormativoFondo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOCUMENTO_NORMATIVO_FONDO_CSCDOCUMENTONORMATIVO_GENERATOR", sequenceName="SEQ_CSC_DOCUMENTO_NORMATIVO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOCUMENTO_NORMATIVO_FONDO_CSCDOCUMENTONORMATIVO_GENERATOR")
	@Column(name="CSC_DOCUMENTO_NORMATIVO")
	private long cscDocumentoNormativo;

	@Lob
	@Column(name="BLOB_DOC_NORMATIVO")
	private byte[] blobDocNormativo;

	@Column(name="CHR_NOMBRE_ENLACE_DOC_NORMATIV")
	private String chrNombreEnlaceDocNormativ;

	//bi-directional many-to-one association to FondosEspeciale
	@OneToMany(mappedBy="documentoNormativoFondo")
	private List<FondosEspeciale> fondosEspeciales;

	public DocumentoNormativoFondo() {
	}

	public long getCscDocumentoNormativo() {
		return this.cscDocumentoNormativo;
	}

	public void setCscDocumentoNormativo(long cscDocumentoNormativo) {
		this.cscDocumentoNormativo = cscDocumentoNormativo;
	}

	public byte[] getBlobDocNormativo() {
		return this.blobDocNormativo;
	}

	public void setBlobDocNormativo(byte[] blobDocNormativo) {
		this.blobDocNormativo = blobDocNormativo;
	}

	public String getChrNombreEnlaceDocNormativ() {
		return this.chrNombreEnlaceDocNormativ;
	}

	public void setChrNombreEnlaceDocNormativ(String chrNombreEnlaceDocNormativ) {
		this.chrNombreEnlaceDocNormativ = chrNombreEnlaceDocNormativ;
	}

	public List<FondosEspeciale> getFondosEspeciales() {
		return this.fondosEspeciales;
	}

	public void setFondosEspeciales(List<FondosEspeciale> fondosEspeciales) {
		this.fondosEspeciales = fondosEspeciales;
	}

	public FondosEspeciale addFondosEspeciale(FondosEspeciale fondosEspeciale) {
		getFondosEspeciales().add(fondosEspeciale);
		fondosEspeciale.setDocumentoNormativoFondo(this);

		return fondosEspeciale;
	}

	public FondosEspeciale removeFondosEspeciale(FondosEspeciale fondosEspeciale) {
		getFondosEspeciales().remove(fondosEspeciale);
		fondosEspeciale.setDocumentoNormativoFondo(null);

		return fondosEspeciale;
	}

}