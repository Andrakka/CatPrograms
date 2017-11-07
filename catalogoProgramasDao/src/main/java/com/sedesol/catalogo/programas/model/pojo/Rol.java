package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ROL database table.
 * 
 */
@Entity
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ROL_CSCROL_GENERATOR", sequenceName="SEQ_CSC_ROL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROL_CSCROL_GENERATOR")
	@Column(name="CSC_ROL")
	private long cscRol;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="CHR_NOMBRE")
	private String chrNombre;

	//bi-directional many-to-one association to GrupoRol
	@OneToMany(mappedBy="rol")
	private List<GrupoRol> grupoRols;

	//bi-directional many-to-one association to RolMenu
	@OneToMany(mappedBy="rol")
	private List<RolMenu> rolMenus;

	//bi-directional many-to-one association to UsuarioRol
	@OneToMany(mappedBy="rol")
	private List<UsuarioRol> usuarioRols;

	public Rol() {
	}

	public long getCscRol() {
		return this.cscRol;
	}

	public void setCscRol(long cscRol) {
		this.cscRol = cscRol;
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
		grupoRol.setRol(this);

		return grupoRol;
	}

	public GrupoRol removeGrupoRol(GrupoRol grupoRol) {
		getGrupoRols().remove(grupoRol);
		grupoRol.setRol(null);

		return grupoRol;
	}

	public List<RolMenu> getRolMenus() {
		return this.rolMenus;
	}

	public void setRolMenus(List<RolMenu> rolMenus) {
		this.rolMenus = rolMenus;
	}

	public RolMenu addRolMenus(RolMenu rolMenus) {
		getRolMenus().add(rolMenus);
		rolMenus.setRol(this);

		return rolMenus;
	}

	public RolMenu removeRolMenus(RolMenu rolMenus) {
		getRolMenus().remove(rolMenus);
		rolMenus.setRol(null);

		return rolMenus;
	}

	public List<UsuarioRol> getUsuarioRols() {
		return this.usuarioRols;
	}

	public void setUsuarioRols(List<UsuarioRol> usuarioRols) {
		this.usuarioRols = usuarioRols;
	}

	public UsuarioRol addUsuarioRol(UsuarioRol usuarioRol) {
		getUsuarioRols().add(usuarioRol);
		usuarioRol.setRol(this);

		return usuarioRol;
	}

	public UsuarioRol removeUsuarioRol(UsuarioRol usuarioRol) {
		getUsuarioRols().remove(usuarioRol);
		usuarioRol.setRol(null);

		return usuarioRol;
	}

}