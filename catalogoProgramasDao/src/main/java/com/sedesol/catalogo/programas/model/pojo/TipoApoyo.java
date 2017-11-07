package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TIPO_APOYO database table.
 * 
 */
@Entity
@Table(name="TIPO_APOYO")
@NamedQuery(name="TipoApoyo.findAll", query="SELECT t FROM TipoApoyo t")
public class TipoApoyo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPO_APOYO_CSCTIPOAPOYO_GENERATOR", sequenceName="SEQ_CSC_TIPO_APOYO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPO_APOYO_CSCTIPOAPOYO_GENERATOR")
	@Column(name="CSC_TIPO_APOYO")
	private long cscTipoApoyo;

	@Column(name="OTRO_TIPO_APOYO")
	private String otroTipoApoyo;

	@Column(name="TIPO_APOYO_CAP")
	private BigDecimal tipoApoyoCap;

	@Column(name="TIPO_APOYO_ESP")
	private BigDecimal tipoApoyoEsp;

	@Column(name="TIPO_APOYO_MON")
	private BigDecimal tipoApoyoMon;

	@Column(name="TIPO_APOYO_OBRA")
	private BigDecimal tipoApoyoObra;

	@Column(name="TIPO_APOYO_OTRO")
	private String tipoApoyoOtro;

	@Column(name="TIPO_APOYO_SERV")
	private BigDecimal tipoApoyoServ;

	@Column(name="TIPO_APOYO_SUB")
	private BigDecimal tipoApoyoSub;

	//bi-directional many-to-one association to Caracteristica
	@OneToMany(mappedBy="tipoApoyo")
	private List<Caracteristica> caracteristicas;

	public TipoApoyo() {
	}

	public long getCscTipoApoyo() {
		return this.cscTipoApoyo;
	}

	public void setCscTipoApoyo(long cscTipoApoyo) {
		this.cscTipoApoyo = cscTipoApoyo;
	}

	public String getOtroTipoApoyo() {
		return this.otroTipoApoyo;
	}

	public void setOtroTipoApoyo(String otroTipoApoyo) {
		this.otroTipoApoyo = otroTipoApoyo;
	}

	public BigDecimal getTipoApoyoCap() {
		return this.tipoApoyoCap;
	}

	public void setTipoApoyoCap(BigDecimal tipoApoyoCap) {
		this.tipoApoyoCap = tipoApoyoCap;
	}

	public BigDecimal getTipoApoyoEsp() {
		return this.tipoApoyoEsp;
	}

	public void setTipoApoyoEsp(BigDecimal tipoApoyoEsp) {
		this.tipoApoyoEsp = tipoApoyoEsp;
	}

	public BigDecimal getTipoApoyoMon() {
		return this.tipoApoyoMon;
	}

	public void setTipoApoyoMon(BigDecimal tipoApoyoMon) {
		this.tipoApoyoMon = tipoApoyoMon;
	}

	public BigDecimal getTipoApoyoObra() {
		return this.tipoApoyoObra;
	}

	public void setTipoApoyoObra(BigDecimal tipoApoyoObra) {
		this.tipoApoyoObra = tipoApoyoObra;
	}

	public String getTipoApoyoOtro() {
		return this.tipoApoyoOtro;
	}

	public void setTipoApoyoOtro(String tipoApoyoOtro) {
		this.tipoApoyoOtro = tipoApoyoOtro;
	}

	public BigDecimal getTipoApoyoServ() {
		return this.tipoApoyoServ;
	}

	public void setTipoApoyoServ(BigDecimal tipoApoyoServ) {
		this.tipoApoyoServ = tipoApoyoServ;
	}

	public BigDecimal getTipoApoyoSub() {
		return this.tipoApoyoSub;
	}

	public void setTipoApoyoSub(BigDecimal tipoApoyoSub) {
		this.tipoApoyoSub = tipoApoyoSub;
	}

	public List<Caracteristica> getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Caracteristica addCaracteristica(Caracteristica caracteristica) {
		getCaracteristicas().add(caracteristica);
		caracteristica.setTipoApoyo(this);

		return caracteristica;
	}

	public Caracteristica removeCaracteristica(Caracteristica caracteristica) {
		getCaracteristicas().remove(caracteristica);
		caracteristica.setTipoApoyo(null);

		return caracteristica;
	}

}