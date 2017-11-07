package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CARACTERISTICAS_OPERATIVAS database table.
 * 
 */
@Entity
@Table(name="CARACTERISTICAS_OPERATIVAS")
@NamedQuery(name="CaracteristicasOperativa.findAll", query="SELECT c FROM CaracteristicasOperativa c")
public class CaracteristicasOperativa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CARACTERISTICAS_OPERATIVAS_CSCCARACTERISTICASOPE_GENERATOR", sequenceName="SEQ_CSC_CARACTERISTICAS_OPE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CARACTERISTICAS_OPERATIVAS_CSCCARACTERISTICASOPE_GENERATOR")
	@Column(name="CSC_CARACTERISTICAS_OPE")
	private long cscCaracteristicasOpe;

	@Column(name="ACTUALIZA_PADRON")
	private String actualizaPadron;

	@Column(name="APOYO_GEN_PADRON")
	private BigDecimal apoyoGenPadron;

	@Column(name="CSC_CARACTERISTICAS_FK")
	private BigDecimal cscCaracteristicasFk;

	@Column(name="CUENTA_INFO_GEO")
	private BigDecimal cuentaInfoGeo;

	@Column(name="INSTRU_SOCIOE")
	private BigDecimal instruSocioe;

	@Column(name="INSTRU_SOCIOE_CUAL")
	private String instruSocioeCual;

	private String observaciones;

	@Column(name="OTRO_ACTUALIZA_PADRON")
	private String otroActualizaPadron;

	@Column(name="OTRO_TIPO_PADRON")
	private String otroTipoPadron;

	//bi-directional many-to-one association to Caracteristica
	@OneToMany(mappedBy="caracteristicasOperativa")
	private List<Caracteristica> caracteristicas;

	//bi-directional many-to-one association to CTipoPadron
	@ManyToOne
	@JoinColumn(name="TIPO_PADRON")
	private CTipoPadron CTipoPadron;

	public CaracteristicasOperativa() {
	}

	public long getCscCaracteristicasOpe() {
		return this.cscCaracteristicasOpe;
	}

	public void setCscCaracteristicasOpe(long cscCaracteristicasOpe) {
		this.cscCaracteristicasOpe = cscCaracteristicasOpe;
	}

	public String getActualizaPadron() {
		return this.actualizaPadron;
	}

	public void setActualizaPadron(String actualizaPadron) {
		this.actualizaPadron = actualizaPadron;
	}

	public BigDecimal getApoyoGenPadron() {
		return this.apoyoGenPadron;
	}

	public void setApoyoGenPadron(BigDecimal apoyoGenPadron) {
		this.apoyoGenPadron = apoyoGenPadron;
	}

	public BigDecimal getCscCaracteristicasFk() {
		return this.cscCaracteristicasFk;
	}

	public void setCscCaracteristicasFk(BigDecimal cscCaracteristicasFk) {
		this.cscCaracteristicasFk = cscCaracteristicasFk;
	}

	public BigDecimal getCuentaInfoGeo() {
		return this.cuentaInfoGeo;
	}

	public void setCuentaInfoGeo(BigDecimal cuentaInfoGeo) {
		this.cuentaInfoGeo = cuentaInfoGeo;
	}

	public BigDecimal getInstruSocioe() {
		return this.instruSocioe;
	}

	public void setInstruSocioe(BigDecimal instruSocioe) {
		this.instruSocioe = instruSocioe;
	}

	public String getInstruSocioeCual() {
		return this.instruSocioeCual;
	}

	public void setInstruSocioeCual(String instruSocioeCual) {
		this.instruSocioeCual = instruSocioeCual;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getOtroActualizaPadron() {
		return this.otroActualizaPadron;
	}

	public void setOtroActualizaPadron(String otroActualizaPadron) {
		this.otroActualizaPadron = otroActualizaPadron;
	}

	public String getOtroTipoPadron() {
		return this.otroTipoPadron;
	}

	public void setOtroTipoPadron(String otroTipoPadron) {
		this.otroTipoPadron = otroTipoPadron;
	}

	public List<Caracteristica> getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Caracteristica addCaracteristica(Caracteristica caracteristica) {
		getCaracteristicas().add(caracteristica);
		caracteristica.setCaracteristicasOperativa(this);

		return caracteristica;
	}

	public Caracteristica removeCaracteristica(Caracteristica caracteristica) {
		getCaracteristicas().remove(caracteristica);
		caracteristica.setCaracteristicasOperativa(null);

		return caracteristica;
	}

	public CTipoPadron getCTipoPadron() {
		return this.CTipoPadron;
	}

	public void setCTipoPadron(CTipoPadron CTipoPadron) {
		this.CTipoPadron = CTipoPadron;
	}

}