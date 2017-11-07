package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the DETALLE_PROGRAMA database table.
 * 
 */
@Entity
@Table(name="DETALLE_PROGRAMA")
@NamedQuery(name="DetallePrograma.findAll", query="SELECT d FROM DetallePrograma d")
public class DetallePrograma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DETALLE_PROGRAMA_CSCDETALLEPRO_GENERATOR", sequenceName="SEQ_CSC_DETALLE_PRO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DETALLE_PROGRAMA_CSCDETALLEPRO_GENERATOR")
	@Column(name="CSC_DETALLE_PRO")
	private long cscDetallePro;

	@Column(name="CSC_CONTRIBUCION_DER_SOC")
	private BigDecimal cscContribucionDerSoc;

	@Column(name="CVE_DR")
	private String cveDr;

	@Column(name="CVE_PRES")
	private String cvePres;

	@Column(name="CVE_UA")
	private String cveUa;

	@Column(name="NOM_DR")
	private String nomDr;

	@Column(name="NOM_PROGR")
	private String nomProgr;

	@Column(name="NOM_UA")
	private String nomUa;

	@Column(name="RA_FOLIO")
	private String raFolio;

	@Column(name="TIENE_COMPONENTES")
	private BigDecimal tieneComponentes;

	//bi-directional many-to-one association to Caracteristica
	@OneToMany(mappedBy="detallePrograma")
	private List<Caracteristica> caracteristicas;

	//bi-directional many-to-one association to ComponentePrograma
	@OneToMany(mappedBy="detallePrograma")
	private List<ComponentePrograma> componenteProgramas;

	//bi-directional many-to-one association to CoparticionOtrosPro
	@OneToMany(mappedBy="detallePrograma")
	private List<CoparticionOtrosPro> coparticionOtrosPros;

	//bi-directional many-to-one association to Cuap
	@OneToMany(mappedBy="detallePrograma")
	private List<Cuap> cuaps;

	//bi-directional many-to-one association to CParticipacionUa
	@ManyToOne
	@JoinColumn(name="PART_UA")
	private CParticipacionUa CParticipacionUa;

	//bi-directional many-to-one association to CuantificacionPoblacione
	@ManyToOne
	@JoinColumn(name="CSC_CUANTIFICACION_POBLACIONES")
	private CuantificacionPoblacione cuantificacionPoblacione;
	
	//bi-directional many-to-one association to CEvaluacione
	@ManyToOne
	@JoinColumn(name="CSC_EVALUACIONES")
	private CEvaluacione CEvaluacione;

	//bi-directional many-to-one association to CMir
	@ManyToOne
	@JoinColumn(name="CSC_MIR")
	private CMir CMir;

	//bi-directional many-to-one association to EnlacePrograma
	@ManyToOne
	@JoinColumn(name="CSC_ENLACE_PRO")
	private EnlacePrograma enlacePrograma;

	//bi-directional many-to-one association to NormatividadPrograma
	@ManyToOne
	@JoinColumn(name="CSC_NORMATIVIDAD_PRO_FK")
	private NormatividadPrograma normatividadPrograma;

	//bi-directional many-to-one association to RecursosFinanciero
	@ManyToOne
	@JoinColumn(name="CSC_RECURSOS_FINANCIEROS")
	private RecursosFinanciero recursosFinanciero;

	public DetallePrograma() {
	}

	public long getCscDetallePro() {
		return this.cscDetallePro;
	}

	public void setCscDetallePro(long cscDetallePro) {
		this.cscDetallePro = cscDetallePro;
	}

	public BigDecimal getCscContribucionDerSoc() {
		return this.cscContribucionDerSoc;
	}

	public void setCscContribucionDerSoc(BigDecimal cscContribucionDerSoc) {
		this.cscContribucionDerSoc = cscContribucionDerSoc;
	}

	public String getCveDr() {
		return this.cveDr;
	}

	public void setCveDr(String cveDr) {
		this.cveDr = cveDr;
	}

	public String getCvePres() {
		return this.cvePres;
	}

	public void setCvePres(String cvePres) {
		this.cvePres = cvePres;
	}

	public String getCveUa() {
		return this.cveUa;
	}

	public void setCveUa(String cveUa) {
		this.cveUa = cveUa;
	}

	public String getNomDr() {
		return this.nomDr;
	}

	public void setNomDr(String nomDr) {
		this.nomDr = nomDr;
	}

	public String getNomProgr() {
		return this.nomProgr;
	}

	public void setNomProgr(String nomProgr) {
		this.nomProgr = nomProgr;
	}

	public String getNomUa() {
		return this.nomUa;
	}

	public void setNomUa(String nomUa) {
		this.nomUa = nomUa;
	}

	public String getRaFolio() {
		return this.raFolio;
	}

	public void setRaFolio(String raFolio) {
		this.raFolio = raFolio;
	}

	public BigDecimal getTieneComponentes() {
		return this.tieneComponentes;
	}

	public void setTieneComponentes(BigDecimal tieneComponentes) {
		this.tieneComponentes = tieneComponentes;
	}

	public List<ComponentePrograma> getComponenteProgramas() {
		return this.componenteProgramas;
	}

	public void setComponenteProgramas(List<ComponentePrograma> componenteProgramas) {
		this.componenteProgramas = componenteProgramas;
	}

	public ComponentePrograma addComponentePrograma(ComponentePrograma componentePrograma) {
		getComponenteProgramas().add(componentePrograma);
		componentePrograma.setDetallePrograma(this);

		return componentePrograma;
	}

	public ComponentePrograma removeComponentePrograma(ComponentePrograma componentePrograma) {
		getComponenteProgramas().remove(componentePrograma);
		componentePrograma.setDetallePrograma(null);

		return componentePrograma;
	}

	public List<CoparticionOtrosPro> getCoparticionOtrosPros() {
		return this.coparticionOtrosPros;
	}

	public void setCoparticionOtrosPros(List<CoparticionOtrosPro> coparticionOtrosPros) {
		this.coparticionOtrosPros = coparticionOtrosPros;
	}

	public CoparticionOtrosPro addCoparticionOtrosPro(CoparticionOtrosPro coparticionOtrosPro) {
		getCoparticionOtrosPros().add(coparticionOtrosPro);
		coparticionOtrosPro.setDetallePrograma(this);

		return coparticionOtrosPro;
	}

	public CoparticionOtrosPro removeCoparticionOtrosPro(CoparticionOtrosPro coparticionOtrosPro) {
		getCoparticionOtrosPros().remove(coparticionOtrosPro);
		coparticionOtrosPro.setDetallePrograma(null);

		return coparticionOtrosPro;
	}

	public List<Cuap> getCuaps() {
		return this.cuaps;
	}

	public void setCuaps(List<Cuap> cuaps) {
		this.cuaps = cuaps;
	}

	public Cuap addCuap(Cuap cuap) {
		getCuaps().add(cuap);
		cuap.setDetallePrograma(this);

		return cuap;
	}

	public Cuap removeCuap(Cuap cuap) {
		getCuaps().remove(cuap);
		cuap.setDetallePrograma(null);

		return cuap;
	}

	public CParticipacionUa getCParticipacionUa() {
		return this.CParticipacionUa;
	}

	public void setCParticipacionUa(CParticipacionUa CParticipacionUa) {
		this.CParticipacionUa = CParticipacionUa;
	}

	public CuantificacionPoblacione getCuantificacionPoblacione() {
		return this.cuantificacionPoblacione;
	}

	public void setCuantificacionPoblacione(CuantificacionPoblacione cuantificacionPoblacione) {
		this.cuantificacionPoblacione = cuantificacionPoblacione;
	}
	
	public CEvaluacione getCEvaluacione() {
		return this.CEvaluacione;
	}

	public void setCEvaluacione(CEvaluacione CEvaluacione) {
		this.CEvaluacione = CEvaluacione;
	}

	public CMir getCMir() {
		return this.CMir;
	}

	public void setCMir(CMir CMir) {
		this.CMir = CMir;
	}

	public EnlacePrograma getEnlacePrograma() {
		return this.enlacePrograma;
	}

	public void setEnlacePrograma(EnlacePrograma enlacePrograma) {
		this.enlacePrograma = enlacePrograma;
	}

	public NormatividadPrograma getNormatividadPrograma() {
		return this.normatividadPrograma;
	}

	public void setNormatividadPrograma(NormatividadPrograma normatividadPrograma) {
		this.normatividadPrograma = normatividadPrograma;
	}

	public RecursosFinanciero getRecursosFinanciero() {
		return this.recursosFinanciero;
	}

	public void setRecursosFinanciero(RecursosFinanciero recursosFinanciero) {
		this.recursosFinanciero = recursosFinanciero;
	}

}