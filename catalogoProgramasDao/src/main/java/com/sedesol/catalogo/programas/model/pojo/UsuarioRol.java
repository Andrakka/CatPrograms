package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USUARIO_ROL database table.
 * 
 */
@Entity
@Table(name="USUARIO_ROL")
@NamedQuery(name="UsuarioRol.findAll", query="SELECT u FROM UsuarioRol u")
public class UsuarioRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USUARIO_ROL_CSCUSUARIOROL_GENERATOR", sequenceName="SEQ_CSC_USUARIO_ROL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USUARIO_ROL_CSCUSUARIOROL_GENERATOR")
	@Column(name="CSC_USUARIO_ROL")
	private long cscUsuarioRol;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="CSC_ROL_FK")
	private Rol rol;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="CSC_USUARIO_FK")
	private Usuario usuario;

	public UsuarioRol() {
	}

	public long getCscUsuarioRol() {
		return this.cscUsuarioRol;
	}

	public void setCscUsuarioRol(long cscUsuarioRol) {
		this.cscUsuarioRol = cscUsuarioRol;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}