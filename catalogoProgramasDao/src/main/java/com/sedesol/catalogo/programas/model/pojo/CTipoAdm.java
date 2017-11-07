package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_TIPO_ADM database table.
 * 
 */
@Entity
@Table(name="C_TIPO_ADM")
@NamedQuery(name="CTipoAdm.findAll", query="SELECT c FROM CTipoAdm c")
public class CTipoAdm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_TIPO_ADM_CSCTIPOADM_GENERATOR", sequenceName="SEQ_CSC_TIPO_ADM")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_TIPO_ADM_CSCTIPOADM_GENERATOR")
	@Column(name="CSC_TIPO_ADM")
	private long cscTipoAdm;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	/*
	//bi-directional many-to-one association to RegistrosAdministrativo
	@OneToMany(mappedBy="CTipoAdm")
	private List<RegistrosAdministrativo> registrosAdministrativos;*/

	public CTipoAdm() {
	}

	public long getCscTipoAdm() {
		return this.cscTipoAdm;
	}

	public void setCscTipoAdm(long cscTipoAdm) {
		this.cscTipoAdm = cscTipoAdm;
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
	public List<RegistrosAdministrativo> getRegistrosAdministrativos() {
		return this.registrosAdministrativos;
	}

	public void setRegistrosAdministrativos(List<RegistrosAdministrativo> registrosAdministrativos) {
		this.registrosAdministrativos = registrosAdministrativos;
	}

	public RegistrosAdministrativo addRegistrosAdministrativo(RegistrosAdministrativo registrosAdministrativo) {
		getRegistrosAdministrativos().add(registrosAdministrativo);
		registrosAdministrativo.setCTipoAdm(this);

		return registrosAdministrativo;
	}

	public RegistrosAdministrativo removeRegistrosAdministrativo(RegistrosAdministrativo registrosAdministrativo) {
		getRegistrosAdministrativos().remove(registrosAdministrativo);
		registrosAdministrativo.setCTipoAdm(null);

		return registrosAdministrativo;
	}*/

}