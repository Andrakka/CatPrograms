package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CARACTERISTICAS database table.
 * 
 */
@Entity
@Table(name="CARACTERISTICAS")
@NamedQuery(name="Caracteristica.findAll", query="SELECT c FROM Caracteristica c")
public class Caracteristica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CARACTERISTICAS_CSCCARACTERISTICAS_GENERATOR", sequenceName="SEQ_CSC_CARACTERISTICAS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CARACTERISTICAS_CSCCARACTERISTICAS_GENERATOR")
	@Column(name="CSC_CARACTERISTICAS")
	private long cscCaracteristicas;

	@Column(name="DESCR_APOYO")
	private String descrApoyo;

	@Column(name="ID_APOYO")
	private String idApoyo;

	@Column(name="MONTO_APOYO_OTOR")
	private BigDecimal montoApoyoOtor;

	@Column(name="NOMBRE_APOYO")
	private String nombreApoyo;

	@Column(name="PERIOD_APOYO")
	private String periodApoyo;

	@Column(name="PERIOD_MONTO")
	private String periodMonto;

	@Column(name="TEM_APOYO_OTRA_ESP")
	private String temApoyoOtraEsp;

	@Column(name="TIPO_POB_APO")
	private String tipoPobApo;

	//bi-directional many-to-one association to CaracteristicasOperativa
	@ManyToOne
	@JoinColumn(name="CSC_CARACTERISTICAS_OPE_FK")
	private CaracteristicasOperativa caracteristicasOperativa;

	//bi-directional many-to-one association to ComponentePrograma
	@ManyToOne
	@JoinColumn(name="ID_COMPONENTE")
	private ComponentePrograma componentePrograma;

	//bi-directional many-to-one association to CTematica
	@ManyToOne
	@JoinColumn(name="TEM_APOYO")
	private CTematica CTematica;
	
	//bi-directional many-to-one association to DetallePrograma
	@ManyToOne
	@JoinColumn(name="CSC_DETALLE_PRO")
	private DetallePrograma detallePrograma;

	//bi-directional many-to-one association to Indice
	@ManyToOne
	@JoinColumn(name="CSC_INDICES_FK")
	private Indice indice;

	//bi-directional many-to-one association to TipoApoyo
	@ManyToOne
	@JoinColumn(name="CSC_TIPO_APOYO_FK")
	private TipoApoyo tipoApoyo;

	//bi-directional many-to-one association to MatrizGestion
	@OneToMany(mappedBy="caracteristica")
	private List<MatrizGestion> matrizGestions;

	public Caracteristica() {
	}

	public long getCscCaracteristicas() {
		return this.cscCaracteristicas;
	}

	public void setCscCaracteristicas(long cscCaracteristicas) {
		this.cscCaracteristicas = cscCaracteristicas;
	}

	public String getDescrApoyo() {
		return this.descrApoyo;
	}

	public void setDescrApoyo(String descrApoyo) {
		this.descrApoyo = descrApoyo;
	}

	public String getIdApoyo() {
		return this.idApoyo;
	}

	public void setIdApoyo(String idApoyo) {
		this.idApoyo = idApoyo;
	}

	public BigDecimal getMontoApoyoOtor() {
		return this.montoApoyoOtor;
	}

	public void setMontoApoyoOtor(BigDecimal montoApoyoOtor) {
		this.montoApoyoOtor = montoApoyoOtor;
	}

	public String getNombreApoyo() {
		return this.nombreApoyo;
	}

	public void setNombreApoyo(String nombreApoyo) {
		this.nombreApoyo = nombreApoyo;
	}

	public String getPeriodApoyo() {
		return this.periodApoyo;
	}

	public void setPeriodApoyo(String periodApoyo) {
		this.periodApoyo = periodApoyo;
	}

	public String getPeriodMonto() {
		return this.periodMonto;
	}

	public void setPeriodMonto(String periodMonto) {
		this.periodMonto = periodMonto;
	}

	public String getTemApoyoOtraEsp() {
		return this.temApoyoOtraEsp;
	}

	public void setTemApoyoOtraEsp(String temApoyoOtraEsp) {
		this.temApoyoOtraEsp = temApoyoOtraEsp;
	}

	public String getTipoPobApo() {
		return this.tipoPobApo;
	}

	public void setTipoPobApo(String tipoPobApo) {
		this.tipoPobApo = tipoPobApo;
	}

	public CaracteristicasOperativa getCaracteristicasOperativa() {
		return this.caracteristicasOperativa;
	}

	public void setCaracteristicasOperativa(CaracteristicasOperativa caracteristicasOperativa) {
		this.caracteristicasOperativa = caracteristicasOperativa;
	}

	public ComponentePrograma getComponentePrograma() {
		return this.componentePrograma;
	}

	public void setComponentePrograma(ComponentePrograma componentePrograma) {
		this.componentePrograma = componentePrograma;
	}

	public CTematica getCTematica() {
		return this.CTematica;
	}

	public void setCTematica(CTematica CTematica) {
		this.CTematica = CTematica;
	}
	
	public DetallePrograma getDetallePrograma() {
		return this.detallePrograma;
	}

	public void setDetallePrograma(DetallePrograma detallePrograma) {
		this.detallePrograma = detallePrograma;
	}

	public Indice getIndice() {
		return this.indice;
	}

	public void setIndice(Indice indice) {
		this.indice = indice;
	}

	public TipoApoyo getTipoApoyo() {
		return this.tipoApoyo;
	}

	public void setTipoApoyo(TipoApoyo tipoApoyo) {
		this.tipoApoyo = tipoApoyo;
	}

	public List<MatrizGestion> getMatrizGestions() {
		return this.matrizGestions;
	}

	public void setMatrizGestions(List<MatrizGestion> matrizGestions) {
		this.matrizGestions = matrizGestions;
	}

	public MatrizGestion addMatrizGestion(MatrizGestion matrizGestion) {
		getMatrizGestions().add(matrizGestion);
		matrizGestion.setCaracteristica(this);

		return matrizGestion;
	}

	public MatrizGestion removeMatrizGestion(MatrizGestion matrizGestion) {
		getMatrizGestions().remove(matrizGestion);
		matrizGestion.setCaracteristica(null);

		return matrizGestion;
	}

}