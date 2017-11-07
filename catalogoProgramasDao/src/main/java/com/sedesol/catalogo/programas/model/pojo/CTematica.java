package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_TEMATICA database table.
 * 
 */
@Entity
@Table(name="C_TEMATICA")
@NamedQuery(name="CTematica.findAll", query="SELECT c FROM CTematica c")
public class CTematica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_TEMATICA_CSCTEMATICA_GENERATOR", sequenceName="SEQ_CSC_TEMATICA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_TEMATICA_CSCTEMATICA_GENERATOR")
	@Column(name="CSC_TEMATICA")
	private long cscTematica;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to Caracteristica
	@OneToMany(mappedBy="CTematica")
	private List<Caracteristica> caracteristicas;

	public CTematica() {
	}

	public long getCscTematica() {
		return this.cscTematica;
	}

	public void setCscTematica(long cscTematica) {
		this.cscTematica = cscTematica;
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

	public List<Caracteristica> getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Caracteristica addCaracteristica(Caracteristica caracteristica) {
		getCaracteristicas().add(caracteristica);
		caracteristica.setCTematica(this);

		return caracteristica;
	}

	public Caracteristica removeCaracteristica(Caracteristica caracteristica) {
		getCaracteristicas().remove(caracteristica);
		caracteristica.setCTematica(null);

		return caracteristica;
	}

}