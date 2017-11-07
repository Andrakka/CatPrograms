package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;


/**
 * The persistent class for the PROGRAMA_CUAPS database table.
 * 
 */
@Entity
@Table(name="PROGRAMA_CUAPS")
@NamedQuery(name="ProgramaCuap.findAll", query="SELECT p FROM ProgramaCuap p")
public class ProgramaCuap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROGRAMA_CUAPS_CSCPROGRAMACUAPS_GENERATOR", sequenceName="SEQ_CSC_PROGRAMA_CUAPS", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROGRAMA_CUAPS_CSCPROGRAMACUAPS_GENERATOR")
	@Column(name="CSC_PROGRAMA_CUAPS")
	private long cscProgramaCuaps;

	@Column(name="CHR_CLAVE_PRESPUPUESTAL_PRO")
	private String chrClavePrespupuestalPro;
	
	@Column(name="CHR_DESCRIPCION_DEPENDENCIA")
	private String chrDescripcionDependencia;

	@Column(name="CHR_NOMBRE_PROGRAMA_CUAPS")
	private String chrNombreProgramaCuaps;

	//bi-directional many-to-one association to CDependencia
	@ManyToOne
	@JoinColumn(name="CSC_DEPENDENCIA_FK")
	private CDependencia CDependencia;

	//bi-directional many-to-one association to InsumosRegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_INSUMOS_REGISTRO_FK")
	private InsumosRegistroAdhesion insumosRegistroAdhesion;

	public ProgramaCuap() {
	}

	public long getCscProgramaCuaps() {
		return this.cscProgramaCuaps;
	}

	public void setCscProgramaCuaps(long cscProgramaCuaps) {
		this.cscProgramaCuaps = cscProgramaCuaps;
	}

	public String getChrClavePrespupuestalPro() {
		return this.chrClavePrespupuestalPro;
	}

	public void setChrClavePrespupuestalPro(String chrClavePrespupuestalPro) {
		this.chrClavePrespupuestalPro = chrClavePrespupuestalPro;
	}

	public String getChrNombreProgramaCuaps() {
		return this.chrNombreProgramaCuaps;
	}

	public void setChrNombreProgramaCuaps(String chrNombreProgramaCuaps) {
		this.chrNombreProgramaCuaps = chrNombreProgramaCuaps;
	}

	public CDependencia getCDependencia() {
		return this.CDependencia;
	}

	public void setCDependencia(CDependencia CDependencia) {
		this.CDependencia = CDependencia;
	}

	public InsumosRegistroAdhesion getInsumosRegistroAdhesion() {
		return this.insumosRegistroAdhesion;
	}

	public void setInsumosRegistroAdhesion(InsumosRegistroAdhesion insumosRegistroAdhesion) {
		this.insumosRegistroAdhesion = insumosRegistroAdhesion;
	}

}