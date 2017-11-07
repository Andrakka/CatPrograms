package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_MIR database table.
 * 
 */
@Entity
@Table(name="C_MIR")
@NamedQuery(name="CMir.findAll", query="SELECT c FROM CMir c")
public class CMir implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_MIR_CSCMIR_GENERATOR", sequenceName="SEQ_CSC_MIR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_MIR_CSCMIR_GENERATOR")
	@Column(name="CSC_MIR")
	private long cscMir;

	@Lob
	@Column(name="BLOB_MIR")
	private byte[] blobMir;

	@Column(name="CVE_PP")
	private BigDecimal cvePp;

	@Column(name="CVE_RAMO")
	private BigDecimal cveRamo;

	private BigDecimal presupuesto;

	private String programa;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to DetallePrograma
	@OneToMany(mappedBy="CMir")
	private List<DetallePrograma> detalleProgramas;

	public CMir() {
	}

	public long getCscMir() {
		return this.cscMir;
	}

	public void setCscMir(long cscMir) {
		this.cscMir = cscMir;
	}

	public byte[] getBlobMir() {
		return this.blobMir;
	}

	public void setBlobMir(byte[] blobMir) {
		this.blobMir = blobMir;
	}

	public BigDecimal getCvePp() {
		return this.cvePp;
	}

	public void setCvePp(BigDecimal cvePp) {
		this.cvePp = cvePp;
	}

	public BigDecimal getCveRamo() {
		return this.cveRamo;
	}

	public void setCveRamo(BigDecimal cveRamo) {
		this.cveRamo = cveRamo;
	}

	public BigDecimal getPresupuesto() {
		return this.presupuesto;
	}

	public void setPresupuesto(BigDecimal presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getPrograma() {
		return this.programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}

	public List<DetallePrograma> getDetalleProgramas() {
		return this.detalleProgramas;
	}

	public void setDetalleProgramas(List<DetallePrograma> detalleProgramas) {
		this.detalleProgramas = detalleProgramas;
	}

	public DetallePrograma addDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().add(detallePrograma);
		//detallePrograma.setCMir(this);

		return detallePrograma;
	}

	public DetallePrograma removeDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().remove(detallePrograma);
		//detallePrograma.setCMir(null);

		return detallePrograma;
	}

}