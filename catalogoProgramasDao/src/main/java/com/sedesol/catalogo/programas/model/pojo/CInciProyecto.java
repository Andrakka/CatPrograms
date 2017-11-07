package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the C_INCI_PROYECTO database table.
 * 
 */
@Entity
@Table(name="C_INCI_PROYECTO")
@NamedQuery(name="CInciProyecto.findAll", query="SELECT c FROM CInciProyecto c")
public class CInciProyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_INCI_PROYECTO_CSCINCIPROYECTO_GENERATOR", sequenceName="SEQ_CSC_INCI_PROYECTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_INCI_PROYECTO_CSCINCIPROYECTO_GENERATOR")
	@Column(name="CSC_INCI_PROYECTO")
	private long cscInciProyecto;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to Proyecto
	/*@OneToMany(mappedBy="CInciProyecto")
	private List<Proyecto> proyectos;*/

	public CInciProyecto() {
	}

	public long getCscInciProyecto() {
		return this.cscInciProyecto;
	}

	public void setCscInciProyecto(long cscInciProyecto) {
		this.cscInciProyecto = cscInciProyecto;
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
		proyecto.setCInciProyecto(this);

		return proyecto;
	}

	public Proyecto removeProyecto(Proyecto proyecto) {
		getProyectos().remove(proyecto);
		proyecto.setCInciProyecto(null);

		return proyecto;
	}*/

}