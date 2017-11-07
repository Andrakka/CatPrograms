package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_TEMATICA_BIENESTAR database table.
 * 
 */
@Entity
@Table(name="C_TEMATICA_BIENESTAR")
@NamedQuery(name="CTematicaBienestar.findAll", query="SELECT c FROM CTematicaBienestar c")
public class CTematicaBienestar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_TEMATICA_BIENESTAR_CSCTEMATICABIE_GENERATOR", sequenceName="SEQ_CSC_TEMATICA_BIE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_TEMATICA_BIENESTAR_CSCTEMATICABIE_GENERATOR")
	@Column(name="CSC_TEMATICA_BIE")
	private long cscTematicaBie;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	/*
	//bi-directional many-to-one association to DatosAdmBienestar
	@OneToMany(mappedBy="CTematicaBienestar")
	private List<DatosAdmBienestar> datosAdmBienestars;*/

	public CTematicaBienestar() {
	}

	public long getCscTematicaBie() {
		return this.cscTematicaBie;
	}

	public void setCscTematicaBie(long cscTematicaBie) {
		this.cscTematicaBie = cscTematicaBie;
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

	/*
	public List<DatosAdmBienestar> getDatosAdmBienestars() {
		return this.datosAdmBienestars;
	}

	public void setDatosAdmBienestars(List<DatosAdmBienestar> datosAdmBienestars) {
		this.datosAdmBienestars = datosAdmBienestars;
	}

	public DatosAdmBienestar addDatosAdmBienestar(DatosAdmBienestar datosAdmBienestar) {
		getDatosAdmBienestars().add(datosAdmBienestar);
		datosAdmBienestar.setCTematicaBienestar(this);

		return datosAdmBienestar;
	}

	public DatosAdmBienestar removeDatosAdmBienestar(DatosAdmBienestar datosAdmBienestar) {
		getDatosAdmBienestars().remove(datosAdmBienestar);
		datosAdmBienestar.setCTematicaBienestar(null);

		return datosAdmBienestar;
	}*/

}