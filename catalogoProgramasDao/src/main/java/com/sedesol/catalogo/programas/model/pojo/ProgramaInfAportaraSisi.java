package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PROGRAMA_INF_APORTARA_SISI database table.
 * 
 */
@Entity
@Table(name="PROGRAMA_INF_APORTARA_SISI")
@NamedQuery(name="ProgramaInfAportaraSisi.findAll", query="SELECT p FROM ProgramaInfAportaraSisi p")
public class ProgramaInfAportaraSisi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROGRAMA_INF_APORTARA_SISI_CSCPROGRAMAINFAPOSISI_GENERATOR", sequenceName="SEQ_CSC_PROGRAMA_INF_APO_SISI",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROGRAMA_INF_APORTARA_SISI_CSCPROGRAMAINFAPOSISI_GENERATOR")
	@Column(name="CSC_PROGRAMA_INF_APO_SISI")
	private long cscProgramaInfApoSisi;

	@Column(name="SN_ACEPTA")
	private BigDecimal snAcepta;

	//bi-directional many-to-one association to CInformacionAportaraSisi
	@ManyToOne
	@JoinColumn(name="CSC_INFORMACION_APORTA_SISI_FK")
	private CInformacionAportaraSisi CInformacionAportaraSisi;

	//bi-directional many-to-one association to InsumosRegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_INSUMOS_REGISTRO_FK")
	private InsumosRegistroAdhesion insumosRegistroAdhesion;

	public ProgramaInfAportaraSisi() {
	}

	public long getCscProgramaInfApoSisi() {
		return this.cscProgramaInfApoSisi;
	}

	public void setCscProgramaInfApoSisi(long cscProgramaInfApoSisi) {
		this.cscProgramaInfApoSisi = cscProgramaInfApoSisi;
	}

	public BigDecimal getSnAcepta() {
		return this.snAcepta;
	}

	public void setSnAcepta(BigDecimal snAcepta) {
		this.snAcepta = snAcepta;
	}

	public CInformacionAportaraSisi getCInformacionAportaraSisi() {
		return this.CInformacionAportaraSisi;
	}

	public void setCInformacionAportaraSisi(CInformacionAportaraSisi CInformacionAportaraSisi) {
		this.CInformacionAportaraSisi = CInformacionAportaraSisi;
	}

	public InsumosRegistroAdhesion getInsumosRegistroAdhesion() {
		return this.insumosRegistroAdhesion;
	}

	public void setInsumosRegistroAdhesion(InsumosRegistroAdhesion insumosRegistroAdhesion) {
		this.insumosRegistroAdhesion = insumosRegistroAdhesion;
	}

}