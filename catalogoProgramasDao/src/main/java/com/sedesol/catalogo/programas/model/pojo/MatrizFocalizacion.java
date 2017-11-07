package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MATRIZ_FOCALIZACION database table.
 * 
 */
@Entity
@Table(name="MATRIZ_FOCALIZACION")
@NamedQuery(name="MatrizFocalizacion.findAll", query="SELECT m FROM MatrizFocalizacion m")
public class MatrizFocalizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MATRIZ_FOCALIZACION_CSCMATRIZFOCALIZACION_GENERATOR", sequenceName="SEQ_CSC_MATRIZ_FOCALIZACION")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MATRIZ_FOCALIZACION_CSCMATRIZFOCALIZACION_GENERATOR")
	@Column(name="CSC_MATRIZ_FOCALIZACION")
	private long cscMatrizFocalizacion;

	private String condicion;

	//bi-directional many-to-one association to CConfiguracionFocalizacion
	@ManyToOne
	@JoinColumn(name="CSC_CONFIGURACION_FOCALIZACION")
	private CConfiguracionFocalizacion CConfiguracionFocalizacion;

	//bi-directional many-to-one association to MatrizGestion
	@ManyToOne
	@JoinColumn(name="CSC_MATRIZ_GESTION_FK")
	private MatrizGestion matrizGestion;

	public MatrizFocalizacion() {
	}

	public long getCscMatrizFocalizacion() {
		return this.cscMatrizFocalizacion;
	}

	public void setCscMatrizFocalizacion(long cscMatrizFocalizacion) {
		this.cscMatrizFocalizacion = cscMatrizFocalizacion;
	}

	public String getCondicion() {
		return this.condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

	public CConfiguracionFocalizacion getCConfiguracionFocalizacion() {
		return this.CConfiguracionFocalizacion;
	}

	public void setCConfiguracionFocalizacion(CConfiguracionFocalizacion CConfiguracionFocalizacion) {
		this.CConfiguracionFocalizacion = CConfiguracionFocalizacion;
	}

	public MatrizGestion getMatrizGestion() {
		return this.matrizGestion;
	}

	public void setMatrizGestion(MatrizGestion matrizGestion) {
		this.matrizGestion = matrizGestion;
	}

}