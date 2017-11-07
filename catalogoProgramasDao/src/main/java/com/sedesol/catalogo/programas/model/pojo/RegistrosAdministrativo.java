package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the REGISTROS_ADMINISTRATIVOS database table.
 * 
 */
@Entity
@Table(name="REGISTROS_ADMINISTRATIVOS")
@NamedQuery(name="RegistrosAdministrativo.findAll", query="SELECT r FROM RegistrosAdministrativo r")
public class RegistrosAdministrativo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REGISTROS_ADMINISTRATIVOS_CSCREGISTROSADMIN_GENERATOR", sequenceName="SEQ_CSC_REGISTROS_ADMIN")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REGISTROS_ADMINISTRATIVOS_CSCREGISTROSADMIN_GENERATOR")
	@Column(name="CSC_REGISTROS_ADMIN")
	private long cscRegistrosAdmin;

	@Column(name="CHR_CONTENIDO_REGISTRO_ADM")
	private String chrContenidoRegistroAdm;

	@Column(name="CHR_INFO_INTEGRA")
	private String chrInfoIntegra;

	@Column(name="CHR_NOMBRE_REGISTRO_ADM")
	private String chrNombreRegistroAdm;

	@Column(name="CHR_OBSERVACIONES")
	private String chrObservaciones;

	@Column(name="CHR_TEMATICA_VARIABLES")
	private String chrTematicaVariables;

	@Column(name="CHR_TIPO")
	private String chrTipo;

	@Column(name="SN_GEORREFERENCIACION")
	private BigDecimal snGeorreferenciacion;

	//bi-directional many-to-one association to CFormatoRegistroAdm
	@ManyToOne
	@JoinColumn(name="CSC_FORMATO_REG_ADM_FK")
	private CFormatoRegistroAdm CFormatoRegistroAdm;

	//bi-directional many-to-one association to CFrecuencia
	@ManyToOne
	@JoinColumn(name="CSC_FRECUENCIA_FK")
	private CFrecuencia CFrecuencia;

	//bi-directional many-to-one association to CInfoInteAdm
	@ManyToOne
	@JoinColumn(name="CSC_INFO_INTE_ADM_FK")
	private CInfoInteAdm CInfoInteAdm;

	//bi-directional many-to-one association to CTipoAdm
	@ManyToOne
	@JoinColumn(name="CSC_TIPO_ADM_FK")
	private CTipoAdm CTipoAdm;

	//bi-directional many-to-one association to DatosAdministrativo
	@ManyToOne
	@JoinColumn(name="CSC_DATOS_ADMINISTRATIVOS_FK")
	private DatosAdministrativo datosAdministrativo;

	//bi-directional many-to-one association to RegistrosVariable
	@OneToMany(mappedBy="registrosAdministrativo")
	private List<RegistrosVariable> registrosVariables;

	public RegistrosAdministrativo() {
	}

	public long getCscRegistrosAdmin() {
		return this.cscRegistrosAdmin;
	}

	public void setCscRegistrosAdmin(long cscRegistrosAdmin) {
		this.cscRegistrosAdmin = cscRegistrosAdmin;
	}

	public String getChrContenidoRegistroAdm() {
		return this.chrContenidoRegistroAdm;
	}

	public void setChrContenidoRegistroAdm(String chrContenidoRegistroAdm) {
		this.chrContenidoRegistroAdm = chrContenidoRegistroAdm;
	}

	public String getChrInfoIntegra() {
		return this.chrInfoIntegra;
	}

	public void setChrInfoIntegra(String chrInfoIntegra) {
		this.chrInfoIntegra = chrInfoIntegra;
	}

	public String getChrNombreRegistroAdm() {
		return this.chrNombreRegistroAdm;
	}

	public void setChrNombreRegistroAdm(String chrNombreRegistroAdm) {
		this.chrNombreRegistroAdm = chrNombreRegistroAdm;
	}

	public String getChrObservaciones() {
		return this.chrObservaciones;
	}

	public void setChrObservaciones(String chrObservaciones) {
		this.chrObservaciones = chrObservaciones;
	}

	public String getChrTematicaVariables() {
		return this.chrTematicaVariables;
	}

	public void setChrTematicaVariables(String chrTematicaVariables) {
		this.chrTematicaVariables = chrTematicaVariables;
	}

	public String getChrTipo() {
		return this.chrTipo;
	}

	public void setChrTipo(String chrTipo) {
		this.chrTipo = chrTipo;
	}

	public BigDecimal getSnGeorreferenciacion() {
		return this.snGeorreferenciacion;
	}

	public void setSnGeorreferenciacion(BigDecimal snGeorreferenciacion) {
		this.snGeorreferenciacion = snGeorreferenciacion;
	}

	public CFormatoRegistroAdm getCFormatoRegistroAdm() {
		return this.CFormatoRegistroAdm;
	}

	public void setCFormatoRegistroAdm(CFormatoRegistroAdm CFormatoRegistroAdm) {
		this.CFormatoRegistroAdm = CFormatoRegistroAdm;
	}

	public CFrecuencia getCFrecuencia() {
		return this.CFrecuencia;
	}

	public void setCFrecuencia(CFrecuencia CFrecuencia) {
		this.CFrecuencia = CFrecuencia;
	}

	public CInfoInteAdm getCInfoInteAdm() {
		return this.CInfoInteAdm;
	}

	public void setCInfoInteAdm(CInfoInteAdm CInfoInteAdm) {
		this.CInfoInteAdm = CInfoInteAdm;
	}

	public CTipoAdm getCTipoAdm() {
		return this.CTipoAdm;
	}

	public void setCTipoAdm(CTipoAdm CTipoAdm) {
		this.CTipoAdm = CTipoAdm;
	}

	public DatosAdministrativo getDatosAdministrativo() {
		return this.datosAdministrativo;
	}

	public void setDatosAdministrativo(DatosAdministrativo datosAdministrativo) {
		this.datosAdministrativo = datosAdministrativo;
	}

	public List<RegistrosVariable> getRegistrosVariables() {
		return this.registrosVariables;
	}

	public void setRegistrosVariables(List<RegistrosVariable> registrosVariables) {
		this.registrosVariables = registrosVariables;
	}

	public RegistrosVariable addRegistrosVariable(RegistrosVariable registrosVariable) {
		getRegistrosVariables().add(registrosVariable);
		registrosVariable.setRegistrosAdministrativo(this);

		return registrosVariable;
	}

	public RegistrosVariable removeRegistrosVariable(RegistrosVariable registrosVariable) {
		getRegistrosVariables().remove(registrosVariable);
		registrosVariable.setRegistrosAdministrativo(null);

		return registrosVariable;
	}

}