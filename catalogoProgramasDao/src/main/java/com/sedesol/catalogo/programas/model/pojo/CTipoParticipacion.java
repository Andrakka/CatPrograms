package com.sedesol.catalogo.programas.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_TIPO_PARTICIPACION database table.
 * 
 */
@Entity
@Table(name="C_TIPO_PARTICIPACION")
@NamedQuery(name="CTipoParticipacion.findAll", query="SELECT c FROM CTipoParticipacion c")
public class CTipoParticipacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_TIPO_PARTICIPACION_CSCTIPOPARTICIPACION_GENERATOR", sequenceName="SEQ_CSC_TIPO_PARTICIPACION", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_TIPO_PARTICIPACION_CSCTIPOPARTICIPACION_GENERATOR")
	@Column(name="CSC_TIPO_PARTICIPACION")
	private long cscTipoParticipacion;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to CoparticionOtrosPro
	@OneToMany(mappedBy="CTipoParticipacion")
	@JsonIgnore
	private List<CoparticionOtrosPro> coparticionOtrosPros;

	public CTipoParticipacion() {
	}

	public long getCscTipoParticipacion() {
		return this.cscTipoParticipacion;
	}

	public void setCscTipoParticipacion(long cscTipoParticipacion) {
		this.cscTipoParticipacion = cscTipoParticipacion;
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
		coparticionOtrosPro.setCTipoParticipacion(this);

		return coparticionOtrosPro;
	}

	public CoparticionOtrosPro removeCoparticionOtrosPro(CoparticionOtrosPro coparticionOtrosPro) {
		getCoparticionOtrosPros().remove(coparticionOtrosPro);
		coparticionOtrosPro.setCTipoParticipacion(null);

		return coparticionOtrosPro;
	}

}