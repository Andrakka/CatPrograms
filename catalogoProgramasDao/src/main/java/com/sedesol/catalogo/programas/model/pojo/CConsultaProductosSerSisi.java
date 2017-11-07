package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_CONSULTA_PRODUCTOS_SER_SISI database table.
 * 
 */
@Entity
@Table(name="C_CONSULTA_PRODUCTOS_SER_SISI")
@NamedQuery(name="CConsultaProductosSerSisi.findAll", query="SELECT c FROM CConsultaProductosSerSisi c")
public class CConsultaProductosSerSisi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_CONSULTA_PRODUCTOS_SER_SISI_CSCCONSULTAPROSERSISI_GENERATOR", sequenceName="SEQ_CSC_CONSULTA_PRO_SER_SISI",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_CONSULTA_PRODUCTOS_SER_SISI_CSCCONSULTAPROSERSISI_GENERATOR")
	@Column(name="CSC_CONSULTA_PRO_SER_SISI")
	private long cscConsultaProSerSisi;

	@Column(name="CHR_DESCRIPCION_CONSULTA_SER")
	private String chrDescripcionConsultaSer;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to ProgramaConsultaProSisi
	@OneToMany(mappedBy="CConsultaProductosSerSisi")
	private List<ProgramaConsultaProSisi> programaConsultaProSisis;

	public CConsultaProductosSerSisi() {
	}

	public long getCscConsultaProSerSisi() {
		return this.cscConsultaProSerSisi;
	}

	public void setCscConsultaProSerSisi(long cscConsultaProSerSisi) {
		this.cscConsultaProSerSisi = cscConsultaProSerSisi;
	}

	public String getChrDescripcionConsultaSer() {
		return this.chrDescripcionConsultaSer;
	}

	public void setChrDescripcionConsultaSer(String chrDescripcionConsultaSer) {
		this.chrDescripcionConsultaSer = chrDescripcionConsultaSer;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}

	public List<ProgramaConsultaProSisi> getProgramaConsultaProSisis() {
		return this.programaConsultaProSisis;
	}

	public void setProgramaConsultaProSisis(List<ProgramaConsultaProSisi> programaConsultaProSisis) {
		this.programaConsultaProSisis = programaConsultaProSisis;
	}

	public ProgramaConsultaProSisi addProgramaConsultaProSisi(ProgramaConsultaProSisi programaConsultaProSisi) {
		getProgramaConsultaProSisis().add(programaConsultaProSisi);
		programaConsultaProSisi.setCConsultaProductosSerSisi(this);

		return programaConsultaProSisi;
	}

	public ProgramaConsultaProSisi removeProgramaConsultaProSisi(ProgramaConsultaProSisi programaConsultaProSisi) {
		getProgramaConsultaProSisis().remove(programaConsultaProSisi);
		programaConsultaProSisi.setCConsultaProductosSerSisi(null);

		return programaConsultaProSisi;
	}

}