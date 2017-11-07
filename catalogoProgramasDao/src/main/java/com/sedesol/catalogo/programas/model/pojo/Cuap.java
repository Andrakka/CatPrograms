package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CUAPS database table.
 * 
 */
@Entity
@Table(name="CUAPS")
@NamedQuery(name="Cuap.findAll", query="SELECT c FROM Cuap c")
public class Cuap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUAPS_CSCCUAPS_GENERATOR", sequenceName="SEQ_CSC_CUAPS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUAPS_CSCCUAPS_GENERATOR")
	@Column(name="CSC_CUAPS")
	private long cscCuaps;

	@Column(name="CUAPS_FOLIO")
	private String cuapsFolio;

	@Temporal(TemporalType.DATE)
	@Column(name="FH_FIN_LEVANTAMIENTO")
	private Date fhFinLevantamiento;

	@Temporal(TemporalType.DATE)
	@Column(name="FH_LEVANTAMIENTO")
	private Date fhLevantamiento;

	private String observaciones;

	//bi-directional many-to-one association to CEstatusCuap
	@ManyToOne
	@JoinColumn(name="CSC_ESTATUS_CUAPS_FK")
	private CEstatusCuap CEstatusCuap;

	//bi-directional many-to-one association to DetallePrograma
	@ManyToOne
	@JoinColumn(name="CSC_DETALLE_PRO_FK")
	private DetallePrograma detallePrograma;

	//bi-directional many-to-one association to InsumosRegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_PROGRAMAS_SOCIALES_FK")
	private InsumosRegistroAdhesion insumosRegistroAdhesion;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="CSC_USUARIO_FK")
	private Usuario usuario;

	public Cuap() {
	}

	public long getCscCuaps() {
		return this.cscCuaps;
	}

	public void setCscCuaps(long cscCuaps) {
		this.cscCuaps = cscCuaps;
	}

	public String getCuapsFolio() {
		return this.cuapsFolio;
	}

	public void setCuapsFolio(String cuapsFolio) {
		this.cuapsFolio = cuapsFolio;
	}

	public Date getFhFinLevantamiento() {
		return this.fhFinLevantamiento;
	}

	public void setFhFinLevantamiento(Date fhFinLevantamiento) {
		this.fhFinLevantamiento = fhFinLevantamiento;
	}

	public Date getFhLevantamiento() {
		return this.fhLevantamiento;
	}

	public void setFhLevantamiento(Date fhLevantamiento) {
		this.fhLevantamiento = fhLevantamiento;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public CEstatusCuap getCEstatusCuap() {
		return this.CEstatusCuap;
	}

	public void setCEstatusCuap(CEstatusCuap CEstatusCuap) {
		this.CEstatusCuap = CEstatusCuap;
	}

	public DetallePrograma getDetallePrograma() {
		return this.detallePrograma;
	}

	public void setDetallePrograma(DetallePrograma detallePrograma) {
		this.detallePrograma = detallePrograma;
	}

	public InsumosRegistroAdhesion getInsumosRegistroAdhesion() {
		return this.insumosRegistroAdhesion;
	}

	public void setInsumosRegistroAdhesion(InsumosRegistroAdhesion insumosRegistroAdhesion) {
		this.insumosRegistroAdhesion = insumosRegistroAdhesion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}