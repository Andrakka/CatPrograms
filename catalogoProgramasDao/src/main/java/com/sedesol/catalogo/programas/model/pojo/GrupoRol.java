package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the GRUPO_ROL database table.
 * 
 */
@Entity
@Table(name="GRUPO_ROL")
@NamedQuery(name="GrupoRol.findAll", query="SELECT g FROM GrupoRol g")
public class GrupoRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GRUPO_ROL_CSCGRUPOROL_GENERATOR", sequenceName="SEQ_CSC_GRUPO_ROL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GRUPO_ROL_CSCGRUPOROL_GENERATOR")
	@Column(name="CSC_GRUPO_ROL")
	private long cscGrupoRol;

	//bi-directional many-to-one association to Grupo
	@ManyToOne
	@JoinColumn(name="CSC_GRUPO_FK")
	private Grupo grupo;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="CSC_ROL_FK")
	private Rol rol;

	public GrupoRol() {
	}

	public long getCscGrupoRol() {
		return this.cscGrupoRol;
	}

	public void setCscGrupoRol(long cscGrupoRol) {
		this.cscGrupoRol = cscGrupoRol;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}