package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the C_ORDEN_DE_GOBIERNO database table.
 * 
 */
@Entity
@Table(name="C_ORDEN_DE_GOBIERNO")
@NamedQuery(name="COrdenDeGobierno.findAll", query="SELECT c FROM COrdenDeGobierno c")
public class COrdenDeGobierno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_ORDEN_DE_GOBIERNO_CSCORDENDEGOBIERNO_GENERATOR", sequenceName="SEQ_CSC_ORDEN_DE_GOBIERNO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_ORDEN_DE_GOBIERNO_CSCORDENDEGOBIERNO_GENERATOR")
	@Column(name="CSC_ORDEN_DE_GOBIERNO")
	private long cscOrdenDeGobierno;

	@Column(name="CHR_DESCRIPCION_ORDEN_GOB")
	private String chrDescripcionOrdenGob;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to RegistroAdhesion
	@OneToMany(mappedBy="COrdenDeGobierno")
	@JsonIgnore
	private List<RegistroAdhesion> registroAdhesions;

	public COrdenDeGobierno() {
	}

	public long getCscOrdenDeGobierno() {
		return this.cscOrdenDeGobierno;
	}

	public void setCscOrdenDeGobierno(long cscOrdenDeGobierno) {
		this.cscOrdenDeGobierno = cscOrdenDeGobierno;
	}

	public String getChrDescripcionOrdenGob() {
		return this.chrDescripcionOrdenGob;
	}

	public void setChrDescripcionOrdenGob(String chrDescripcionOrdenGob) {
		this.chrDescripcionOrdenGob = chrDescripcionOrdenGob;
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
		registroAdhesion.setCOrdenDeGobierno(this);

		return registroAdhesion;
	}

	public RegistroAdhesion removeRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		getRegistroAdhesions().remove(registroAdhesion);
		registroAdhesion.setCOrdenDeGobierno(null);

		return registroAdhesion;
	}

}