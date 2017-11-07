package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the INDICES database table.
 * 
 */
@Entity
@Table(name="INDICES")
@NamedQuery(name="Indice.findAll", query="SELECT i FROM Indice i")
public class Indice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="INDICES_CSCINDICES_GENERATOR", sequenceName="SEQ_CSC_INDICES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INDICES_CSCINDICES_GENERATOR")
	@Column(name="CSC_INDICES")
	private long cscIndices;

	@Column(name="INDIC_A")
	private BigDecimal indicA;

	@Column(name="INDIC_B")
	private BigDecimal indicB;

	@Column(name="INDIC_C")
	private BigDecimal indicC;

	@Column(name="INDIC_D")
	private BigDecimal indicD;

	@Column(name="INDIC_E")
	private BigDecimal indicE;

	@Column(name="INDIC_F")
	private BigDecimal indicF;

	@Column(name="INDIC_G")
	private BigDecimal indicG;

	@Column(name="INDIC_H")
	private BigDecimal indicH;

	@Column(name="INDIC_I")
	private BigDecimal indicI;

	@Column(name="INDIC_J")
	private BigDecimal indicJ;

	@Column(name="INDIC_K")
	private BigDecimal indicK;

	@Column(name="INDIC_L")
	private BigDecimal indicL;

	@Column(name="INDIC_M")
	private BigDecimal indicM;

	@Column(name="INDIC_N")
	private BigDecimal indicN;

	@Column(name="INDIC_O")
	private BigDecimal indicO;

	@Column(name="INDIC_P")
	private BigDecimal indicP;

	@Column(name="INDIC_Q")
	private BigDecimal indicQ;

	@Column(name="INDIC_R")
	private BigDecimal indicR;

	@Column(name="INDIC_S")
	private BigDecimal indicS;

	@Column(name="INDIC_T")
	private BigDecimal indicT;

	//bi-directional many-to-one association to Caracteristica
	@OneToMany(mappedBy="indice")
	private List<Caracteristica> caracteristicas;

	public Indice() {
	}

	public long getCscIndices() {
		return this.cscIndices;
	}

	public void setCscIndices(long cscIndices) {
		this.cscIndices = cscIndices;
	}

	public BigDecimal getIndicA() {
		return this.indicA;
	}

	public void setIndicA(BigDecimal indicA) {
		this.indicA = indicA;
	}

	public BigDecimal getIndicB() {
		return this.indicB;
	}

	public void setIndicB(BigDecimal indicB) {
		this.indicB = indicB;
	}

	public BigDecimal getIndicC() {
		return this.indicC;
	}

	public void setIndicC(BigDecimal indicC) {
		this.indicC = indicC;
	}

	public BigDecimal getIndicD() {
		return this.indicD;
	}

	public void setIndicD(BigDecimal indicD) {
		this.indicD = indicD;
	}

	public BigDecimal getIndicE() {
		return this.indicE;
	}

	public void setIndicE(BigDecimal indicE) {
		this.indicE = indicE;
	}

	public BigDecimal getIndicF() {
		return this.indicF;
	}

	public void setIndicF(BigDecimal indicF) {
		this.indicF = indicF;
	}

	public BigDecimal getIndicG() {
		return this.indicG;
	}

	public void setIndicG(BigDecimal indicG) {
		this.indicG = indicG;
	}

	public BigDecimal getIndicH() {
		return this.indicH;
	}

	public void setIndicH(BigDecimal indicH) {
		this.indicH = indicH;
	}

	public BigDecimal getIndicI() {
		return this.indicI;
	}

	public void setIndicI(BigDecimal indicI) {
		this.indicI = indicI;
	}

	public BigDecimal getIndicJ() {
		return this.indicJ;
	}

	public void setIndicJ(BigDecimal indicJ) {
		this.indicJ = indicJ;
	}

	public BigDecimal getIndicK() {
		return this.indicK;
	}

	public void setIndicK(BigDecimal indicK) {
		this.indicK = indicK;
	}

	public BigDecimal getIndicL() {
		return this.indicL;
	}

	public void setIndicL(BigDecimal indicL) {
		this.indicL = indicL;
	}

	public BigDecimal getIndicM() {
		return this.indicM;
	}

	public void setIndicM(BigDecimal indicM) {
		this.indicM = indicM;
	}

	public BigDecimal getIndicN() {
		return this.indicN;
	}

	public void setIndicN(BigDecimal indicN) {
		this.indicN = indicN;
	}

	public BigDecimal getIndicO() {
		return this.indicO;
	}

	public void setIndicO(BigDecimal indicO) {
		this.indicO = indicO;
	}

	public BigDecimal getIndicP() {
		return this.indicP;
	}

	public void setIndicP(BigDecimal indicP) {
		this.indicP = indicP;
	}

	public BigDecimal getIndicQ() {
		return this.indicQ;
	}

	public void setIndicQ(BigDecimal indicQ) {
		this.indicQ = indicQ;
	}

	public BigDecimal getIndicR() {
		return this.indicR;
	}

	public void setIndicR(BigDecimal indicR) {
		this.indicR = indicR;
	}

	public BigDecimal getIndicS() {
		return this.indicS;
	}

	public void setIndicS(BigDecimal indicS) {
		this.indicS = indicS;
	}

	public BigDecimal getIndicT() {
		return this.indicT;
	}

	public void setIndicT(BigDecimal indicT) {
		this.indicT = indicT;
	}

	public List<Caracteristica> getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Caracteristica addCaracteristica(Caracteristica caracteristica) {
		getCaracteristicas().add(caracteristica);
		caracteristica.setIndice(this);

		return caracteristica;
	}

	public Caracteristica removeCaracteristica(Caracteristica caracteristica) {
		getCaracteristicas().remove(caracteristica);
		caracteristica.setIndice(null);

		return caracteristica;
	}

}