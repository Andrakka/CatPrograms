package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the UA_SIN_PROGRAMA database table.
 * 
 */
@Entity
@Table(name="UA_SIN_PROGRAMA")
@NamedQuery(name="UaSinPrograma.findAll", query="SELECT u FROM UaSinPrograma u")
public class UaSinPrograma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="UA_SIN_PROGRAMA_CSCUASINPROGRAMA_GENERATOR", sequenceName="SEQ_CSC_UA_SIN_PROGRAMA",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UA_SIN_PROGRAMA_CSCUASINPROGRAMA_GENERATOR")
	@Column(name="CSC_UA_SIN_PROGRAMA")
	private long cscUaSinPrograma;

	@Column(name="CHR_CLAVE_UA_SIN_PRO")
	private String chrClaveUaSinPro;

	@Column(name="CHR_ESTRATEGIA_ACCIONES_UA_SIN")
	private String chrEstrategiaAccionesUaSin;

	@Column(name="CHR_FUNCION_UA_SIN_PRO")
	private String chrFuncionUaSinPro;

	@Column(name="CHR_NOMBRE_UA_SIN_PRO")
	private String chrNombreUaSinPro;

	//bi-directional many-to-one association to InsumosRegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_INSUMOS_REGISTRO_FK")
	private InsumosRegistroAdhesion insumosRegistroAdhesion;

	public UaSinPrograma() {
	}

	public long getCscUaSinPrograma() {
		return this.cscUaSinPrograma;
	}

	public void setCscUaSinPrograma(long cscUaSinPrograma) {
		this.cscUaSinPrograma = cscUaSinPrograma;
	}

	public String getChrClaveUaSinPro() {
		return this.chrClaveUaSinPro;
	}

	public void setChrClaveUaSinPro(String chrClaveUaSinPro) {
		this.chrClaveUaSinPro = chrClaveUaSinPro;
	}

	public String getChrEstrategiaAccionesUaSin() {
		return this.chrEstrategiaAccionesUaSin;
	}

	public void setChrEstrategiaAccionesUaSin(String chrEstrategiaAccionesUaSin) {
		this.chrEstrategiaAccionesUaSin = chrEstrategiaAccionesUaSin;
	}

	public String getChrFuncionUaSinPro() {
		return this.chrFuncionUaSinPro;
	}

	public void setChrFuncionUaSinPro(String chrFuncionUaSinPro) {
		this.chrFuncionUaSinPro = chrFuncionUaSinPro;
	}

	public String getChrNombreUaSinPro() {
		return this.chrNombreUaSinPro;
	}

	public void setChrNombreUaSinPro(String chrNombreUaSinPro) {
		this.chrNombreUaSinPro = chrNombreUaSinPro;
	}

	public InsumosRegistroAdhesion getInsumosRegistroAdhesion() {
		return this.insumosRegistroAdhesion;
	}

	public void setInsumosRegistroAdhesion(InsumosRegistroAdhesion insumosRegistroAdhesion) {
		this.insumosRegistroAdhesion = insumosRegistroAdhesion;
	}

}