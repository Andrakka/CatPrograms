package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the C_IDENTIFICADOR_EJECUTOR_FONDO database table.
 * 
 */
@Entity
@Table(name="C_IDENTIFICADOR_EJECUTOR_FONDO")
@NamedQuery(name="CIdentificadorEjecutorFondo.findAll", query="SELECT c FROM CIdentificadorEjecutorFondo c")
public class CIdentificadorEjecutorFondo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_IDENTIFICADOR_EJECUTOR_FONDO_CSCIDENTIFICADOREJEFON_GENERATOR", sequenceName="SEQ_CSC_IDENTIFICADOR_EJE_FON")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_IDENTIFICADOR_EJECUTOR_FONDO_CSCIDENTIFICADOREJEFON_GENERATOR")
	@Column(name="CSC_IDENTIFICADOR_EJE_FON")
	private long cscIdentificadorEjeFon;

	@Column(name="CVE_ENTIDAD")
	private BigDecimal cveEntidad;

	@Column(name="PRESUPUESTO_ASIGNADO_ENTIDAD")
	private BigDecimal presupuestoAsignadoEntidad;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to CDescripcionFondo
	@ManyToOne
	@JoinColumn(name="CSC_DESCRIPCION_FONDO_FK")
	private CDescripcionFondo CDescripcionFondo;

	public CIdentificadorEjecutorFondo() {
	}

	public long getCscIdentificadorEjeFon() {
		return this.cscIdentificadorEjeFon;
	}

	public void setCscIdentificadorEjeFon(long cscIdentificadorEjeFon) {
		this.cscIdentificadorEjeFon = cscIdentificadorEjeFon;
	}

	public BigDecimal getCveEntidad() {
		return this.cveEntidad;
	}

	public void setCveEntidad(BigDecimal cveEntidad) {
		this.cveEntidad = cveEntidad;
	}

	public BigDecimal getPresupuestoAsignadoEntidad() {
		return this.presupuestoAsignadoEntidad;
	}

	public void setPresupuestoAsignadoEntidad(BigDecimal presupuestoAsignadoEntidad) {
		this.presupuestoAsignadoEntidad = presupuestoAsignadoEntidad;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}

	public CDescripcionFondo getCDescripcionFondo() {
		return this.CDescripcionFondo;
	}

	public void setCDescripcionFondo(CDescripcionFondo CDescripcionFondo) {
		this.CDescripcionFondo = CDescripcionFondo;
	}

}