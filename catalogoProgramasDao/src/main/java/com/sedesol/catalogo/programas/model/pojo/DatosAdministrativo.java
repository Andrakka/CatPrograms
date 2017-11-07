package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DATOS_ADMINISTRATIVOS database table.
 * 
 */
@Entity
@Table(name="DATOS_ADMINISTRATIVOS")
@NamedQuery(name="DatosAdministrativo.findAll", query="SELECT d FROM DatosAdministrativo d")
public class DatosAdministrativo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DATOS_ADMINISTRATIVOS_CSCDATOSADMINISTRATIVOS_GENERATOR", sequenceName="SEQ_CSC_DATOS_ADMINISTRATIVOS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATOS_ADMINISTRATIVOS_CSCDATOSADMINISTRATIVOS_GENERATOR")
	@Column(name="CSC_DATOS_ADMINISTRATIVOS")
	private long cscDatosAdministrativos;

	@Column(name="CHR_FOLIO_CUESTIONARIO")
	private String chrFolioCuestionario;

	@Column(name="CHR_OBJETIVO")
	private String chrObjetivo;

	@Temporal(TemporalType.DATE)
	@Column(name="FCH_REGISTRO_ADMINISTRATIVO")
	private Date fchRegistroAdministrativo;

	@Column(name="INT_NUMERO_REGISTROS")
	private BigDecimal intNumeroRegistros;

	//bi-directional many-to-one association to RegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_REGISTRO_ADHESION_FK")
	private RegistroAdhesion registroAdhesion;

	//bi-directional many-to-one association to DatosAdmBienestar
	@OneToMany(mappedBy="datosAdministrativo")
	private List<DatosAdmBienestar> datosAdmBienestars;

	//bi-directional many-to-one association to RegistrosAdministrativo
	@OneToMany(mappedBy="datosAdministrativo")
	private List<RegistrosAdministrativo> registrosAdministrativos;

	public DatosAdministrativo() {
	}

	public long getCscDatosAdministrativos() {
		return this.cscDatosAdministrativos;
	}

	public void setCscDatosAdministrativos(long cscDatosAdministrativos) {
		this.cscDatosAdministrativos = cscDatosAdministrativos;
	}

	public String getChrFolioCuestionario() {
		return this.chrFolioCuestionario;
	}

	public void setChrFolioCuestionario(String chrFolioCuestionario) {
		this.chrFolioCuestionario = chrFolioCuestionario;
	}

	public String getChrObjetivo() {
		return this.chrObjetivo;
	}

	public void setChrObjetivo(String chrObjetivo) {
		this.chrObjetivo = chrObjetivo;
	}

	public Date getFchRegistroAdministrativo() {
		return this.fchRegistroAdministrativo;
	}

	public void setFchRegistroAdministrativo(Date fchRegistroAdministrativo) {
		this.fchRegistroAdministrativo = fchRegistroAdministrativo;
	}

	public BigDecimal getIntNumeroRegistros() {
		return this.intNumeroRegistros;
	}

	public void setIntNumeroRegistros(BigDecimal intNumeroRegistros) {
		this.intNumeroRegistros = intNumeroRegistros;
	}

	public RegistroAdhesion getRegistroAdhesion() {
		return this.registroAdhesion;
	}

	public void setRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		this.registroAdhesion = registroAdhesion;
	}

	public List<DatosAdmBienestar> getDatosAdmBienestars() {
		return this.datosAdmBienestars;
	}

	public void setDatosAdmBienestars(List<DatosAdmBienestar> datosAdmBienestars) {
		this.datosAdmBienestars = datosAdmBienestars;
	}

	public DatosAdmBienestar addDatosAdmBienestar(DatosAdmBienestar datosAdmBienestar) {
		getDatosAdmBienestars().add(datosAdmBienestar);
		datosAdmBienestar.setDatosAdministrativo(this);

		return datosAdmBienestar;
	}

	public DatosAdmBienestar removeDatosAdmBienestar(DatosAdmBienestar datosAdmBienestar) {
		getDatosAdmBienestars().remove(datosAdmBienestar);
		datosAdmBienestar.setDatosAdministrativo(null);

		return datosAdmBienestar;
	}

	public List<RegistrosAdministrativo> getRegistrosAdministrativos() {
		return this.registrosAdministrativos;
	}

	public void setRegistrosAdministrativos(List<RegistrosAdministrativo> registrosAdministrativos) {
		this.registrosAdministrativos = registrosAdministrativos;
	}

	public RegistrosAdministrativo addRegistrosAdministrativo(RegistrosAdministrativo registrosAdministrativo) {
		getRegistrosAdministrativos().add(registrosAdministrativo);
		registrosAdministrativo.setDatosAdministrativo(this);

		return registrosAdministrativo;
	}

	public RegistrosAdministrativo removeRegistrosAdministrativo(RegistrosAdministrativo registrosAdministrativo) {
		getRegistrosAdministrativos().remove(registrosAdministrativo);
		registrosAdministrativo.setDatosAdministrativo(null);

		return registrosAdministrativo;
	}

}