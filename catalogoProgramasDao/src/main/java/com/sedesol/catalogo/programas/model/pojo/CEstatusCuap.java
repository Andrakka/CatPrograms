package com.sedesol.catalogo.programas.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_ESTATUS_CUAPS database table.
 * 
 */
@Entity
@Table(name="C_ESTATUS_CUAPS")
@NamedQuery(name="CEstatusCuap.findAll", query="SELECT c FROM CEstatusCuap c")
public class CEstatusCuap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_ESTATUS_CUAPS_CSCESTATUSCUAPS_GENERATOR", sequenceName="SEQ_CSC_ESTATUS_CUAPS", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_ESTATUS_CUAPS_CSCESTATUSCUAPS_GENERATOR")
	@Column(name="CSC_ESTATUS_CUAPS")
	private long cscEstatusCuaps;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to Cuap
	@OneToMany(mappedBy="CEstatusCuap")
	@JsonIgnore
	private List<Cuap> cuaps;

	public CEstatusCuap() {
	}

	public long getCscEstatusCuaps() {
		return this.cscEstatusCuaps;
	}

	public void setCscEstatusCuaps(long cscEstatusCuaps) {
		this.cscEstatusCuaps = cscEstatusCuaps;
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

	public List<Cuap> getCuaps() {
		return this.cuaps;
	}

	public void setCuaps(List<Cuap> cuaps) {
		this.cuaps = cuaps;
	}

	public Cuap addCuap(Cuap cuap) {
		getCuaps().add(cuap);
		cuap.setCEstatusCuap(this);

		return cuap;
	}

	public Cuap removeCuap(Cuap cuap) {
		getCuaps().remove(cuap);
		cuap.setCEstatusCuap(null);

		return cuap;
	}

}