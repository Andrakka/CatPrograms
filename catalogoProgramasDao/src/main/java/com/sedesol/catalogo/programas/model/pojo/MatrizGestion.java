package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MATRIZ_GESTION database table.
 * 
 */
@Entity
@Table(name="MATRIZ_GESTION")
@NamedQuery(name="MatrizGestion.findAll", query="SELECT m FROM MatrizGestion m")
public class MatrizGestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MATRIZ_GESTION_CSCMATRIZGESTION_GENERATOR", sequenceName="SEQ_CSC_MATRIZ_GESTION")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MATRIZ_GESTION_CSCMATRIZGESTION_GENERATOR")
	@Column(name="CSC_MATRIZ_GESTION")
	private long cscMatrizGestion;

	@Column(name="CHR_CLAVE_PRESUPUESTAL")
	private String chrClavePresupuestal;

	@Column(name="CHR_FOLIO_MATRIZ_GESTION")
	private String chrFolioMatrizGestion;

	@Column(name="CHR_NOMBRE_PROGRAMA")
	private String chrNombrePrograma;

	@Column(name="CHR_VALIDACION")
	private String chrValidacion;
	
	@Column(name="CSC_CONFIGURACION_FOC_FK")
	private BigDecimal cscConfiguracionFocFk;

	@Column(name="CSC_FOCALIZACION_FK")
	private BigDecimal cscFocalizacionFk;

	@Temporal(TemporalType.DATE)
	@Column(name="FCH_FECHA_EMISION")
	private Date fchFechaEmision;

	@Column(name="ID_APOYO")
	private BigDecimal idApoyo;

	@Column(name="ID_COMPONENTE")
	private BigDecimal idComponente;
	
	@Column(name="MG_RESUMEN_NARRATIVO")
	private String mgResumenNarrativo;

	@Column(name="MG_SINTAXIS")
	private String mgSintaxis;

	@Column(name="NOMBRE_APOYO")
	private String nombreApoyo;

	@Column(name="NOMBRE_COMPONENTE")
	private String nombreComponente;
	

	//bi-directional many-to-one association to MatrizFocalizacion
	@OneToMany(mappedBy="matrizGestion")
	private List<MatrizFocalizacion> matrizFocalizacions;

	//bi-directional many-to-one association to Caracteristica
	@ManyToOne
	@JoinColumn(name="CSC_CARACTERISTICAS_FK")
	private Caracteristica caracteristica;

	

	public MatrizGestion() {
	}

	public long getCscMatrizGestion() {
		return this.cscMatrizGestion;
	}

	public void setCscMatrizGestion(long cscMatrizGestion) {
		this.cscMatrizGestion = cscMatrizGestion;
	}

	public String getChrClavePresupuestal() {
		return this.chrClavePresupuestal;
	}

	public void setChrClavePresupuestal(String chrClavePresupuestal) {
		this.chrClavePresupuestal = chrClavePresupuestal;
	}

	public String getChrFolioMatrizGestion() {
		return this.chrFolioMatrizGestion;
	}

	public void setChrFolioMatrizGestion(String chrFolioMatrizGestion) {
		this.chrFolioMatrizGestion = chrFolioMatrizGestion;
	}

	public String getChrNombrePrograma() {
		return this.chrNombrePrograma;
	}

	public void setChrNombrePrograma(String chrNombrePrograma) {
		this.chrNombrePrograma = chrNombrePrograma;
	}

	public String getChrValidacion() {
		return this.chrValidacion;
	}

	public void setChrValidacion(String chrValidacion) {
		this.chrValidacion = chrValidacion;
	}

	public BigDecimal getCscConfiguracionFocFk() {
		return this.cscConfiguracionFocFk;
	}

	public void setCscConfiguracionFocFk(BigDecimal cscConfiguracionFocFk) {
		this.cscConfiguracionFocFk = cscConfiguracionFocFk;
	}

	public BigDecimal getCscFocalizacionFk() {
		return this.cscFocalizacionFk;
	}

	public void setCscFocalizacionFk(BigDecimal cscFocalizacionFk) {
		this.cscFocalizacionFk = cscFocalizacionFk;
	}

	public Date getFchFechaEmision() {
		return this.fchFechaEmision;
	}

	public void setFchFechaEmision(Date fchFechaEmision) {
		this.fchFechaEmision = fchFechaEmision;
	}

	public BigDecimal getIdApoyo() {
		return this.idApoyo;
	}

	public void setIdApoyo(BigDecimal idApoyo) {
		this.idApoyo = idApoyo;
	}

	public BigDecimal getIdComponente() {
		return this.idComponente;
	}

	public void setIdComponente(BigDecimal idComponente) {
		this.idComponente = idComponente;
	}

	public String getMgResumenNarrativo() {
		return this.mgResumenNarrativo;
	}

	public void setMgResumenNarrativo(String mgResumenNarrativo) {
		this.mgResumenNarrativo = mgResumenNarrativo;
	}

	public String getMgSintaxis() {
		return this.mgSintaxis;
	}

	public void setMgSintaxis(String mgSintaxis) {
		this.mgSintaxis = mgSintaxis;
	}

	public String getNombreApoyo() {
		return this.nombreApoyo;
	}

	public void setNombreApoyo(String nombreApoyo) {
		this.nombreApoyo = nombreApoyo;
	}

	public String getNombreComponente() {
		return this.nombreComponente;
	}

	public void setNombreComponente(String nombreComponente) {
		this.nombreComponente = nombreComponente;
	}

	public List<MatrizFocalizacion> getMatrizFocalizacions() {
		return this.matrizFocalizacions;
	}

	public void setMatrizFocalizacions(List<MatrizFocalizacion> matrizFocalizacions) {
		this.matrizFocalizacions = matrizFocalizacions;
	}

	public MatrizFocalizacion addMatrizFocalizacion(MatrizFocalizacion matrizFocalizacion) {
		getMatrizFocalizacions().add(matrizFocalizacion);
		matrizFocalizacion.setMatrizGestion(this);

		return matrizFocalizacion;
	}

	public MatrizFocalizacion removeMatrizFocalizacion(MatrizFocalizacion matrizFocalizacion) {
		getMatrizFocalizacions().remove(matrizFocalizacion);
		matrizFocalizacion.setMatrizGestion(null);

		return matrizFocalizacion;
	}

	public Caracteristica getCaracteristica() {
		return this.caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}
	

}