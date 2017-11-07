package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the REGISTRO_ADHESION_AUTORIZACION database table.
 * 
 */
@Entity
@Table(name="REGISTRO_ADHESION_AUTORIZACION")
@NamedQuery(name="RegistroAdhesionAutorizacion.findAll", query="SELECT r FROM RegistroAdhesionAutorizacion r")
public class RegistroAdhesionAutorizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REGISTRO_ADHESION_AUTORIZACION_CSCREGISTROADHESIONAUT_GENERATOR", sequenceName="SEQ_CSC_REGISTRO_ADHESION_AUT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REGISTRO_ADHESION_AUTORIZACION_CSCREGISTROADHESIONAUT_GENERATOR")
	@Column(name="CSC_REGISTRO_ADHESION_AUT")
	private long cscRegistroAdhesionAut;

	//bi-directional many-to-one association to Autorizacion
	@ManyToOne
	@JoinColumn(name="CSC_AUTORIZACION_FK")
	private Autorizacion autorizacion;

	//bi-directional many-to-one association to RegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_REGISTRO_ADHESION_FK")
	private RegistroAdhesion registroAdhesion;

	public RegistroAdhesionAutorizacion() {
	}

	public long getCscRegistroAdhesionAut() {
		return this.cscRegistroAdhesionAut;
	}

	public void setCscRegistroAdhesionAut(long cscRegistroAdhesionAut) {
		this.cscRegistroAdhesionAut = cscRegistroAdhesionAut;
	}

	public Autorizacion getAutorizacion() {
		return this.autorizacion;
	}

	public void setAutorizacion(Autorizacion autorizacion) {
		this.autorizacion = autorizacion;
	}

	public RegistroAdhesion getRegistroAdhesion() {
		return this.registroAdhesion;
	}

	public void setRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		this.registroAdhesion = registroAdhesion;
	}

}