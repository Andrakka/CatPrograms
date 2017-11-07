package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_VARIABLES_ADM database table.
 * 
 */
@Entity
@Table(name="C_VARIABLES_ADM")
@NamedQuery(name="CVariablesAdm.findAll", query="SELECT c FROM CVariablesAdm c")
public class CVariablesAdm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_VARIABLES_ADM_CSCVARIABLESADM_GENERATOR", sequenceName="SEQ_CSC_VARIABLES_ADM")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_VARIABLES_ADM_CSCVARIABLESADM_GENERATOR")
	@Column(name="CSC_VARIABLES_ADM")
	private long cscVariablesAdm;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to RegistrosVariable
	@OneToMany(mappedBy="CVariablesAdm")
	private List<RegistrosVariable> registrosVariables;

	public CVariablesAdm() {
	}

	public long getCscVariablesAdm() {
		return this.cscVariablesAdm;
	}

	public void setCscVariablesAdm(long cscVariablesAdm) {
		this.cscVariablesAdm = cscVariablesAdm;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}
	
	/*
	public List<RegistrosVariable> getRegistrosVariables() {
		return this.registrosVariables;
	}*/

	public void setRegistrosVariables(List<RegistrosVariable> registrosVariables) {
		this.registrosVariables = registrosVariables;
	}

	/*
	public RegistrosVariable addRegistrosVariable(RegistrosVariable registrosVariable) {
		getRegistrosVariables().add(registrosVariable);
		registrosVariable.setCVariablesAdm(this);

		return registrosVariable;
	}

	public RegistrosVariable removeRegistrosVariable(RegistrosVariable registrosVariable) {
		getRegistrosVariables().remove(registrosVariable);
		registrosVariable.setCVariablesAdm(null);

		return registrosVariable;
	}*/

}