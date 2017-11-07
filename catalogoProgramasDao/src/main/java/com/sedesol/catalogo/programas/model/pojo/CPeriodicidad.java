package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the C_PERIODICIDAD database table.
 * 
 */
@Entity
@Table(name="C_PERIODICIDAD")
@NamedQuery(name="CPeriodicidad.findAll", query="SELECT c FROM CPeriodicidad c")
public class CPeriodicidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_PERIODICIDAD_CSCPERIODICIDAD_GENERATOR", sequenceName="SEQ_CSC_PERIODICIDAD")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_PERIODICIDAD_CSCPERIODICIDAD_GENERATOR")
	@Column(name="CSC_PERIODICIDAD")
	private long cscPeriodicidad;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private String snActivo;

	//bi-directional many-to-one association to Proyecto
	/*@OneToMany(mappedBy="CPeriodicidad")
	private List<Proyecto> proyectos;*/

	public CPeriodicidad() {
	}

	public long getCscPeriodicidad() {
		return this.cscPeriodicidad;
	}

	public void setCscPeriodicidad(long cscPeriodicidad) {
		this.cscPeriodicidad = cscPeriodicidad;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	public String getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(String snActivo) {
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
		proyecto.setCPeriodicidad(this);

		return proyecto;
	}

	public Proyecto removeProyecto(Proyecto proyecto) {
		getProyectos().remove(proyecto);
		proyecto.setCPeriodicidad(null);

		return proyecto;
	}*/

}