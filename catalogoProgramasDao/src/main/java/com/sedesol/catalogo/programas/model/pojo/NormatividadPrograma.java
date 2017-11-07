package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the NORMATIVIDAD_PROGRAMA database table.
 * 
 */
@Entity
@Table(name="NORMATIVIDAD_PROGRAMA")
@NamedQuery(name="NormatividadPrograma.findAll", query="SELECT n FROM NormatividadPrograma n")
public class NormatividadPrograma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="NORMATIVIDAD_PROGRAMA_CSCNORMATIVIDADPRO_GENERATOR", sequenceName="SEQ_CSC_NORMATIVIDAD_PRO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NORMATIVIDAD_PROGRAMA_CSCNORMATIVIDADPRO_GENERATOR")
	@Column(name="CSC_NORMATIVIDAD_PRO")
	private long cscNormatividadPro;

	@Column(name="ANIO_INICIO_PROG")
	private BigDecimal anioInicioProg;

	@Column(name="COBERTURA_GEO")
	private String coberturaGeo;

	@Column(name="CVE_ENTIDAD_FEDERATIVA")
	private String cveEntidadFederativa;

	@Column(name="CVE_MUNICIPIO")
	private String cveMunicipio;

	@Column(name="DOC_NORMA")
	private BigDecimal docNorma;

	@Column(name="DOC_SUPWEB")
	private BigDecimal docSupweb;

	@Column(name="NOM_DOC_NORMA")
	private String nomDocNorma;

	@Column(name="NOM_ENTIDAD_FEDERATIVA")
	private String nomEntidadFederativa;

	@Column(name="NOM_MUNICIPIO")
	private String nomMunicipio;

	@Column(name="OBJ_GRAL_PROG")
	private String objGralProg;

	@Column(name="POB_OBJ_PROG")
	private String pobObjProg;

	@Column(name="SITIO_WEB")
	private BigDecimal sitioWeb;

	@Column(name="SITIO_WEB_ESP")
	private String sitioWebEsp;

	//bi-directional many-to-one association to DetallePrograma
	@OneToMany(mappedBy="normatividadPrograma")
	private List<DetallePrograma> detalleProgramas;

	//bi-directional many-to-one association to ObjetivosEspecifico
	@OneToMany(mappedBy="normatividadPrograma")
	private List<ObjetivosEspecifico> objetivosEspecificos;

	public NormatividadPrograma() {
	}

	public long getCscNormatividadPro() {
		return this.cscNormatividadPro;
	}

	public void setCscNormatividadPro(long cscNormatividadPro) {
		this.cscNormatividadPro = cscNormatividadPro;
	}

	public BigDecimal getAnioInicioProg() {
		return this.anioInicioProg;
	}

	public void setAnioInicioProg(BigDecimal anioInicioProg) {
		this.anioInicioProg = anioInicioProg;
	}

	public String getCoberturaGeo() {
		return this.coberturaGeo;
	}

	public void setCoberturaGeo(String coberturaGeo) {
		this.coberturaGeo = coberturaGeo;
	}

	public String getCveEntidadFederativa() {
		return this.cveEntidadFederativa;
	}

	public void setCveEntidadFederativa(String cveEntidadFederativa) {
		this.cveEntidadFederativa = cveEntidadFederativa;
	}

	public String getCveMunicipio() {
		return this.cveMunicipio;
	}

	public void setCveMunicipio(String cveMunicipio) {
		this.cveMunicipio = cveMunicipio;
	}

	public BigDecimal getDocNorma() {
		return this.docNorma;
	}

	public void setDocNorma(BigDecimal docNorma) {
		this.docNorma = docNorma;
	}

	public BigDecimal getDocSupweb() {
		return this.docSupweb;
	}

	public void setDocSupweb(BigDecimal docSupweb) {
		this.docSupweb = docSupweb;
	}

	public String getNomDocNorma() {
		return this.nomDocNorma;
	}

	public void setNomDocNorma(String nomDocNorma) {
		this.nomDocNorma = nomDocNorma;
	}

	public String getNomEntidadFederativa() {
		return this.nomEntidadFederativa;
	}

	public void setNomEntidadFederativa(String nomEntidadFederativa) {
		this.nomEntidadFederativa = nomEntidadFederativa;
	}

	public String getNomMunicipio() {
		return this.nomMunicipio;
	}

	public void setNomMunicipio(String nomMunicipio) {
		this.nomMunicipio = nomMunicipio;
	}

	public String getObjGralProg() {
		return this.objGralProg;
	}

	public void setObjGralProg(String objGralProg) {
		this.objGralProg = objGralProg;
	}

	public String getPobObjProg() {
		return this.pobObjProg;
	}

	public void setPobObjProg(String pobObjProg) {
		this.pobObjProg = pobObjProg;
	}

	public BigDecimal getSitioWeb() {
		return this.sitioWeb;
	}

	public void setSitioWeb(BigDecimal sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

	public String getSitioWebEsp() {
		return this.sitioWebEsp;
	}

	public void setSitioWebEsp(String sitioWebEsp) {
		this.sitioWebEsp = sitioWebEsp;
	}

	public List<DetallePrograma> getDetalleProgramas() {
		return this.detalleProgramas;
	}

	public void setDetalleProgramas(List<DetallePrograma> detalleProgramas) {
		this.detalleProgramas = detalleProgramas;
	}

	public DetallePrograma addDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().add(detallePrograma);
		detallePrograma.setNormatividadPrograma(this);

		return detallePrograma;
	}

	public DetallePrograma removeDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().remove(detallePrograma);
		detallePrograma.setNormatividadPrograma(null);

		return detallePrograma;
	}

	public List<ObjetivosEspecifico> getObjetivosEspecificos() {
		return this.objetivosEspecificos;
	}

	public void setObjetivosEspecificos(List<ObjetivosEspecifico> objetivosEspecificos) {
		this.objetivosEspecificos = objetivosEspecificos;
	}

	public ObjetivosEspecifico addObjetivosEspecifico(ObjetivosEspecifico objetivosEspecifico) {
		getObjetivosEspecificos().add(objetivosEspecifico);
		objetivosEspecifico.setNormatividadPrograma(this);

		return objetivosEspecifico;
	}

	public ObjetivosEspecifico removeObjetivosEspecifico(ObjetivosEspecifico objetivosEspecifico) {
		getObjetivosEspecificos().remove(objetivosEspecifico);
		objetivosEspecifico.setNormatividadPrograma(null);

		return objetivosEspecifico;
	}

}