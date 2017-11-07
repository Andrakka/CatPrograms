package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_FORMATO_REGISTRO_ADM database table.
 * 
 */
@Entity
@Table(name="C_FORMATO_REGISTRO_ADM")
@NamedQuery(name="CFormatoRegistroAdm.findAll", query="SELECT c FROM CFormatoRegistroAdm c")
public class CFormatoRegistroAdm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_FORMATO_REGISTRO_ADM_CSCFORMATOREGADM_GENERATOR", sequenceName="SEQ_CSC_FORMATO_REG_ADM")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_FORMATO_REGISTRO_ADM_CSCFORMATOREGADM_GENERATOR")
	@Column(name="CSC_FORMATO_REG_ADM")
	private long cscFormatoRegAdm;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	/*
	//bi-directional many-to-one association to RegistrosAdministrativo
	@OneToMany(mappedBy="CFormatoRegistroAdm")
	private List<RegistrosAdministrativo> registrosAdministrativos;*/

	public CFormatoRegistroAdm() {
	}

	public long getCscFormatoRegAdm() {
		return this.cscFormatoRegAdm;
	}

	public void setCscFormatoRegAdm(long cscFormatoRegAdm) {
		this.cscFormatoRegAdm = cscFormatoRegAdm;
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
		registrosAdministrativo.setCFormatoRegistroAdm(this);

		return registrosAdministrativo;
	}

	public RegistrosAdministrativo removeRegistrosAdministrativo(RegistrosAdministrativo registrosAdministrativo) {
		getRegistrosAdministrativos().remove(registrosAdministrativo);
		registrosAdministrativo.setCFormatoRegistroAdm(null);

		return registrosAdministrativo;
	}*/

}