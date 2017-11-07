package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the PROYECTOS database table.
 * 
 */
@Entity
@Table(name="PROYECTOS")
@NamedQuery(name="Proyecto.findAll", query="SELECT p FROM Proyecto p")
public class Proyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROYECTOS_CSCPROYECTOSFONDOS_GENERATOR", sequenceName="SEQ_CSC_PROYECTOS_FONDOS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROYECTOS_CSCPROYECTOSFONDOS_GENERATOR")
	@Column(name="CSC_PROYECTOS_FONDOS")
	private long cscProyectosFondos;

	@Column(name="CHR_DESCRIPCION_PROYECTO")
	private String chrDescripcionProyecto;

	@Column(name="CHR_INCIDENCIA")
	private String chrIncidencia;

	@Column(name="CHR_NOMBRE_PROYECTO")
	private String chrNombreProyecto;

	@Column(name="CHR_NUMERO_PROYECTO")
	private String chrNumeroProyecto;

	@Column(name="CHR_OBSERVACIONES")
	private String chrObservaciones;

	@Column(name="CHR_PERIODICIDAD")
	private String chrPeriodicidad;

	@Column(name="CHR_POBLACION_OBJETIVO")
	private String chrPoblacionObjetivo;

	@Column(name="SN_DOCUMENTO_NORMATIVO")
	private BigDecimal snDocumentoNormativo;

	@Column(name="SN_INFO_GEORREFERENCIADA")
	private BigDecimal snInfoGeorreferenciada;

	@Column(name="SN_LISTADO_PADRON")
	private BigDecimal snListadoPadron;

	//bi-directional many-to-one association to CCriterioSeleccionPoblacion
	@ManyToOne
	@JoinColumn(name="CSC_CRITERIO_SELECCION_FK")
	private CCriterioSeleccionPoblacion CCriterioSeleccionPoblacion;

	//bi-directional many-to-one association to CInciProyecto
	@ManyToOne
	@JoinColumn(name="CSC_INCI_PROYECTO_FK")
	private CInciProyecto CInciProyecto;

	//bi-directional many-to-one association to CPeriodicidad
	@ManyToOne
	@JoinColumn(name="CSC_PERIODICIDAD")
	private CPeriodicidad CPeriodicidad;

	//bi-directional many-to-one association to CTipoPadron
	@ManyToOne
	@JoinColumn(name="CSC_PADRON_FK")
	private CTipoPadron CTipoPadron;

	//bi-directional many-to-one association to FondosEspeciale
	@ManyToOne
	@JoinColumn(name="CSC_FONDOS_ESPECIALES_FK")
	private FondosEspeciale fondosEspeciale;

	//bi-directional many-to-one association to ProyectosCarenciasSociale
	@OneToMany(mappedBy="proyecto")
	private List<ProyectosCarenciasSociale> proyectosCarenciasSociales;

	//bi-directional many-to-one association to ProyectosDerechosSociale
	@OneToMany(mappedBy="proyecto")
	private List<ProyectosDerechosSociale> proyectosDerechosSociales;

	public Proyecto() {
	}

	public long getCscProyectosFondos() {
		return this.cscProyectosFondos;
	}

	public void setCscProyectosFondos(long cscProyectosFondos) {
		this.cscProyectosFondos = cscProyectosFondos;
	}

	public String getChrDescripcionProyecto() {
		return this.chrDescripcionProyecto;
	}

	public void setChrDescripcionProyecto(String chrDescripcionProyecto) {
		this.chrDescripcionProyecto = chrDescripcionProyecto;
	}

	public String getChrIncidencia() {
		return this.chrIncidencia;
	}

	public void setChrIncidencia(String chrIncidencia) {
		this.chrIncidencia = chrIncidencia;
	}

	public String getChrNombreProyecto() {
		return this.chrNombreProyecto;
	}

	public void setChrNombreProyecto(String chrNombreProyecto) {
		this.chrNombreProyecto = chrNombreProyecto;
	}

	public String getChrNumeroProyecto() {
		return this.chrNumeroProyecto;
	}

	public void setChrNumeroProyecto(String chrNumeroProyecto) {
		this.chrNumeroProyecto = chrNumeroProyecto;
	}

	public String getChrObservaciones() {
		return this.chrObservaciones;
	}

	public void setChrObservaciones(String chrObservaciones) {
		this.chrObservaciones = chrObservaciones;
	}

	public String getChrPeriodicidad() {
		return this.chrPeriodicidad;
	}

	public void setChrPeriodicidad(String chrPeriodicidad) {
		this.chrPeriodicidad = chrPeriodicidad;
	}

	public String getChrPoblacionObjetivo() {
		return this.chrPoblacionObjetivo;
	}

	public void setChrPoblacionObjetivo(String chrPoblacionObjetivo) {
		this.chrPoblacionObjetivo = chrPoblacionObjetivo;
	}

	public BigDecimal getSnDocumentoNormativo() {
		return this.snDocumentoNormativo;
	}

	public void setSnDocumentoNormativo(BigDecimal snDocumentoNormativo) {
		this.snDocumentoNormativo = snDocumentoNormativo;
	}

	public BigDecimal getSnInfoGeorreferenciada() {
		return this.snInfoGeorreferenciada;
	}

	public void setSnInfoGeorreferenciada(BigDecimal snInfoGeorreferenciada) {
		this.snInfoGeorreferenciada = snInfoGeorreferenciada;
	}

	public BigDecimal getSnListadoPadron() {
		return this.snListadoPadron;
	}

	public void setSnListadoPadron(BigDecimal snListadoPadron) {
		this.snListadoPadron = snListadoPadron;
	}

	public CCriterioSeleccionPoblacion getCCriterioSeleccionPoblacion() {
		return this.CCriterioSeleccionPoblacion;
	}

	public void setCCriterioSeleccionPoblacion(CCriterioSeleccionPoblacion CCriterioSeleccionPoblacion) {
		this.CCriterioSeleccionPoblacion = CCriterioSeleccionPoblacion;
	}

	public CInciProyecto getCInciProyecto() {
		return this.CInciProyecto;
	}

	public void setCInciProyecto(CInciProyecto CInciProyecto) {
		this.CInciProyecto = CInciProyecto;
	}

	public CPeriodicidad getCPeriodicidad() {
		return this.CPeriodicidad;
	}

	public void setCPeriodicidad(CPeriodicidad CPeriodicidad) {
		this.CPeriodicidad = CPeriodicidad;
	}

	public CTipoPadron getCTipoPadron() {
		return this.CTipoPadron;
	}

	public void setCTipoPadron(CTipoPadron CTipoPadron) {
		this.CTipoPadron = CTipoPadron;
	}

	public FondosEspeciale getFondosEspeciale() {
		return this.fondosEspeciale;
	}

	public void setFondosEspeciale(FondosEspeciale fondosEspeciale) {
		this.fondosEspeciale = fondosEspeciale;
	}

	public List<ProyectosCarenciasSociale> getProyectosCarenciasSociales() {
		return this.proyectosCarenciasSociales;
	}

	public void setProyectosCarenciasSociales(List<ProyectosCarenciasSociale> proyectosCarenciasSociales) {
		this.proyectosCarenciasSociales = proyectosCarenciasSociales;
	}

	public ProyectosCarenciasSociale addProyectosCarenciasSociale(ProyectosCarenciasSociale proyectosCarenciasSociale) {
		getProyectosCarenciasSociales().add(proyectosCarenciasSociale);
		proyectosCarenciasSociale.setProyecto(this);

		return proyectosCarenciasSociale;
	}

	public ProyectosCarenciasSociale removeProyectosCarenciasSociale(ProyectosCarenciasSociale proyectosCarenciasSociale) {
		getProyectosCarenciasSociales().remove(proyectosCarenciasSociale);
		proyectosCarenciasSociale.setProyecto(null);

		return proyectosCarenciasSociale;
	}

	public List<ProyectosDerechosSociale> getProyectosDerechosSociales() {
		return this.proyectosDerechosSociales;
	}

	public void setProyectosDerechosSociales(List<ProyectosDerechosSociale> proyectosDerechosSociales) {
		this.proyectosDerechosSociales = proyectosDerechosSociales;
	}

	public ProyectosDerechosSociale addProyectosDerechosSociale(ProyectosDerechosSociale proyectosDerechosSociale) {
		getProyectosDerechosSociales().add(proyectosDerechosSociale);
		proyectosDerechosSociale.setProyecto(this);

		return proyectosDerechosSociale;
	}

	public ProyectosDerechosSociale removeProyectosDerechosSociale(ProyectosDerechosSociale proyectosDerechosSociale) {
		getProyectosDerechosSociales().remove(proyectosDerechosSociale);
		proyectosDerechosSociale.setProyecto(null);

		return proyectosDerechosSociale;
	}

}