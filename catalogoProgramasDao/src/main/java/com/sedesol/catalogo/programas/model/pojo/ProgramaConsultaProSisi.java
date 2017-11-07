package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PROGRAMA_CONSULTA_PRO_SISI database table.
 * 
 */
@Entity
@Table(name="PROGRAMA_CONSULTA_PRO_SISI")
@NamedQuery(name="ProgramaConsultaProSisi.findAll", query="SELECT p FROM ProgramaConsultaProSisi p")
public class ProgramaConsultaProSisi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROGRAMA_CONSULTA_PRO_SISI_CSCPROGRAMACONPROSISI_GENERATOR", sequenceName="SEQ_CSC_PROGRAMA_CON_PRO_SISI", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROGRAMA_CONSULTA_PRO_SISI_CSCPROGRAMACONPROSISI_GENERATOR")
	@Column(name="CSC_PROGRAMA_CON_PRO_SISI")
	private long cscProgramaConProSisi;

	@Column(name="SN_ACEPTA")
	private BigDecimal snAcepta;

	//bi-directional many-to-one association to CConsultaProductosSerSisi
	@ManyToOne
	@JoinColumn(name="CSC_CONSULTA_PRO_SER_SISI_FK")
	private CConsultaProductosSerSisi CConsultaProductosSerSisi;

	//bi-directional many-to-one association to InsumosRegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_INSUMOS_REGISTRO_FK")
	private InsumosRegistroAdhesion insumosRegistroAdhesion;

	public ProgramaConsultaProSisi() {
	}

	public long getCscProgramaConProSisi() {
		return this.cscProgramaConProSisi;
	}

	public void setCscProgramaConProSisi(long cscProgramaConProSisi) {
		this.cscProgramaConProSisi = cscProgramaConProSisi;
	}

	public BigDecimal getSnAcepta() {
		return this.snAcepta;
	}

	public void setSnAcepta(BigDecimal snAcepta) {
		this.snAcepta = snAcepta;
	}

	public CConsultaProductosSerSisi getCConsultaProductosSerSisi() {
		return this.CConsultaProductosSerSisi;
	}

	public void setCConsultaProductosSerSisi(CConsultaProductosSerSisi CConsultaProductosSerSisi) {
		this.CConsultaProductosSerSisi = CConsultaProductosSerSisi;
	}

	public InsumosRegistroAdhesion getInsumosRegistroAdhesion() {
		return this.insumosRegistroAdhesion;
	}

	public void setInsumosRegistroAdhesion(InsumosRegistroAdhesion insumosRegistroAdhesion) {
		this.insumosRegistroAdhesion = insumosRegistroAdhesion;
	}

}