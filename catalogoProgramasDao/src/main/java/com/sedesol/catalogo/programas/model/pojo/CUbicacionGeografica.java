package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_UBICACION_GEOGRAFICA database table.
 * 
 */
@Entity
@Table(name="C_UBICACION_GEOGRAFICA")
@NamedQuery(name="CUbicacionGeografica.findAll", query="SELECT c FROM CUbicacionGeografica c")
public class CUbicacionGeografica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_UBICACION_GEOGRAFICA_CSCUBICACIONGEOGRAFICA_GENERATOR", sequenceName="SEQ_CSC_UBICACION_GEOGRAFICA",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_UBICACION_GEOGRAFICA_CSCUBICACIONGEOGRAFICA_GENERATOR")
	@Column(name="CSC_UBICACION_GEOGRAFICA")
	private long cscUbicacionGeografica;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to ColaboradorSisi
	@OneToMany(mappedBy="cUbicacionGeografica")
	@JsonIgnore
	private List<ColaboradorSisi> colaboradorSisis;

	public CUbicacionGeografica() {
	}

	public long getCscUbicacionGeografica() {
		return this.cscUbicacionGeografica;
	}

	public void setCscUbicacionGeografica(long cscUbicacionGeografica) {
		this.cscUbicacionGeografica = cscUbicacionGeografica;
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

	public List<ColaboradorSisi> getColaboradorSisis() {
		return this.colaboradorSisis;
	}

	public void setColaboradorSisis(List<ColaboradorSisi> colaboradorSisis) {
		this.colaboradorSisis = colaboradorSisis;
	}

	public ColaboradorSisi addColaboradorSisi(ColaboradorSisi colaboradorSisi) {
		getColaboradorSisis().add(colaboradorSisi);
		colaboradorSisi.setcUbicacionGeografica(this);

		return colaboradorSisi;
	}

	public ColaboradorSisi removeColaboradorSisi(ColaboradorSisi colaboradorSisi) {
		getColaboradorSisis().remove(colaboradorSisi);
		colaboradorSisi.setcUbicacionGeografica(null);

		return colaboradorSisi;
	}

}