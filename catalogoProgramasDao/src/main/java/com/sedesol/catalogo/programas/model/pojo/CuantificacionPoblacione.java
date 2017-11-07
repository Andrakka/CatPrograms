package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CUANTIFICACION_POBLACIONES database table.
 * 
 */
@Entity
@Table(name="CUANTIFICACION_POBLACIONES")
@NamedQuery(name="CuantificacionPoblacione.findAll", query="SELECT c FROM CuantificacionPoblacione c")
public class CuantificacionPoblacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUANTIFICACION_POBLACIONES_CSCCUANTIFICACIONPOBLACIONES_GENERATOR", sequenceName="SEQ_CSC_CUANTIFICACION_POBLACIONES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUANTIFICACION_POBLACIONES_CSCCUANTIFICACIONPOBLACIONES_GENERATOR")
	@Column(name="CSC_CUANTIFICACION_POBLACIONES")
	private long cscCuantificacionPoblaciones;

	@Column(name="NUM_POB_OBJET")
	private BigDecimal numPobObjet;

	@Column(name="POB_ATEN_EFA")
	private BigDecimal pobAtenEfa;

	@Column(name="POB_ATEN_EFA_UM")
	private String pobAtenEfaUm;

	@Column(name="POB_OBJET_UM")
	private String pobObjetUm;

	@Column(name="POB_POTEN")
	private BigDecimal pobPoten;

	@Column(name="POB_POTEN_UM")
	private String pobPotenUm;

	//bi-directional many-to-one association to DetallePrograma
	@OneToMany(mappedBy="cuantificacionPoblacione")
	private List<DetallePrograma> detalleProgramas;

	public CuantificacionPoblacione() {
	}

	public long getCscCuantificacionPoblaciones() {
		return this.cscCuantificacionPoblaciones;
	}

	public void setCscCuantificacionPoblaciones(long cscCuantificacionPoblaciones) {
		this.cscCuantificacionPoblaciones = cscCuantificacionPoblaciones;
	}

	public BigDecimal getNumPobObjet() {
		return this.numPobObjet;
	}

	public void setNumPobObjet(BigDecimal numPobObjet) {
		this.numPobObjet = numPobObjet;
	}

	public BigDecimal getPobAtenEfa() {
		return this.pobAtenEfa;
	}

	public void setPobAtenEfa(BigDecimal pobAtenEfa) {
		this.pobAtenEfa = pobAtenEfa;
	}

	public String getPobAtenEfaUm() {
		return this.pobAtenEfaUm;
	}

	public void setPobAtenEfaUm(String pobAtenEfaUm) {
		this.pobAtenEfaUm = pobAtenEfaUm;
	}

	public String getPobObjetUm() {
		return this.pobObjetUm;
	}

	public void setPobObjetUm(String pobObjetUm) {
		this.pobObjetUm = pobObjetUm;
	}

	public BigDecimal getPobPoten() {
		return this.pobPoten;
	}

	public void setPobPoten(BigDecimal pobPoten) {
		this.pobPoten = pobPoten;
	}

	public String getPobPotenUm() {
		return this.pobPotenUm;
	}

	public void setPobPotenUm(String pobPotenUm) {
		this.pobPotenUm = pobPotenUm;
	}

	public List<DetallePrograma> getDetalleProgramas() {
		return this.detalleProgramas;
	}

	public void setDetalleProgramas(List<DetallePrograma> detalleProgramas) {
		this.detalleProgramas = detalleProgramas;
	}

	public DetallePrograma addDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().add(detallePrograma);
		detallePrograma.setCuantificacionPoblacione(this);

		return detallePrograma;
	}

	public DetallePrograma removeDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().remove(detallePrograma);
		detallePrograma.setCuantificacionPoblacione(null);

		return detallePrograma;
	}

}