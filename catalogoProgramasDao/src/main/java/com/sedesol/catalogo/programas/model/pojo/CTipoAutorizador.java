package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_TIPO_AUTORIZADOR database table.
 * 
 */
@Entity
@Table(name="C_TIPO_AUTORIZADOR")
@NamedQuery(name="CTipoAutorizador.findAll", query="SELECT c FROM CTipoAutorizador c")
public class CTipoAutorizador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_TIPO_AUTORIZADOR_CSCTIPOAUTORIZADOR_GENERATOR", sequenceName="SEQ_CSC_TIPO_AUTORIZADOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_TIPO_AUTORIZADOR_CSCTIPOAUTORIZADOR_GENERATOR")
	@Column(name="CSC_TIPO_AUTORIZADOR")
	private long cscTipoAutorizador;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="INT_TIPO")
	private BigDecimal intTipo;
	
	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to Autorizacion
	@OneToMany(mappedBy="CTipoAutorizador")
	private List<Autorizacion> autorizacions;

	public CTipoAutorizador() {
	}

	public long getCscTipoAutorizador() {
		return this.cscTipoAutorizador;
	}

	public void setCscTipoAutorizador(long cscTipoAutorizador) {
		this.cscTipoAutorizador = cscTipoAutorizador;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	public BigDecimal getIntTipo() {
		return this.intTipo;
	}

	public void setIntTipo(BigDecimal intTipo) {
		this.intTipo = intTipo;
	}
	
	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}

	public List<Autorizacion> getAutorizacions() {
		return this.autorizacions;
	}

	public void setAutorizacions(List<Autorizacion> autorizacions) {
		this.autorizacions = autorizacions;
	}

	public Autorizacion addAutorizacion(Autorizacion autorizacion) {
		getAutorizacions().add(autorizacion);
		autorizacion.setCTipoAutorizador(this);

		return autorizacion;
	}

	public Autorizacion removeAutorizacion(Autorizacion autorizacion) {
		getAutorizacions().remove(autorizacion);
		autorizacion.setCTipoAutorizador(null);

		return autorizacion;
	}

}