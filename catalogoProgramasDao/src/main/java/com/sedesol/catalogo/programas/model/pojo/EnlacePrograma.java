package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ENLACE_PROGRAMA database table.
 * 
 */
@Entity
@Table(name="ENLACE_PROGRAMA")
@NamedQuery(name="EnlacePrograma.findAll", query="SELECT e FROM EnlacePrograma e")
public class EnlacePrograma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ENLACE_PROGRAMA_CSCENLACEPRO_GENERATOR", sequenceName="SEQ_CSC_ENLACE_PRO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ENLACE_PROGRAMA_CSCENLACEPRO_GENERATOR")
	@Column(name="CSC_ENLACE_PRO")
	private long cscEnlacePro;

	@Column(name="EP_CARGO")
	private String epCargo;

	@Column(name="EP_CORREO")
	private String epCorreo;

	@Column(name="EP_EXT")
	private String epExt;

	@Column(name="EP_NOMBRE")
	private String epNombre;

	@Column(name="EP_PRIMER_AP")
	private String epPrimerAp;

	@Column(name="EP_SEGUNDO_AP")
	private String epSegundoAp;

	@Column(name="EP_TEL")
	private String epTel;

	//bi-directional many-to-one association to DetallePrograma
	@OneToMany(mappedBy="enlacePrograma")
	private List<DetallePrograma> detalleProgramas;

	public EnlacePrograma() {
	}

	public long getCscEnlacePro() {
		return this.cscEnlacePro;
	}

	public void setCscEnlacePro(long cscEnlacePro) {
		this.cscEnlacePro = cscEnlacePro;
	}

	public String getEpCargo() {
		return this.epCargo;
	}

	public void setEpCargo(String epCargo) {
		this.epCargo = epCargo;
	}

	public String getEpCorreo() {
		return this.epCorreo;
	}

	public void setEpCorreo(String epCorreo) {
		this.epCorreo = epCorreo;
	}

	public String getEpExt() {
		return this.epExt;
	}

	public void setEpExt(String epExt) {
		this.epExt = epExt;
	}

	public String getEpNombre() {
		return this.epNombre;
	}

	public void setEpNombre(String epNombre) {
		this.epNombre = epNombre;
	}

	public String getEpPrimerAp() {
		return this.epPrimerAp;
	}

	public void setEpPrimerAp(String epPrimerAp) {
		this.epPrimerAp = epPrimerAp;
	}

	public String getEpSegundoAp() {
		return this.epSegundoAp;
	}

	public void setEpSegundoAp(String epSegundoAp) {
		this.epSegundoAp = epSegundoAp;
	}

	public String getEpTel() {
		return this.epTel;
	}

	public void setEpTel(String epTel) {
		this.epTel = epTel;
	}

	public List<DetallePrograma> getDetalleProgramas() {
		return this.detalleProgramas;
	}

	public void setDetalleProgramas(List<DetallePrograma> detalleProgramas) {
		this.detalleProgramas = detalleProgramas;
	}

	public DetallePrograma addDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().add(detallePrograma);
		detallePrograma.setEnlacePrograma(this);

		return detallePrograma;
	}

	public DetallePrograma removeDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().remove(detallePrograma);
		detallePrograma.setEnlacePrograma(null);

		return detallePrograma;
	}

}