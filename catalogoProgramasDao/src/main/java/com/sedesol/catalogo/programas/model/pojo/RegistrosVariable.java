package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the REGISTROS_VARIABLES database table.
 * 
 */
@Entity
@Table(name="REGISTROS_VARIABLES")
@NamedQuery(name="RegistrosVariable.findAll", query="SELECT r FROM RegistrosVariable r")
public class RegistrosVariable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REGISTROS_VARIABLES_CSCREGISTROSVARIABLES_GENERATOR", sequenceName="SEQ_CSC_REGISTROS_VARIABLES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REGISTROS_VARIABLES_CSCREGISTROSVARIABLES_GENERATOR")
	@Column(name="CSC_REGISTROS_VARIABLES")
	private long cscRegistrosVariables;

	//bi-directional many-to-one association to CVariablesAdm
	@ManyToOne
	@JoinColumn(name="CSC_VARIABLES_ADM_FK")
	private CVariablesAdm CVariablesAdm;

	//bi-directional many-to-one association to RegistrosAdministrativo
	@ManyToOne
	@JoinColumn(name="CSC_REGISTROS_ADMIN_FK")
	private RegistrosAdministrativo registrosAdministrativo;

	public RegistrosVariable() {
	}

	public long getCscRegistrosVariables() {
		return this.cscRegistrosVariables;
	}

	public void setCscRegistrosVariables(long cscRegistrosVariables) {
		this.cscRegistrosVariables = cscRegistrosVariables;
	}

	public CVariablesAdm getCVariablesAdm() {
		return this.CVariablesAdm;
	}

	public void setCVariablesAdm(CVariablesAdm CVariablesAdm) {
		this.CVariablesAdm = CVariablesAdm;
	}

	public RegistrosAdministrativo getRegistrosAdministrativo() {
		return this.registrosAdministrativo;
	}

	public void setRegistrosAdministrativo(RegistrosAdministrativo registrosAdministrativo) {
		this.registrosAdministrativo = registrosAdministrativo;
	}

}