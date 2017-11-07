package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the GRUPO database table.
 * 
 */
@Entity
@NamedQuery(name="Grupo.findAll", query="SELECT g FROM Grupo g")
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GRUPO_CSCGRUPO_GENERATOR", sequenceName="SEQ_CSC_GRUPO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GRUPO_CSCGRUPO_GENERATOR")
	@Column(name="CSC_GRUPO")
	private long cscGrupo;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="CHR_NOMBRE")
	private String chrNombre;

	//bi-directional many-to-one association to GrupoRol
	@OneToMany(mappedBy="grupo")
	private List<GrupoRol> grupoRols;

	//bi-directional many-to-one association to GrupoUsuario
	@OneToMany(mappedBy="grupo")
	private List<GrupoUsuario> grupoUsuarios;

	public Grupo() {
	}

	public long getCscGrupo() {
		return this.cscGrupo;
	}

	public void setCscGrupo(long cscGrupo) {
		this.cscGrupo = cscGrupo;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	public String getChrNombre() {
		return this.chrNombre;
	}

	public void setChrNombre(String chrNombre) {
		this.chrNombre = chrNombre;
	}

	public List<GrupoRol> getGrupoRols() {
		return this.grupoRols;
	}

	public void setGrupoRols(List<GrupoRol> grupoRols) {
		this.grupoRols = grupoRols;
	}

	public GrupoRol addGrupoRol(GrupoRol grupoRol) {
		getGrupoRols().add(grupoRol);
		grupoRol.setGrupo(this);

		return grupoRol;
	}

	public GrupoRol removeGrupoRol(GrupoRol grupoRol) {
		getGrupoRols().remove(grupoRol);
		grupoRol.setGrupo(null);

		return grupoRol;
	}

	public List<GrupoUsuario> getGrupoUsuarios() {
		return this.grupoUsuarios;
	}

	public void setGrupoUsuarios(List<GrupoUsuario> grupoUsuarios) {
		this.grupoUsuarios = grupoUsuarios;
	}

	public GrupoUsuario addGrupoUsuario(GrupoUsuario grupoUsuario) {
		getGrupoUsuarios().add(grupoUsuario);
		grupoUsuario.setGrupo(this);

		return grupoUsuario;
	}

	public GrupoUsuario removeGrupoUsuario(GrupoUsuario grupoUsuario) {
		getGrupoUsuarios().remove(grupoUsuario);
		grupoUsuario.setGrupo(null);

		return grupoUsuario;
	}

}