package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the COLABORADOR_SISI database table.
 * 
 */
@Entity
@Table(name="COLABORADOR_SISI")
@NamedQuery(name="ColaboradorSisi.findAll", query="SELECT c FROM ColaboradorSisi c")
public class ColaboradorSisi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COLABORADOR_SISI_CSCCOLABORADORSISI_GENERATOR", sequenceName="SEQ_CSC_COLABORADOR_SISI",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COLABORADOR_SISI_CSCCOLABORADORSISI_GENERATOR")
	@Column(name="CSC_COLABORADOR_SISI")
	private long cscColaboradorSisi;

	//bi-directional many-to-one association to CNombreColaborador
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CSC_NOMBRE_COLABORADOR_FK")
	private CNombreColaborador cNombreColaborador;

	//bi-directional many-to-one association to CTipoColaborador
	@ManyToOne
	@JoinColumn(name="CSC_TIPO_COLABORADOR_FK")
	private CTipoColaborador cTipoColaborador;

	//bi-directional many-to-one association to CUbicacionGeografica
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CSC_UBICACION_GEOGRAFICA_FK")
	private CUbicacionGeografica cUbicacionGeografica;

	//bi-directional many-to-one association to Convenio
	@OneToMany(mappedBy="colaboradorSisi")
	private List<Convenio> convenios;

	public ColaboradorSisi() {
	}

	public long getCscColaboradorSisi() {
		return this.cscColaboradorSisi;
	}

	public void setCscColaboradorSisi(long cscColaboradorSisi) {
		this.cscColaboradorSisi = cscColaboradorSisi;
	}

	public CNombreColaborador getcNombreColaborador() {
		return cNombreColaborador;
	}

	public void setcNombreColaborador(CNombreColaborador cNombreColaborador) {
		this.cNombreColaborador = cNombreColaborador;
	}

	public CTipoColaborador getcTipoColaborador() {
		return cTipoColaborador;
	}

	public void setcTipoColaborador(CTipoColaborador cTipoColaborador) {
		this.cTipoColaborador = cTipoColaborador;
	}

	public CUbicacionGeografica getcUbicacionGeografica() {
		return cUbicacionGeografica;
	}

	public void setcUbicacionGeografica(CUbicacionGeografica cUbicacionGeografica) {
		this.cUbicacionGeografica = cUbicacionGeografica;
	}

	public List<Convenio> getConvenios() {
		return this.convenios;
	}

	public void setConvenios(List<Convenio> convenios) {
		this.convenios = convenios;
	}

	public Convenio addConvenio(Convenio convenio) {
		getConvenios().add(convenio);
		convenio.setColaboradorSisi(this);

		return convenio;
	}

	public Convenio removeConvenio(Convenio convenio) {
		getConvenios().remove(convenio);
		convenio.setColaboradorSisi(null);

		return convenio;
	}
	
}