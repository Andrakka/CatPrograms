package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the GRUPO_USUARIO database table.
 * 
 */
@Entity
@Table(name="GRUPO_USUARIO")
@NamedQuery(name="GrupoUsuario.findAll", query="SELECT g FROM GrupoUsuario g")
public class GrupoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GRUPO_USUARIO_CSCGRUPOUSUARIO_GENERATOR", sequenceName="SEQ_CSC_GRUPO_USUARIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GRUPO_USUARIO_CSCGRUPOUSUARIO_GENERATOR")
	@Column(name="CSC_GRUPO_USUARIO")
	private long cscGrupoUsuario;

	//bi-directional many-to-one association to Grupo
	@ManyToOne
	@JoinColumn(name="CSC_GRUPO_FK")
	private Grupo grupo;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="CSC_USUARIO_FK")
	private Usuario usuario;

	public GrupoUsuario() {
	}

	public long getCscGrupoUsuario() {
		return this.cscGrupoUsuario;
	}

	public void setCscGrupoUsuario(long cscGrupoUsuario) {
		this.cscGrupoUsuario = cscGrupoUsuario;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}