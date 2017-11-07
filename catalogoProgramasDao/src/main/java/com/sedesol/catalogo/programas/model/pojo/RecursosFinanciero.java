package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the RECURSOS_FINANCIEROS database table.
 * 
 */
@Entity
@Table(name="RECURSOS_FINANCIEROS")
@NamedQuery(name="RecursosFinanciero.findAll", query="SELECT r FROM RecursosFinanciero r")
public class RecursosFinanciero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RECURSOS_FINANCIEROS_CSCRECURSOSFINANCIEROS_GENERATOR", sequenceName="SEQ_CSC_RECURSOS_FINANCIEROS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RECURSOS_FINANCIEROS_CSCRECURSOSFINANCIEROS_GENERATOR")
	@Column(name="CSC_RECURSOS_FINANCIEROS")
	private long cscRecursosFinancieros;

	@Column(name="PRES_ANTER")
	private BigDecimal presAnter;

	@Column(name="PRES_VIGEN")
	private BigDecimal presVigen;

	//bi-directional many-to-one association to DetallePrograma
	@OneToMany(mappedBy="recursosFinanciero")
	private List<DetallePrograma> detalleProgramas;

	public RecursosFinanciero() {
	}

	public long getCscRecursosFinancieros() {
		return this.cscRecursosFinancieros;
	}

	public void setCscRecursosFinancieros(long cscRecursosFinancieros) {
		this.cscRecursosFinancieros = cscRecursosFinancieros;
	}

	public BigDecimal getPresAnter() {
		return this.presAnter;
	}

	public void setPresAnter(BigDecimal presAnter) {
		this.presAnter = presAnter;
	}

	public BigDecimal getPresVigen() {
		return this.presVigen;
	}

	public void setPresVigen(BigDecimal presVigen) {
		this.presVigen = presVigen;
	}

	public List<DetallePrograma> getDetalleProgramas() {
		return this.detalleProgramas;
	}

	public void setDetalleProgramas(List<DetallePrograma> detalleProgramas) {
		this.detalleProgramas = detalleProgramas;
	}

	public DetallePrograma addDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().add(detallePrograma);
		detallePrograma.setRecursosFinanciero(this);

		return detallePrograma;
	}

	public DetallePrograma removeDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().remove(detallePrograma);
		detallePrograma.setRecursosFinanciero(null);

		return detallePrograma;
	}

}