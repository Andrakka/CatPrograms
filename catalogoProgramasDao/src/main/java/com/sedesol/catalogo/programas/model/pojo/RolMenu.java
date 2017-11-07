package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ROL_MENU database table.
 * 
 */
@Entity
@Table(name="ROL_MENU")
@NamedQuery(name="RolMenu.findAll", query="SELECT r FROM RolMenu r")
public class RolMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ROL_MENU_CSCROLMENU_GENERATOR", sequenceName="SEQ_CSC_ROL_MENU")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROL_MENU_CSCROLMENU_GENERATOR")
	@Column(name="CSC_ROL_MENU")
	private long cscRolMenu;

	@Column(name="SN_ALTA")
	private BigDecimal snAlta;

	@Column(name="SN_AUX_1")
	private BigDecimal snAux1;

	@Column(name="SN_AUX_2")
	private BigDecimal snAux2;

	@Column(name="SN_AUX_3")
	private BigDecimal snAux3;

	@Column(name="SN_CONSULTA")
	private BigDecimal snConsulta;

	@Column(name="SN_ELIMINAR")
	private BigDecimal snEliminar;

	@Column(name="SN_GUARDAR")
	private BigDecimal snGuardar;

	@Column(name="SN_IMPRIMIR")
	private BigDecimal snImprimir;

	@Column(name="SN_MODIFICACION")
	private BigDecimal snModificacion;

	//bi-directional many-to-one association to Menu
	@ManyToOne
	@JoinColumn(name="CSC_MENU_FK")
	private Menu menu;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="CSC_ROL_FK")
	private Rol rol;

	public RolMenu() {
	}

	public long getCscRolMenu() {
		return this.cscRolMenu;
	}

	public void setCscRolMenu(long cscRolMenu) {
		this.cscRolMenu = cscRolMenu;
	}

	public BigDecimal getSnAlta() {
		return this.snAlta;
	}

	public void setSnAlta(BigDecimal snAlta) {
		this.snAlta = snAlta;
	}

	public BigDecimal getSnAux1() {
		return this.snAux1;
	}

	public void setSnAux1(BigDecimal snAux1) {
		this.snAux1 = snAux1;
	}

	public BigDecimal getSnAux2() {
		return this.snAux2;
	}

	public void setSnAux2(BigDecimal snAux2) {
		this.snAux2 = snAux2;
	}

	public BigDecimal getSnAux3() {
		return this.snAux3;
	}

	public void setSnAux3(BigDecimal snAux3) {
		this.snAux3 = snAux3;
	}

	public BigDecimal getSnConsulta() {
		return this.snConsulta;
	}

	public void setSnConsulta(BigDecimal snConsulta) {
		this.snConsulta = snConsulta;
	}

	public BigDecimal getSnEliminar() {
		return this.snEliminar;
	}

	public void setSnEliminar(BigDecimal snEliminar) {
		this.snEliminar = snEliminar;
	}

	public BigDecimal getSnGuardar() {
		return this.snGuardar;
	}

	public void setSnGuardar(BigDecimal snGuardar) {
		this.snGuardar = snGuardar;
	}

	public BigDecimal getSnImprimir() {
		return this.snImprimir;
	}

	public void setSnImprimir(BigDecimal snImprimir) {
		this.snImprimir = snImprimir;
	}

	public BigDecimal getSnModificacion() {
		return this.snModificacion;
	}

	public void setSnModificacion(BigDecimal snModificacion) {
		this.snModificacion = snModificacion;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}