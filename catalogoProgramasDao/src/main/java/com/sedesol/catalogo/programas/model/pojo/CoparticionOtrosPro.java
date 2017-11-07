package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COPARTICION_OTROS_PRO database table.
 * 
 */
@Entity
@Table(name="COPARTICION_OTROS_PRO")
@NamedQuery(name="CoparticionOtrosPro.findAll", query="SELECT c FROM CoparticionOtrosPro c")
public class CoparticionOtrosPro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COPARTICION_OTROS_PRO_CSCCOMPARTICIONOTROSPRO_GENERATOR", sequenceName="SEQ_CSC_COMPARTICION_OTROS_PRO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COPARTICION_OTROS_PRO_CSCCOMPARTICIONOTROSPRO_GENERATOR")
	@Column(name="CSC_COMPARTICION_OTROS_PRO")
	private long cscComparticionOtrosPro;

	@Column(name="COP_NPART")
	private String copNpart;

	@Column(name="COP_ORDGOB")
	private BigDecimal copOrdgob;

	@Column(name="COP_PROG")
	private BigDecimal copProg;

	//bi-directional many-to-one association to CParticipante
	@ManyToOne
	@JoinColumn(name="COP_TIPART")
	private CParticipante CParticipante;

	//bi-directional many-to-one association to CTipoParticipacion
	@ManyToOne
	@JoinColumn(name="COP_TIPINT")
	private CTipoParticipacion CTipoParticipacion;

	//bi-directional many-to-one association to DetallePrograma
	@ManyToOne
	@JoinColumn(name="CSC_DETALLE_PRO_FK")
	private DetallePrograma detallePrograma;

	public CoparticionOtrosPro() {
	}

	public long getCscComparticionOtrosPro() {
		return this.cscComparticionOtrosPro;
	}

	public void setCscComparticionOtrosPro(long cscComparticionOtrosPro) {
		this.cscComparticionOtrosPro = cscComparticionOtrosPro;
	}

	public String getCopNpart() {
		return this.copNpart;
	}

	public void setCopNpart(String copNpart) {
		this.copNpart = copNpart;
	}

	public BigDecimal getCopOrdgob() {
		return this.copOrdgob;
	}

	public void setCopOrdgob(BigDecimal copOrdgob) {
		this.copOrdgob = copOrdgob;
	}

	public BigDecimal getCopProg() {
		return this.copProg;
	}

	public void setCopProg(BigDecimal copProg) {
		this.copProg = copProg;
	}

	public CParticipante getCParticipante() {
		return this.CParticipante;
	}

	public void setCParticipante(CParticipante CParticipante) {
		this.CParticipante = CParticipante;
	}

	public CTipoParticipacion getCTipoParticipacion() {
		return this.CTipoParticipacion;
	}

	public void setCTipoParticipacion(CTipoParticipacion CTipoParticipacion) {
		this.CTipoParticipacion = CTipoParticipacion;
	}

	public DetallePrograma getDetallePrograma() {
		return this.detallePrograma;
	}

	public void setDetallePrograma(DetallePrograma detallePrograma) {
		this.detallePrograma = detallePrograma;
	}

}