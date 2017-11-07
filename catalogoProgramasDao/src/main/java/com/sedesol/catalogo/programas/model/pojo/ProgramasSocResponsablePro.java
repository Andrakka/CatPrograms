package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PROGRAMAS_SOC_RESPONSABLE_PRO database table.
 * 
 */
@Entity
@Table(name="PROGRAMAS_SOC_RESPONSABLE_PRO")
@NamedQuery(name="ProgramasSocResponsablePro.findAll", query="SELECT p FROM ProgramasSocResponsablePro p")
public class ProgramasSocResponsablePro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROGRAMAS_SOC_RESPONSABLE_PRO_CSCPROGRAMARESPRO_GENERATOR", sequenceName="SEQ_CSC_PROGRAMA_RES_PRO", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROGRAMAS_SOC_RESPONSABLE_PRO_CSCPROGRAMARESPRO_GENERATOR")
	@Column(name="CSC_PROGRAMA_RES_PRO")
	private long cscProgramaResPro;

	//bi-directional many-to-one association to InsumosRegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_INSUMOS_REGISTRO_FK")
	private InsumosRegistroAdhesion insumosRegistroAdhesion;

	//bi-directional many-to-one association to ResponsableProgramaSocial
	@ManyToOne
	@JoinColumn(name="CSC_RESPONSABLE_PRO_SOC_FK")
	private ResponsableProgramaSocial responsableProgramaSocial;

	public ProgramasSocResponsablePro() {
	}

	public long getCscProgramaResPro() {
		return this.cscProgramaResPro;
	}

	public void setCscProgramaResPro(long cscProgramaResPro) {
		this.cscProgramaResPro = cscProgramaResPro;
	}

	public InsumosRegistroAdhesion getInsumosRegistroAdhesion() {
		return this.insumosRegistroAdhesion;
	}

	public void setInsumosRegistroAdhesion(InsumosRegistroAdhesion insumosRegistroAdhesion) {
		this.insumosRegistroAdhesion = insumosRegistroAdhesion;
	}

	public ResponsableProgramaSocial getResponsableProgramaSocial() {
		return this.responsableProgramaSocial;
	}

	public void setResponsableProgramaSocial(ResponsableProgramaSocial responsableProgramaSocial) {
		this.responsableProgramaSocial = responsableProgramaSocial;
	}

}