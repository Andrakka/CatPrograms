package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the COMPONENTE_PROGRAMA database table.
 * 
 */
@Entity
@Table(name="COMPONENTE_PROGRAMA")
@NamedQuery(name="ComponentePrograma.findAll", query="SELECT c FROM ComponentePrograma c")
public class ComponentePrograma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMPONENTE_PROGRAMA_CSCCOMPONENTEPROGRAMA_GENERATOR", sequenceName="SEQ_CSC_COMPONENTE_PROGRAMA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMPONENTE_PROGRAMA_CSCCOMPONENTEPROGRAMA_GENERATOR")
	@Column(name="CSC_COMPONENTE_PROGRAMA")
	private long cscComponentePrograma;

	@Column(name="AP_COMPO")
	private String apCompo;

	@Column(name="ID_COMPONENTE")
	private String idComponente;

	@Column(name="NOMBRE_COMPONENTE")
	private String nombreComponente;

	@Column(name="OBJ_COMPO")
	private String objCompo;

	@Column(name="POB_COMPO")
	private String pobCompo;

	//bi-directional many-to-one association to Caracteristica
	@OneToMany(mappedBy="componentePrograma")
	private List<Caracteristica> caracteristicas;

	//bi-directional many-to-one association to DetallePrograma
	@ManyToOne
	@JoinColumn(name="CSC_DETALLE_PRO_FK")
	private DetallePrograma detallePrograma;

	public ComponentePrograma() {
	}

	public long getCscComponentePrograma() {
		return this.cscComponentePrograma;
	}

	public void setCscComponentePrograma(long cscComponentePrograma) {
		this.cscComponentePrograma = cscComponentePrograma;
	}

	public String getApCompo() {
		return this.apCompo;
	}

	public void setApCompo(String apCompo) {
		this.apCompo = apCompo;
	}

	public String getIdComponente() {
		return this.idComponente;
	}

	public void setIdComponente(String idComponente) {
		this.idComponente = idComponente;
	}

	public String getNombreComponente() {
		return this.nombreComponente;
	}

	public void setNombreComponente(String nombreComponente) {
		this.nombreComponente = nombreComponente;
	}

	public String getObjCompo() {
		return this.objCompo;
	}

	public void setObjCompo(String objCompo) {
		this.objCompo = objCompo;
	}

	public String getPobCompo() {
		return this.pobCompo;
	}

	public void setPobCompo(String pobCompo) {
		this.pobCompo = pobCompo;
	}

	public List<Caracteristica> getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Caracteristica addCaracteristica(Caracteristica caracteristica) {
		getCaracteristicas().add(caracteristica);
		caracteristica.setComponentePrograma(this);

		return caracteristica;
	}

	public Caracteristica removeCaracteristica(Caracteristica caracteristica) {
		getCaracteristicas().remove(caracteristica);
		caracteristica.setComponentePrograma(null);

		return caracteristica;
	}

	public DetallePrograma getDetallePrograma() {
		return this.detallePrograma;
	}

	public void setDetallePrograma(DetallePrograma detallePrograma) {
		this.detallePrograma = detallePrograma;
	}

}