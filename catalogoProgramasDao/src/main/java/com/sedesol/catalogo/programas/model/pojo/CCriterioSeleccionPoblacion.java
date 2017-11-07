package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the C_CRITERIO_SELECCION_POBLACION database table.
 * 
 */
@Entity
@Table(name="C_CRITERIO_SELECCION_POBLACION")
@NamedQuery(name="CCriterioSeleccionPoblacion.findAll", query="SELECT c FROM CCriterioSeleccionPoblacion c")
public class CCriterioSeleccionPoblacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_CRITERIO_SELECCION_POBLACION_CSCCRITERIOSELECCION_GENERATOR", sequenceName="SEQ_CSC_CRITERIO_SELECCION")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_CRITERIO_SELECCION_POBLACION_CSCCRITERIOSELECCION_GENERATOR")
	@Column(name="CSC_CRITERIO_SELECCION")
	private long cscCriterioSeleccion;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to Proyecto
	/*@OneToMany(mappedBy="CCriterioSeleccionPoblacion")
	private List<Proyecto> proyectos;*/

	public CCriterioSeleccionPoblacion() {
	}

	public long getCscCriterioSeleccion() {
		return this.cscCriterioSeleccion;
	}

	public void setCscCriterioSeleccion(long cscCriterioSeleccion) {
		this.cscCriterioSeleccion = cscCriterioSeleccion;
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

	/*public List<Proyecto> getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public Proyecto addProyecto(Proyecto proyecto) {
		getProyectos().add(proyecto);
		proyecto.setCCriterioSeleccionPoblacion(this);

		return proyecto;
	}

	public Proyecto removeProyecto(Proyecto proyecto) {
		getProyectos().remove(proyecto);
		proyecto.setCCriterioSeleccionPoblacion(null);

		return proyecto;
	}*/

}