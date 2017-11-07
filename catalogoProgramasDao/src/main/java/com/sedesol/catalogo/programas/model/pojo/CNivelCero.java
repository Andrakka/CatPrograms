package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_NIVEL_CERO database table.
 * 
 */
@Entity
@Table(name="C_NIVEL_CERO")
@NamedQuery(name="CNivelCero.findAll", query="SELECT c FROM CNivelCero c")
public class CNivelCero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_NIVEL_CERO_CSCCNIVELCERO_GENERATOR", sequenceName="SEQ_CSC_C_NIVEL_CERO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_NIVEL_CERO_CSCCNIVELCERO_GENERATOR")
	@Column(name="CSC_C_NIVEL_CERO")
	private long cscCNivelCero;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to ConfiguracionFocalizacion
	@OneToMany(mappedBy="CNivelCero")
	private List<CConfiguracionFocalizacion> CConfiguracionFocalizacions;

	public CNivelCero() {
	}

	public long getCscCNivelCero() {
		return this.cscCNivelCero;
	}

	public void setCscCNivelCero(long cscCNivelCero) {
		this.cscCNivelCero = cscCNivelCero;
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

	public List<CConfiguracionFocalizacion> getCConfiguracionFocalizacions() {
		return this.CConfiguracionFocalizacions;
	}

	public void setCConfiguracionFocalizacions(List<CConfiguracionFocalizacion> CConfiguracionFocalizacions) {
		this.CConfiguracionFocalizacions = CConfiguracionFocalizacions;
	}

	public CConfiguracionFocalizacion addCConfiguracionFocalizacion(CConfiguracionFocalizacion CConfiguracionFocalizacion) {
		getCConfiguracionFocalizacions().add(CConfiguracionFocalizacion);
		CConfiguracionFocalizacion.setCNivelCero(this);

		return CConfiguracionFocalizacion;
	}

	public CConfiguracionFocalizacion removeCConfiguracionFocalizacion(CConfiguracionFocalizacion CConfiguracionFocalizacion) {
		getCConfiguracionFocalizacions().remove(CConfiguracionFocalizacion);
		CConfiguracionFocalizacion.setCNivelCero(null);

		return CConfiguracionFocalizacion;
	}

}