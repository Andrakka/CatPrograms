package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_NOMBRE_COLABORADOR database table.
 * 
 */
@Entity
@Table(name="C_NOMBRE_COLABORADOR")
@NamedQuery(name="CNombreColaborador.findAll", query="SELECT c FROM CNombreColaborador c")
public class CNombreColaborador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_NOMBRE_COLABORADOR_CSCNOMBRECOLABORADOR_GENERATOR", sequenceName="SEQ_CSC_NOMBRE_COLABORADOR",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_NOMBRE_COLABORADOR_CSCNOMBRECOLABORADOR_GENERATOR")
	@Column(name="CSC_NOMBRE_COLABORADOR")
	private long cscNombreColaborador;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to ColaboradorSisi
	@OneToMany(mappedBy="cNombreColaborador")
	@JsonIgnore
	private List<ColaboradorSisi> colaboradorSisis;

	public CNombreColaborador() {
	}

	public long getCscNombreColaborador() {
		return this.cscNombreColaborador;
	}

	public void setCscNombreColaborador(long cscNombreColaborador) {
		this.cscNombreColaborador = cscNombreColaborador;
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
		colaboradorSisi.setcNombreColaborador(this);

		return colaboradorSisi;
	}

	public ColaboradorSisi removeColaboradorSisi(ColaboradorSisi colaboradorSisi) {
		getColaboradorSisis().remove(colaboradorSisi);
		colaboradorSisi.setcNombreColaborador(null);

		return colaboradorSisi;
	}

}