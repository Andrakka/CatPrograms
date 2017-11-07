package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the INSUMOS_REGISTRO_ADHESION database table.
 * 
 */
@Entity
@Table(name="INSUMOS_REGISTRO_ADHESION")
@NamedQuery(name="InsumosRegistroAdhesion.findAll", query="SELECT i FROM InsumosRegistroAdhesion i")
public class InsumosRegistroAdhesion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="INSUMOS_REGISTRO_ADHESION_CSCINSUMOSREGISTRO_GENERATOR", sequenceName="SEQ_CSC_INSUMOS_REGISTRO",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INSUMOS_REGISTRO_ADHESION_CSCINSUMOSREGISTRO_GENERATOR")
	@Column(name="CSC_INSUMOS_REGISTRO")
	private long cscInsumosRegistro;

	@Column(name="SN_INTERCAMBIA_INF_SISI")
	private BigDecimal snIntercambiaInfSisi;

	//bi-directional many-to-one association to Cuap
	@OneToMany(mappedBy="insumosRegistroAdhesion")
	@JsonIgnore
	private List<Cuap> cuaps;

	//bi-directional many-to-one association to FondosEspecialesRegAdhesion
	@OneToMany(mappedBy="insumosRegistroAdhesion")
	@JsonIgnore
	private List<FondosEspecialesRegAdhesion> fondosEspecialesRegAdhesions;

	//bi-directional many-to-one association to RegistroAdhesion
	@ManyToOne
	@JoinColumn(name="CSC_REGISTRO_ADHESION_FK")
	private RegistroAdhesion registroAdhesion;

	//bi-directional many-to-one association to ProgramasSocResponsablePro
	@OneToMany(mappedBy="insumosRegistroAdhesion")
	@JsonIgnore
	private List<ProgramasSocResponsablePro> programasSocResponsablePros;

	//bi-directional many-to-one association to ProgramaConsultaProSisi
	@OneToMany(mappedBy="insumosRegistroAdhesion")
	@JsonIgnore
	private List<ProgramaConsultaProSisi> programaConsultaProSisis;

	//bi-directional many-to-one association to ProgramaCuap
	@OneToMany(mappedBy="insumosRegistroAdhesion")
	@JsonIgnore
	private List<ProgramaCuap> programaCuaps;

	//bi-directional many-to-one association to ProgramaInfAportaraSisi
	@OneToMany(mappedBy="insumosRegistroAdhesion")
	@JsonIgnore
	private List<ProgramaInfAportaraSisi> programaInfAportaraSisis;

	//bi-directional many-to-one association to UaSinPrograma
	@OneToMany(mappedBy="insumosRegistroAdhesion")
	@JsonIgnore
	private List<UaSinPrograma> uaSinProgramas;

	public InsumosRegistroAdhesion() {
	}

	public long getCscInsumosRegistro() {
		return this.cscInsumosRegistro;
	}

	public void setCscInsumosRegistro(long cscInsumosRegistro) {
		this.cscInsumosRegistro = cscInsumosRegistro;
	}

	public BigDecimal getSnIntercambiaInfSisi() {
		return this.snIntercambiaInfSisi;
	}

	public void setSnIntercambiaInfSisi(BigDecimal snIntercambiaInfSisi) {
		this.snIntercambiaInfSisi = snIntercambiaInfSisi;
	}

	public List<Cuap> getCuaps() {
		return this.cuaps;
	}

	public void setCuaps(List<Cuap> cuaps) {
		this.cuaps = cuaps;
	}

	public Cuap addCuap(Cuap cuap) {
		getCuaps().add(cuap);
		cuap.setInsumosRegistroAdhesion(this);

		return cuap;
	}

	public Cuap removeCuap(Cuap cuap) {
		getCuaps().remove(cuap);
		cuap.setInsumosRegistroAdhesion(null);

		return cuap;
	}

	public List<FondosEspecialesRegAdhesion> getFondosEspecialesRegAdhesions() {
		return this.fondosEspecialesRegAdhesions;
	}

	public void setFondosEspecialesRegAdhesions(List<FondosEspecialesRegAdhesion> fondosEspecialesRegAdhesions) {
		this.fondosEspecialesRegAdhesions = fondosEspecialesRegAdhesions;
	}

	public FondosEspecialesRegAdhesion addFondosEspecialesRegAdhesion(FondosEspecialesRegAdhesion fondosEspecialesRegAdhesion) {
		getFondosEspecialesRegAdhesions().add(fondosEspecialesRegAdhesion);
		fondosEspecialesRegAdhesion.setInsumosRegistroAdhesion(this);

		return fondosEspecialesRegAdhesion;
	}

	public FondosEspecialesRegAdhesion removeFondosEspecialesRegAdhesion(FondosEspecialesRegAdhesion fondosEspecialesRegAdhesion) {
		getFondosEspecialesRegAdhesions().remove(fondosEspecialesRegAdhesion);
		fondosEspecialesRegAdhesion.setInsumosRegistroAdhesion(null);

		return fondosEspecialesRegAdhesion;
	}

	public RegistroAdhesion getRegistroAdhesion() {
		return this.registroAdhesion;
	}

	public void setRegistroAdhesion(RegistroAdhesion registroAdhesion) {
		this.registroAdhesion = registroAdhesion;
	}

	public List<ProgramasSocResponsablePro> getProgramasSocResponsablePros() {
		return this.programasSocResponsablePros;
	}

	public void setProgramasSocResponsablePros(List<ProgramasSocResponsablePro> programasSocResponsablePros) {
		this.programasSocResponsablePros = programasSocResponsablePros;
	}

	public ProgramasSocResponsablePro addProgramasSocResponsablePro(ProgramasSocResponsablePro programasSocResponsablePro) {
		getProgramasSocResponsablePros().add(programasSocResponsablePro);
		programasSocResponsablePro.setInsumosRegistroAdhesion(this);

		return programasSocResponsablePro;
	}

	public ProgramasSocResponsablePro removeProgramasSocResponsablePro(ProgramasSocResponsablePro programasSocResponsablePro) {
		getProgramasSocResponsablePros().remove(programasSocResponsablePro);
		programasSocResponsablePro.setInsumosRegistroAdhesion(null);

		return programasSocResponsablePro;
	}

	public List<ProgramaConsultaProSisi> getProgramaConsultaProSisis() {
		return this.programaConsultaProSisis;
	}

	public void setProgramaConsultaProSisis(List<ProgramaConsultaProSisi> programaConsultaProSisis) {
		this.programaConsultaProSisis = programaConsultaProSisis;
	}

	public ProgramaConsultaProSisi addProgramaConsultaProSisi(ProgramaConsultaProSisi programaConsultaProSisi) {
		getProgramaConsultaProSisis().add(programaConsultaProSisi);
		programaConsultaProSisi.setInsumosRegistroAdhesion(this);

		return programaConsultaProSisi;
	}

	public ProgramaConsultaProSisi removeProgramaConsultaProSisi(ProgramaConsultaProSisi programaConsultaProSisi) {
		getProgramaConsultaProSisis().remove(programaConsultaProSisi);
		programaConsultaProSisi.setInsumosRegistroAdhesion(null);

		return programaConsultaProSisi;
	}

	public List<ProgramaCuap> getProgramaCuaps() {
		return this.programaCuaps;
	}

	public void setProgramaCuaps(List<ProgramaCuap> programaCuaps) {
		this.programaCuaps = programaCuaps;
	}

	public ProgramaCuap addProgramaCuap(ProgramaCuap programaCuap) {
		getProgramaCuaps().add(programaCuap);
		programaCuap.setInsumosRegistroAdhesion(this);

		return programaCuap;
	}

	public ProgramaCuap removeProgramaCuap(ProgramaCuap programaCuap) {
		getProgramaCuaps().remove(programaCuap);
		programaCuap.setInsumosRegistroAdhesion(null);

		return programaCuap;
	}

	public List<ProgramaInfAportaraSisi> getProgramaInfAportaraSisis() {
		return this.programaInfAportaraSisis;
	}

	public void setProgramaInfAportaraSisis(List<ProgramaInfAportaraSisi> programaInfAportaraSisis) {
		this.programaInfAportaraSisis = programaInfAportaraSisis;
	}

	public ProgramaInfAportaraSisi addProgramaInfAportaraSisi(ProgramaInfAportaraSisi programaInfAportaraSisi) {
		getProgramaInfAportaraSisis().add(programaInfAportaraSisi);
		programaInfAportaraSisi.setInsumosRegistroAdhesion(this);

		return programaInfAportaraSisi;
	}

	public ProgramaInfAportaraSisi removeProgramaInfAportaraSisi(ProgramaInfAportaraSisi programaInfAportaraSisi) {
		getProgramaInfAportaraSisis().remove(programaInfAportaraSisi);
		programaInfAportaraSisi.setInsumosRegistroAdhesion(null);

		return programaInfAportaraSisi;
	}

	public List<UaSinPrograma> getUaSinProgramas() {
		return this.uaSinProgramas;
	}

	public void setUaSinProgramas(List<UaSinPrograma> uaSinProgramas) {
		this.uaSinProgramas = uaSinProgramas;
	}

	public UaSinPrograma addUaSinPrograma(UaSinPrograma uaSinPrograma) {
		getUaSinProgramas().add(uaSinPrograma);
		uaSinPrograma.setInsumosRegistroAdhesion(this);

		return uaSinPrograma;
	}

	public UaSinPrograma removeUaSinPrograma(UaSinPrograma uaSinPrograma) {
		getUaSinProgramas().remove(uaSinPrograma);
		uaSinPrograma.setInsumosRegistroAdhesion(null);

		return uaSinPrograma;
	}

}