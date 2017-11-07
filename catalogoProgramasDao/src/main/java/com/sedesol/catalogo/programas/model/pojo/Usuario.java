package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the USUARIO database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USUARIO_CSCUSUARIO_GENERATOR", sequenceName="SEQ_CSC_USUARIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USUARIO_CSCUSUARIO_GENERATOR")
	@Column(name="CSC_USUARIO")
	private long cscUsuario;

	@Column(name="CHR_AMATERNO")
	private String chrAmaterno;

	@Column(name="CHR_APATERNO")
	private String chrApaterno;

	@Column(name="CHR_EMAIL")
	private String chrEmail;

	@Column(name="CHR_EXTENSION")
	private String chrExtension;

	@Column(name="CHR_LADA")
	private String chrLada;

	@Column(name="CHR_NOMBRE")
	private String chrNombre;

	@Column(name="CHR_PASSWORD")
	private String chrPassword;

	@Column(name="CHR_SEXO")
	private String chrSexo;

	@Column(name="CHR_TELEFONO")
	private String chrTelefono;

	@Column(name="CHR_USUARIO")
	private String chrUsuario;

	@Temporal(TemporalType.DATE)
	@Column(name="FCH_ALTA")
	private Date fchAlta;

	@Temporal(TemporalType.DATE)
	@Column(name="FCH_BAJA")
	private Date fchBaja;

	@Temporal(TemporalType.DATE)
	@Column(name="FCH_REACTIVACION")
	private Date fchReactivacion;

	@Column(name="SN_ESTATUS")
	private BigDecimal snEstatus;

	//bi-directional many-to-one association to Bitacora
	@OneToMany(mappedBy="usuario")
	private List<Bitacora> bitacoras;

	//bi-directional many-to-one association to Cuap
	@OneToMany(mappedBy="usuario")
	private List<Cuap> cuaps;

	//bi-directional many-to-one association to GrupoUsuario
	@OneToMany(mappedBy="usuario")
	private List<GrupoUsuario> grupoUsuarios;

	//bi-directional many-to-one association to CUnidadAdministrativa
	@ManyToOne
	@JoinColumn(name="CSC_UNIDAD_ADM_FK")
	private CUnidadAdministrativa CUnidadAdministrativa;

	//bi-directional many-to-one association to UsuarioRol
	@OneToMany(mappedBy="usuario")
	private List<UsuarioRol> usuarioRols;

	public Usuario() {
	}

	public long getCscUsuario() {
		return this.cscUsuario;
	}

	public void setCscUsuario(long cscUsuario) {
		this.cscUsuario = cscUsuario;
	}

	public String getChrAmaterno() {
		return this.chrAmaterno;
	}

	public void setChrAmaterno(String chrAmaterno) {
		this.chrAmaterno = chrAmaterno;
	}

	public String getChrApaterno() {
		return this.chrApaterno;
	}

	public void setChrApaterno(String chrApaterno) {
		this.chrApaterno = chrApaterno;
	}

	public String getChrEmail() {
		return this.chrEmail;
	}

	public void setChrEmail(String chrEmail) {
		this.chrEmail = chrEmail;
	}

	public String getChrExtension() {
		return this.chrExtension;
	}

	public void setChrExtension(String chrExtension) {
		this.chrExtension = chrExtension;
	}

	public String getChrLada() {
		return this.chrLada;
	}

	public void setChrLada(String chrLada) {
		this.chrLada = chrLada;
	}

	public String getChrNombre() {
		return this.chrNombre;
	}

	public void setChrNombre(String chrNombre) {
		this.chrNombre = chrNombre;
	}

	public String getChrPassword() {
		return this.chrPassword;
	}

	public void setChrPassword(String chrPassword) {
		this.chrPassword = chrPassword;
	}

	public String getChrSexo() {
		return this.chrSexo;
	}

	public void setChrSexo(String chrSexo) {
		this.chrSexo = chrSexo;
	}

	public String getChrTelefono() {
		return this.chrTelefono;
	}

	public void setChrTelefono(String chrTelefono) {
		this.chrTelefono = chrTelefono;
	}

	public String getChrUsuario() {
		return this.chrUsuario;
	}

	public void setChrUsuario(String chrUsuario) {
		this.chrUsuario = chrUsuario;
	}

	public Date getFchAlta() {
		return this.fchAlta;
	}

	public void setFchAlta(Date fchAlta) {
		this.fchAlta = fchAlta;
	}

	public Date getFchBaja() {
		return this.fchBaja;
	}

	public void setFchBaja(Date fchBaja) {
		this.fchBaja = fchBaja;
	}

	public Date getFchReactivacion() {
		return this.fchReactivacion;
	}

	public void setFchReactivacion(Date fchReactivacion) {
		this.fchReactivacion = fchReactivacion;
	}

	public BigDecimal getSnEstatus() {
		return this.snEstatus;
	}

	public void setSnEstatus(BigDecimal snEstatus) {
		this.snEstatus = snEstatus;
	}

	public List<Bitacora> getBitacoras() {
		return this.bitacoras;
	}

	public void setBitacoras(List<Bitacora> bitacoras) {
		this.bitacoras = bitacoras;
	}

	public Bitacora addBitacora(Bitacora bitacora) {
		getBitacoras().add(bitacora);
		bitacora.setUsuario(this);

		return bitacora;
	}

	public Bitacora removeBitacora(Bitacora bitacora) {
		getBitacoras().remove(bitacora);
		bitacora.setUsuario(null);

		return bitacora;
	}

	public List<Cuap> getCuaps() {
		return this.cuaps;
	}

	public void setCuaps(List<Cuap> cuaps) {
		this.cuaps = cuaps;
	}

	public Cuap addCuap(Cuap cuap) {
		getCuaps().add(cuap);
		cuap.setUsuario(this);

		return cuap;
	}

	public Cuap removeCuap(Cuap cuap) {
		getCuaps().remove(cuap);
		cuap.setUsuario(null);

		return cuap;
	}

	public List<GrupoUsuario> getGrupoUsuarios() {
		return this.grupoUsuarios;
	}

	public void setGrupoUsuarios(List<GrupoUsuario> grupoUsuarios) {
		this.grupoUsuarios = grupoUsuarios;
	}

	public GrupoUsuario addGrupoUsuario(GrupoUsuario grupoUsuario) {
		getGrupoUsuarios().add(grupoUsuario);
		grupoUsuario.setUsuario(this);

		return grupoUsuario;
	}

	public GrupoUsuario removeGrupoUsuario(GrupoUsuario grupoUsuario) {
		getGrupoUsuarios().remove(grupoUsuario);
		grupoUsuario.setUsuario(null);

		return grupoUsuario;
	}

	public CUnidadAdministrativa getCUnidadAdministrativa() {
		return this.CUnidadAdministrativa;
	}

	public void setCUnidadAdministrativa(CUnidadAdministrativa CUnidadAdministrativa) {
		this.CUnidadAdministrativa = CUnidadAdministrativa;
	}

	public List<UsuarioRol> getUsuarioRols() {
		return this.usuarioRols;
	}

	public void setUsuarioRols(List<UsuarioRol> usuarioRols) {
		this.usuarioRols = usuarioRols;
	}

	public UsuarioRol addUsuarioRol(UsuarioRol usuarioRol) {
		getUsuarioRols().add(usuarioRol);
		usuarioRol.setUsuario(this);

		return usuarioRol;
	}

	public UsuarioRol removeUsuarioRol(UsuarioRol usuarioRol) {
		getUsuarioRols().remove(usuarioRol);
		usuarioRol.setUsuario(null);

		return usuarioRol;
	}

}