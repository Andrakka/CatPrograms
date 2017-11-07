package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the MENU database table.
 * 
 */
@Entity
@NamedQuery(name="Menu.findAll", query="SELECT m FROM Menu m")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MENU_CSCMENU_GENERATOR", sequenceName="SEQ_CSC_MENU")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MENU_CSCMENU_GENERATOR")
	@Column(name="CSC_MENU")
	private long cscMenu;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	//bi-directional many-to-one association to RolMenu
	@OneToMany(mappedBy="menu")
	private List<RolMenu> rolMenus;

	public Menu() {
	}

	public long getCscMenu() {
		return this.cscMenu;
	}

	public void setCscMenu(long cscMenu) {
		this.cscMenu = cscMenu;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	public List<RolMenu> getRolMenus() {
		return this.rolMenus;
	}

	public void setRolMenus(List<RolMenu> rolMenus) {
		this.rolMenus = rolMenus;
	}

	public RolMenu addRolMenus(RolMenu rolMenus) {
		getRolMenus().add(rolMenus);
		rolMenus.setMenu(this);

		return rolMenus;
	}

	public RolMenu removeRolMenus(RolMenu rolMenus) {
		getRolMenus().remove(rolMenus);
		rolMenus.setMenu(null);

		return rolMenus;
	}

}