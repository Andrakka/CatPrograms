package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_PARTICIPACION_UA database table.
 * 
 */
@Entity
@Table(name="C_PARTICIPACION_UA")
@NamedQuery(name="CParticipacionUa.findAll", query="SELECT c FROM CParticipacionUa c")
public class CParticipacionUa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_PARTICIPACION_UA_CSCPARTUA_GENERATOR", sequenceName="SEQ_CSC_PART_UA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_PARTICIPACION_UA_CSCPARTUA_GENERATOR")
	@Column(name="CSC_PART_UA")
	private long cscPartUa;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to DetallePrograma
	@OneToMany(mappedBy="CParticipacionUa")
	private List<DetallePrograma> detalleProgramas;

	public CParticipacionUa() {
	}

	public long getCscPartUa() {
		return this.cscPartUa;
	}

	public void setCscPartUa(long cscPartUa) {
		this.cscPartUa = cscPartUa;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}

	public List<DetallePrograma> getDetalleProgramas() {
		return this.detalleProgramas;
	}

	public void setDetalleProgramas(List<DetallePrograma> detalleProgramas) {
		this.detalleProgramas = detalleProgramas;
	}

	public DetallePrograma addDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().add(detallePrograma);
		detallePrograma.setCParticipacionUa(this);

		return detallePrograma;
	}

	public DetallePrograma removeDetallePrograma(DetallePrograma detallePrograma) {
		getDetalleProgramas().remove(detallePrograma);
		detallePrograma.setCParticipacionUa(null);

		return detallePrograma;
	}

}