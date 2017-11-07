package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_PARTICIPANTES database table.
 * 
 */
@Entity
@Table(name="C_PARTICIPANTES")
@NamedQuery(name="CParticipante.findAll", query="SELECT c FROM CParticipante c")
public class CParticipante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_PARTICIPANTES_CSCPARTICIPANTES_GENERATOR", sequenceName="SEQ_CSC_PARTICIPANTES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_PARTICIPANTES_CSCPARTICIPANTES_GENERATOR")
	@Column(name="CSC_PARTICIPANTES")
	private long cscParticipantes;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to CoparticionOtrosPro
	@OneToMany(mappedBy="CParticipante")
	private List<CoparticionOtrosPro> coparticionOtrosPros;

	public CParticipante() {
	}

	public long getCscParticipantes() {
		return this.cscParticipantes;
	}

	public void setCscParticipantes(long cscParticipantes) {
		this.cscParticipantes = cscParticipantes;
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

	public List<CoparticionOtrosPro> getCoparticionOtrosPros() {
		return this.coparticionOtrosPros;
	}

	public void setCoparticionOtrosPros(List<CoparticionOtrosPro> coparticionOtrosPros) {
		this.coparticionOtrosPros = coparticionOtrosPros;
	}

	public CoparticionOtrosPro addCoparticionOtrosPro(CoparticionOtrosPro coparticionOtrosPro) {
		getCoparticionOtrosPros().add(coparticionOtrosPro);
		coparticionOtrosPro.setCParticipante(this);

		return coparticionOtrosPro;
	}

	public CoparticionOtrosPro removeCoparticionOtrosPro(CoparticionOtrosPro coparticionOtrosPro) {
		getCoparticionOtrosPros().remove(coparticionOtrosPro);
		coparticionOtrosPro.setCParticipante(null);

		return coparticionOtrosPro;
	}

}