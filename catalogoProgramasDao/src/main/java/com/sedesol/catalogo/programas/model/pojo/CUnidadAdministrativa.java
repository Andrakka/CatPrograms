package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the C_UNIDAD_ADMINISTRATIVA database table.
 * 
 */
@Entity
@Table(name="C_UNIDAD_ADMINISTRATIVA")
@NamedQuery(name="CUnidadAdministrativa.findAll", query="SELECT c FROM CUnidadAdministrativa c")
public class CUnidadAdministrativa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_UNIDAD_ADMINISTRATIVA_CSCUNIDADADMINISTRATIVA_GENERATOR", sequenceName="SEQ_CSC_UNIDAD_ADMINISTRATIVA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_UNIDAD_ADMINISTRATIVA_CSCUNIDADADMINISTRATIVA_GENERATOR")
	@Column(name="CSC_UNIDAD_ADMINISTRATIVA")
	private long cscUnidadAdministrativa;

	@Column(name="CHR_CLAVE_UA")
	private String chrClaveUa;

	@Column(name="CHR_NOMBRE_UA")
	private String chrNombreUa;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to CDependencia
	@ManyToOne
	@JoinColumn(name="CSC_DEPENDENCIA")
	private CDependencia CDependencia;

	//bi-directional many-to-one association to RegistroAdhesion
	@OneToMany(mappedBy="CUnidadAdministrativa")
    @JsonIgnore
	private List<RegistroAdhesion> registroAdhesions;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="CUnidadAdministrativa")
    @JsonIgnore
	private List<Usuario> usuarios;

	public CUnidadAdministrativa() {
	}

	public long getCscUnidadAdministrativa() {
		return this.cscUnidadAdministrativa;
	}

	public void setCscUnidadAdministrativa(long cscUnidadAdministrativa) {
		this.cscUnidadAdministrativa = cscUnidadAdministrativa;
	}

	public String getChrClaveUa() {
		return this.chrClaveUa;
	}

	public void setChrClaveUa(String chrClaveUa) {
		this.chrClaveUa = chrClaveUa;
	}

	public String getChrNombreUa() {
		return this.chrNombreUa;
	}

	public void setChrNombreUa(String chrNombreUa) {
		this.chrNombreUa = chrNombreUa;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}

	public CDependencia getCDependencia() {
		return this.CDependencia;
	}

	public void setCDependencia(CDependencia CDependencia) {
		this.CDependencia = CDependencia;
	}

	public List<RegistroAdhesion> getRegistroAdhesions() {
		return this.registroAdhesions;
	}

	public void setRegistroAdhesions(List<RegistroAdhesion> registroAdhesions) {
		this.registroAdhesions = registroAdhesions;
	}

	public RegistroAdhesion addRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().add(registroAdhesion);
		registroAdhesion.setCUnidadAdministrativa(this);

		return registroAdhesion;
	}

	public RegistroAdhesion removeRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().remove(registroAdhesion);
		registroAdhesion.setCUnidadAdministrativa(null);

		return registroAdhesion;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setCUnidadAdministrativa(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setCUnidadAdministrativa(null);

		return usuario;
	}

}