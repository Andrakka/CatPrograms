package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FONDOS_ESPECIALES_REG_ADHESION database table.
 * 
 */
@Entity
@Table(name="FONDOS_ESPECIALES_REG_ADHESION")
@NamedQuery(name="FondosEspecialesRegAdhesion.findAll", query="SELECT f FROM FondosEspecialesRegAdhesion f")
public class FondosEspecialesRegAdhesion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FONDOS_ESPECIALES_REG_ADHESION_CSCFONDOSESPREGADH_GENERATOR", sequenceName="SEQ_CSC_FONDOS_ESP_REG_ADH",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FONDOS_ESPECIALES_REG_ADHESION_CSCFONDOSESPREGADH_GENERATOR")
	@Column(name="CSC_FONDOS_ESP_REG_ADH")
	private long cscFondosEspRegAdh;

	//bi-directional many-to-one association to CDescripcionFondo
	@ManyToOne
	@JoinColumn(name="CSC_DESCRIPCION_FONDO_FK")
	private CDescripcionFondo CDescripcionFondo;

	//bi-directional many-to-one association to InsumosRegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_INSUMOS_REGISTRO_FK")
	private InsumosRegistroAdhesion insumosRegistroAdhesion;

	public FondosEspecialesRegAdhesion() {
	}

	public long getCscFondosEspRegAdh() {
		return this.cscFondosEspRegAdh;
	}

	public void setCscFondosEspRegAdh(long cscFondosEspRegAdh) {
		this.cscFondosEspRegAdh = cscFondosEspRegAdh;
	}

	public CDescripcionFondo getCDescripcionFondo() {
		return this.CDescripcionFondo;
	}

	public void setCDescripcionFondo(CDescripcionFondo CDescripcionFondo) {
		this.CDescripcionFondo = CDescripcionFondo;
	}

	public InsumosRegistroAdhesion getInsumosRegistroAdhesion() {
		return this.insumosRegistroAdhesion;
	}

	public void setInsumosRegistroAdhesion(InsumosRegistroAdhesion insumosRegistroAdhesion) {
		this.insumosRegistroAdhesion = insumosRegistroAdhesion;
	}

}