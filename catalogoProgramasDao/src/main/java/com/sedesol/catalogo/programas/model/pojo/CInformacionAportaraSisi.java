package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the C_INFORMACION_APORTARA_SISI database table.
 * 
 */
@Entity
@Table(name="C_INFORMACION_APORTARA_SISI")
@NamedQuery(name="CInformacionAportaraSisi.findAll", query="SELECT c FROM CInformacionAportaraSisi c")
public class CInformacionAportaraSisi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_INFORMACION_APORTARA_SISI_CSCINFOAPORTASISI_GENERATOR", sequenceName="SEQ_CSC_INFO_APORTA_SISI")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_INFORMACION_APORTARA_SISI_CSCINFOAPORTASISI_GENERATOR")
	@Column(name="CSC_INFO_APORTA_SISI")
	private long cscInfoAportaSisi;

	@Column(name="CHR_DESCRIPCION_INF_APORTARA")
	private String chrDescripcionInfAportara;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to ProgramaInfAportaraSisi
	@OneToMany(mappedBy="CInformacionAportaraSisi")
	@JsonIgnore
	private List<ProgramaInfAportaraSisi> programaInfAportaraSisis;

	public CInformacionAportaraSisi() {
	}

	public long getCscInfoAportaSisi() {
		return this.cscInfoAportaSisi;
	}

	public void setCscInfoAportaSisi(long cscInfoAportaSisi) {
		this.cscInfoAportaSisi = cscInfoAportaSisi;
	}

	public String getChrDescripcionInfAportara() {
		return this.chrDescripcionInfAportara;
	}

	public void setChrDescripcionInfAportara(String chrDescripcionInfAportara) {
		this.chrDescripcionInfAportara = chrDescripcionInfAportara;
	}

	public BigDecimal getSnActivo() {
		return this.snActivo;
	}

	public void setSnActivo(BigDecimal snActivo) {
		this.snActivo = snActivo;
	}

	public List<ProgramaInfAportaraSisi> getProgramaInfAportaraSisis() {
		return this.programaInfAportaraSisis;
	}

	public void setProgramaInfAportaraSisis(List<ProgramaInfAportaraSisi> programaInfAportaraSisis) {
		this.programaInfAportaraSisis = programaInfAportaraSisis;
	}

	public ProgramaInfAportaraSisi addProgramaInfAportaraSisi(ProgramaInfAportaraSisi programaInfAportaraSisi) {
		getProgramaInfAportaraSisis().add(programaInfAportaraSisi);
		programaInfAportaraSisi.setCInformacionAportaraSisi(this);

		return programaInfAportaraSisi;
	}

	public ProgramaInfAportaraSisi removeProgramaInfAportaraSisi(ProgramaInfAportaraSisi programaInfAportaraSisi) {
		getProgramaInfAportaraSisis().remove(programaInfAportaraSisi);
		programaInfAportaraSisi.setCInformacionAportaraSisi(null);

		return programaInfAportaraSisi;
	}

}