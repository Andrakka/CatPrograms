package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CONTRIBUCION_DERECHOS_SOC database table.
 * 
 */
@Entity
@Table(name="CONTRIBUCION_DERECHOS_SOC")
@NamedQuery(name="ContribucionDerechosSoc.findAll", query="SELECT c FROM ContribucionDerechosSoc c")
public class ContribucionDerechosSoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONTRIBUCION_DERECHOS_SOC_CSCCONTRIBUCIONDERSOC_GENERATOR", sequenceName="SEQ_CSC_CONTRIBUCION_DER_SOC")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONTRIBUCION_DERECHOS_SOC_CSCCONTRIBUCIONDERSOC_GENERATOR")
	@Column(name="CSC_CONTRIBUCION_DER_SOC")
	private long cscContribucionDerSoc;

	@Column(name="DER_SOCIAL_ALIM")
	private BigDecimal derSocialAlim;

	@Column(name="DER_SOCIAL_BECO")
	private BigDecimal derSocialBeco;

	@Column(name="DER_SOCIAL_EDU")
	private BigDecimal derSocialEdu;

	@Column(name="DER_SOCIAL_MAM")
	private BigDecimal derSocialMam;

	@Column(name="DER_SOCIAL_NING")
	private BigDecimal derSocialNing;

	@Column(name="DER_SOCIAL_NODIS")
	private BigDecimal derSocialNodis;

	@Column(name="DER_SOCIAL_SAL")
	private BigDecimal derSocialSal;

	@Column(name="DER_SOCIAL_SEGSOC")
	private BigDecimal derSocialSegsoc;

	@Column(name="DER_SOCIAL_TRA")
	private BigDecimal derSocialTra;

	@Column(name="DER_SOCIAL_VIV")
	private BigDecimal derSocialViv;

	public ContribucionDerechosSoc() {
	}

	public long getCscContribucionDerSoc() {
		return this.cscContribucionDerSoc;
	}

	public void setCscContribucionDerSoc(long cscContribucionDerSoc) {
		this.cscContribucionDerSoc = cscContribucionDerSoc;
	}

	public BigDecimal getDerSocialAlim() {
		return this.derSocialAlim;
	}

	public void setDerSocialAlim(BigDecimal derSocialAlim) {
		this.derSocialAlim = derSocialAlim;
	}

	public BigDecimal getDerSocialBeco() {
		return this.derSocialBeco;
	}

	public void setDerSocialBeco(BigDecimal derSocialBeco) {
		this.derSocialBeco = derSocialBeco;
	}

	public BigDecimal getDerSocialEdu() {
		return this.derSocialEdu;
	}

	public void setDerSocialEdu(BigDecimal derSocialEdu) {
		this.derSocialEdu = derSocialEdu;
	}

	public BigDecimal getDerSocialMam() {
		return this.derSocialMam;
	}

	public void setDerSocialMam(BigDecimal derSocialMam) {
		this.derSocialMam = derSocialMam;
	}

	public BigDecimal getDerSocialNing() {
		return this.derSocialNing;
	}

	public void setDerSocialNing(BigDecimal derSocialNing) {
		this.derSocialNing = derSocialNing;
	}

	public BigDecimal getDerSocialNodis() {
		return this.derSocialNodis;
	}

	public void setDerSocialNodis(BigDecimal derSocialNodis) {
		this.derSocialNodis = derSocialNodis;
	}

	public BigDecimal getDerSocialSal() {
		return this.derSocialSal;
	}

	public void setDerSocialSal(BigDecimal derSocialSal) {
		this.derSocialSal = derSocialSal;
	}

	public BigDecimal getDerSocialSegsoc() {
		return this.derSocialSegsoc;
	}

	public void setDerSocialSegsoc(BigDecimal derSocialSegsoc) {
		this.derSocialSegsoc = derSocialSegsoc;
	}

	public BigDecimal getDerSocialTra() {
		return this.derSocialTra;
	}

	public void setDerSocialTra(BigDecimal derSocialTra) {
		this.derSocialTra = derSocialTra;
	}

	public BigDecimal getDerSocialViv() {
		return this.derSocialViv;
	}

	public void setDerSocialViv(BigDecimal derSocialViv) {
		this.derSocialViv = derSocialViv;
	}

}