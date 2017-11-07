package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_INFO_INTE_ADM database table.
 * 
 */
@Entity
@Table(name="C_INFO_INTE_ADM")
@NamedQuery(name="CInfoInteAdm.findAll", query="SELECT c FROM CInfoInteAdm c")
public class CInfoInteAdm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_INFO_INTE_ADM_CSCINFOINTEADM_GENERATOR", sequenceName="SEQ_CSC_INFO_INTE_ADM")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_INFO_INTE_ADM_CSCINFOINTEADM_GENERATOR")
	@Column(name="CSC_INFO_INTE_ADM")
	private long cscInfoInteAdm;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	/*
	//bi-directional many-to-one association to RegistrosAdministrativo
	@OneToMany(mappedBy="CInfoInteAdm")
	private List<RegistrosAdministrativo> registrosAdministrativos;*/

	public CInfoInteAdm() {
	}

	public long getCscInfoInteAdm() {
		return this.cscInfoInteAdm;
	}

	public void setCscInfoInteAdm(long cscInfoInteAdm) {
		this.cscInfoInteAdm = cscInfoInteAdm;
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
		registrosAdministrativo.setCInfoInteAdm(this);

		return registrosAdministrativo;
	}

	public RegistrosAdministrativo removeRegistrosAdministrativo(RegistrosAdministrativo registrosAdministrativo) {
		getRegistrosAdministrativos().remove(registrosAdministrativo);
		registrosAdministrativo.setCInfoInteAdm(null);

		return registrosAdministrativo;
	}*/

}