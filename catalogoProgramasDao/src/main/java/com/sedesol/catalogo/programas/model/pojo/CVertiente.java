package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the C_VERTIENTES database table.
 * 
 */
@Entity
@Table(name="C_VERTIENTES")
@NamedQuery(name="CVertiente.findAll", query="SELECT c FROM CVertiente c")
public class CVertiente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_VERTIENTES_CSCVERTIENTES_GENERATOR", sequenceName="SEQ_CSC_VERTIENTES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_VERTIENTES_CSCVERTIENTES_GENERATOR")
	@Column(name="CSC_VERTIENTES")
	private long cscVertientes;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to CTipoApoyoVertiente
	/*@OneToMany(mappedBy="CVertiente")
	private List<CTipoApoyoVertiente> CTipoApoyoVertientes;*/

	//bi-directional many-to-one association to CDescripcionFondo
	@ManyToOne
	@JoinColumn(name="CSC_DESCRIPCION_FONDO_FK")
	private CDescripcionFondo CDescripcionFondo;

	public CVertiente() {
	}

	public long getCscVertientes() {
		return this.cscVertientes;
	}

	public void setCscVertientes(long cscVertientes) {
		this.cscVertientes = cscVertientes;
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
/*
	public List<CTipoApoyoVertiente> getCTipoApoyoVertientes() {
		return this.CTipoApoyoVertientes;
	}

	public void setCTipoApoyoVertientes(List<CTipoApoyoVertiente> CTipoApoyoVertientes) {
		this.CTipoApoyoVertientes = CTipoApoyoVertientes;
	}

	public CTipoApoyoVertiente addCTipoApoyoVertiente(CTipoApoyoVertiente CTipoApoyoVertiente) {
		getCTipoApoyoVertientes().add(CTipoApoyoVertiente);
		CTipoApoyoVertiente.setCVertiente(this);

		return CTipoApoyoVertiente;
	}

	public CTipoApoyoVertiente removeCTipoApoyoVertiente(CTipoApoyoVertiente CTipoApoyoVertiente) {
		getCTipoApoyoVertientes().remove(CTipoApoyoVertiente);
		CTipoApoyoVertiente.setCVertiente(null);

		return CTipoApoyoVertiente;
	}

	public CDescripcionFondo getCDescripcionFondo() {
		return this.CDescripcionFondo;
	}

	public void setCDescripcionFondo(CDescripcionFondo CDescripcionFondo) {
		this.CDescripcionFondo = CDescripcionFondo;
	}*/

}