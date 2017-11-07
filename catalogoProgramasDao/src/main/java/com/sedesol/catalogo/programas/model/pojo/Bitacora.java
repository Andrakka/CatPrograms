package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BITACORA database table.
 * 
 */
@Entity
@NamedQuery(name="Bitacora.findAll", query="SELECT b FROM Bitacora b")
public class Bitacora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BITACORA_CSCAUDITORIA_GENERATOR", sequenceName="SEQ_CSC_AUDITORIA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BITACORA_CSCAUDITORIA_GENERATOR")
	@Column(name="CSC_AUDITORIA")
	private long cscAuditoria;

	//bi-directional many-to-one association to Objeto
	@ManyToOne
	@JoinColumn(name="CSC_OBJETO_FK")
	private Objeto objeto;

	//bi-directional many-to-one association to Pantalla
	@ManyToOne
	@JoinColumn(name="CSC_PANTALLA_FK")
	private Pantalla pantalla;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="CSC_USUARIO_FK")
	private Usuario usuario;

	public Bitacora() {
	}

	public long getCscAuditoria() {
		return this.cscAuditoria;
	}

	public void setCscAuditoria(long cscAuditoria) {
		this.cscAuditoria = cscAuditoria;
	}

	public Objeto getObjeto() {
		return this.objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}

	public Pantalla getPantalla() {
		return this.pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}