package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the C_ESTATUS_RA database table.
 * 
 */
@Entity
@Table(name="C_ESTATUS_RA")
@NamedQuery(name="CEstatusRa.findAll", query="SELECT c FROM CEstatusRa c")
public class CEstatusRa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_ESTATUS_RA_CSCESTATUSRA_GENERATOR", sequenceName="SEQ_CSC_ESTATUS_RA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_ESTATUS_RA_CSCESTATUSRA_GENERATOR")
	@Column(name="CSC_ESTATUS_RA")
	private long cscEstatusRa;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to RegistroAdhesion
	@OneToMany(mappedBy="CEstatusRa")
	@JsonIgnore
	private List<RegistroAdhesion> registroAdhesions;

	public CEstatusRa() {
	}

	public long getCscEstatusRa() {
		return this.cscEstatusRa;
	}

	public void setCscEstatusRa(long cscEstatusRa) {
		this.cscEstatusRa = cscEstatusRa;
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

	public List<RegistroAdhesion> getRegistroAdhesions() {
		return this.registroAdhesions;
	}

	public void setRegistroAdhesions(List<RegistroAdhesion> registroAdhesions) {
		this.registroAdhesions = registroAdhesions;
	}

	public RegistroAdhesion addRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().add(registroAdhesion);
		registroAdhesion.setCEstatusRa(this);

		return registroAdhesion;
	}

	public RegistroAdhesion removeRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().remove(registroAdhesion);
		registroAdhesion.setCEstatusRa(null);

		return registroAdhesion;
	}

}