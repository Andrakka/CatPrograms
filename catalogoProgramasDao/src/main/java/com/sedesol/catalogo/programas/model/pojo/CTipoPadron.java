package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_TIPO_PADRON database table.
 * 
 */
@Entity
@Table(name="C_TIPO_PADRON")
@NamedQuery(name="CTipoPadron.findAll", query="SELECT c FROM CTipoPadron c")
public class CTipoPadron implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_TIPO_PADRON_CSCTIPOPADRON_GENERATOR", sequenceName="SEQ_CSC_TIPO_PADRON", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_TIPO_PADRON_CSCTIPOPADRON_GENERATOR")
	@Column(name="CSC_TIPO_PADRON")
	private long cscTipoPadron;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to CaracteristicasOperativa
	@OneToMany(mappedBy="CTipoPadron")
	private List<CaracteristicasOperativa> caracteristicasOperativas;

	//bi-directional many-to-one association to Proyecto
	@OneToMany(mappedBy="CTipoPadron")
	private List<Proyecto> proyectos;

	public CTipoPadron() {
	}

	public long getCscTipoPadron() {
		return this.cscTipoPadron;
	}

	public void setCscTipoPadron(long cscTipoPadron) {
		this.cscTipoPadron = cscTipoPadron;
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

	public List<CaracteristicasOperativa> getCaracteristicasOperativas() {
		return this.caracteristicasOperativas;
	}

	public void setCaracteristicasOperativas(List<CaracteristicasOperativa> caracteristicasOperativas) {
		this.caracteristicasOperativas = caracteristicasOperativas;
	}

	public CaracteristicasOperativa addCaracteristicasOperativa(CaracteristicasOperativa caracteristicasOperativa) {
		getCaracteristicasOperativas().add(caracteristicasOperativa);
		caracteristicasOperativa.setCTipoPadron(this);

		return caracteristicasOperativa;
	}

	public CaracteristicasOperativa removeCaracteristicasOperativa(CaracteristicasOperativa caracteristicasOperativa) {
		getCaracteristicasOperativas().remove(caracteristicasOperativa);
		caracteristicasOperativa.setCTipoPadron(null);

		return caracteristicasOperativa;
	}

	public List<Proyecto> getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public Proyecto addProyecto(Proyecto proyecto) {
		getProyectos().add(proyecto);
		proyecto.setCTipoPadron(this);

		return proyecto;
	}

	public Proyecto removeProyecto(Proyecto proyecto) {
		getProyectos().remove(proyecto);
		proyecto.setCTipoPadron(null);

		return proyecto;
	}

}