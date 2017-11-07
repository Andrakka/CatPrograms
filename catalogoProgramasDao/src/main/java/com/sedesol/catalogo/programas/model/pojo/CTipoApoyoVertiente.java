package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the C_TIPO_APOYO_VERTIENTE database table.
 * 
 */
@Entity
@Table(name="C_TIPO_APOYO_VERTIENTE")
@NamedQuery(name="CTipoApoyoVertiente.findAll", query="SELECT c FROM CTipoApoyoVertiente c")
public class CTipoApoyoVertiente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_TIPO_APOYO_VERTIENTE_CSCTIPOAPOYOVER_GENERATOR", sequenceName="SEQ_CSC_TIPO_APOYO_VER")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_TIPO_APOYO_VERTIENTE_CSCTIPOAPOYOVER_GENERATOR")
	@Column(name="CSC_TIPO_APOYO_VER")
	private long cscTipoApoyoVer;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to CVertiente
	@ManyToOne
	@JoinColumn(name="CSC_VERTIENTES_FK")
	private CVertiente CVertiente;

	public CTipoApoyoVertiente() {
	}

	public long getCscTipoApoyoVer() {
		return this.cscTipoApoyoVer;
	}

	public void setCscTipoApoyoVer(long cscTipoApoyoVer) {
		this.cscTipoApoyoVer = cscTipoApoyoVer;
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

	public CVertiente getCVertiente() {
		return this.CVertiente;
	}

	public void setCVertiente(CVertiente CVertiente) {
		this.CVertiente = CVertiente;
	}

}