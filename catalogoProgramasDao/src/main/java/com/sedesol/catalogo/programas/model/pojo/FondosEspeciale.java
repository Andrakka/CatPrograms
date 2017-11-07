package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FONDOS_ESPECIALES database table.
 * 
 */
@Entity
@Table(name="FONDOS_ESPECIALES")
@NamedQuery(name="FondosEspeciale.findAll", query="SELECT f FROM FondosEspeciale f")
public class FondosEspeciale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FONDOS_ESPECIALES_CSCFONDOSESPECIALES_GENERATOR", sequenceName="SEQ_CSC_FONDOS_ESPECIALES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FONDOS_ESPECIALES_CSCFONDOSESPECIALES_GENERATOR")
	@Column(name="CSC_FONDOS_ESPECIALES")
	private long cscFondosEspeciales;

	@Column(name="CHR_AUTORIZO_CARGO")
	private String chrAutorizoCargo;

	@Column(name="CHR_AUTORIZO_NOMBRE")
	private String chrAutorizoNombre;

	@Column(name="CHR_CVE_USUARIO_FONDOS_ESP")
	private String chrCveUsuarioFondosEsp;

	@Column(name="CHR_ELABORO_CARGO")
	private String chrElaboroCargo;

	@Column(name="CHR_ELABORO_NOMBRE")
	private String chrElaboroNombre;

	@Column(name="CHR_FOLIO_FONDOS_ESPECIALES")
	private String chrFolioFondosEspeciales;

	@Column(name="CHR_OBSERVACION_FONDO")
	private String chrObservacionFondo;

	@Temporal(TemporalType.DATE)
	@Column(name="FCH_CAPTURA_FONDOS_ESPECIALES")
	private Date fchCapturaFondosEspeciales;

	//bi-directional many-to-one association to CDescripcionFondo
	@ManyToOne
	@JoinColumn(name="CSC_DESCRIPCION_FONDO_FK")
	private CDescripcionFondo cDescripcionFondo;

	//bi-directional many-to-one association to DocumentoNormativoFondo
	@ManyToOne
	@JoinColumn(name="CSC_DOCUMENTO_NORMATIVO_FK")
	private DocumentoNormativoFondo documentoNormativoFondo;

	//bi-directional many-to-one association to RegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_REGISTRO_ADHESION_FK")
	private RegistroAdhesion registroAdhesion;

	//bi-directional many-to-one association to ResponsableFondo
	@ManyToOne
	@JoinColumn(name="CSC_RESPONSABLE_FONDO_FK")
	private ResponsableFondo responsableFondo;

	//bi-directional many-to-one association to Proyecto
	@OneToMany(mappedBy="fondosEspeciale")
	private List<Proyecto> proyectos;

	public FondosEspeciale() {
	}

	public long getCscFondosEspeciales() {
		return this.cscFondosEspeciales;
	}

	public void setCscFondosEspeciales(long cscFondosEspeciales) {
		this.cscFondosEspeciales = cscFondosEspeciales;
	}

	public String getChrAutorizoCargo() {
		return this.chrAutorizoCargo;
	}

	public void setChrAutorizoCargo(String chrAutorizoCargo) {
		this.chrAutorizoCargo = chrAutorizoCargo;
	}

	public String getChrAutorizoNombre() {
		return this.chrAutorizoNombre;
	}

	public void setChrAutorizoNombre(String chrAutorizoNombre) {
		this.chrAutorizoNombre = chrAutorizoNombre;
	}

	public String getChrCveUsuarioFondosEsp() {
		return this.chrCveUsuarioFondosEsp;
	}

	public void setChrCveUsuarioFondosEsp(String chrCveUsuarioFondosEsp) {
		this.chrCveUsuarioFondosEsp = chrCveUsuarioFondosEsp;
	}

	public String getChrElaboroCargo() {
		return this.chrElaboroCargo;
	}

	public void setChrElaboroCargo(String chrElaboroCargo) {
		this.chrElaboroCargo = chrElaboroCargo;
	}

	public String getChrElaboroNombre() {
		return this.chrElaboroNombre;
	}

	public void setChrElaboroNombre(String chrElaboroNombre) {
		this.chrElaboroNombre = chrElaboroNombre;
	}

	public String getChrFolioFondosEspeciales() {
		return this.chrFolioFondosEspeciales;
	}

	public void setChrFolioFondosEspeciales(String chrFolioFondosEspeciales) {
		this.chrFolioFondosEspeciales = chrFolioFondosEspeciales;
	}

	public String getChrObservacionFondo() {
		return this.chrObservacionFondo;
	}

	public void setChrObservacionFondo(String chrObservacionFondo) {
		this.chrObservacionFondo = chrObservacionFondo;
	}

	public Date getFchCapturaFondosEspeciales() {
		return this.fchCapturaFondosEspeciales;
	}

	public void setFchCapturaFondosEspeciales(Date fchCapturaFondosEspeciales) {
		this.fchCapturaFondosEspeciales = fchCapturaFondosEspeciales;
	}

	public CDescripcionFondo getCDescripcionFondo() {
		return this.cDescripcionFondo;
	}

	public void setCDescripcionFondo(CDescripcionFondo cDescripcionFondo) {
		this.cDescripcionFondo = cDescripcionFondo;
	}

	public DocumentoNormativoFondo getDocumentoNormativoFondo() {
		return this.documentoNormativoFondo;
	}

	public void setDocumentoNormativoFondo(DocumentoNormativoFondo documentoNormativoFondo) {
		this.documentoNormativoFondo = documentoNormativoFondo;
	}

	public RegistroAdhesion getRegistroAdhesion() {
		return this.registroAdhesion;
	}

	public void setRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		this.registroAdhesion = registroAdhesion;
	}

	public ResponsableFondo getResponsableFondo() {
		return this.responsableFondo;
	}

	public void setResponsableFondo(ResponsableFondo responsableFondo) {
		this.responsableFondo = responsableFondo;
	}

	public List<Proyecto> getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public Proyecto addProyecto(Proyecto proyecto) {
		getProyectos().add(proyecto);
		proyecto.setFondosEspeciale(this);

		return proyecto;
	}

	public Proyecto removeProyecto(Proyecto proyecto) {
		getProyectos().remove(proyecto);
		proyecto.setFondosEspeciale(null);

		return proyecto;
	}

}