package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the C_TIPO_COLABORADOR database table.
 * 
 */
@Entity
@Table(name="C_TIPO_COLABORADOR")
@NamedQuery(name="CTipoColaborador.findAll", query="SELECT c FROM CTipoColaborador c")
public class CTipoColaborador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="C_TIPO_COLABORADOR_CSCTIPOCOLABORADOR_GENERATOR", sequenceName="SEQ_CSC_TIPO_COLABORADOR", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="C_TIPO_COLABORADOR_CSCTIPOCOLABORADOR_GENERATOR")
	@Column(name="CSC_TIPO_COLABORADOR")
	private long cscTipoColaborador;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	@Column(name="SN_ACTIVO")
	private BigDecimal snActivo;

	//bi-directional many-to-one association to ColaboradorSisi
	/*@OneToMany(mappedBy="CTipoColaborador")
	private List<ColaboradorSisi> colaboradorSisis;*/

	public CTipoColaborador() {
	}

	public long getCscTipoColaborador() {
		return this.cscTipoColaborador;
	}

	public void setCscTipoColaborador(long cscTipoColaborador) {
		this.cscTipoColaborador = cscTipoColaborador;
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
	
	/*public List<ColaboradorSisi> getColaboradorSisis() {
		return this.colaboradorSisis;
	}

	public void setColaboradorSisis(List<ColaboradorSisi> colaboradorSisis) {
		this.colaboradorSisis = colaboradorSisis;
	}

	public ColaboradorSisi addColaboradorSisi(ColaboradorSisi colaboradorSisi) {
		getColaboradorSisis().add(colaboradorSisi);
		colaboradorSisi.setcTipoColaborador(this);

		return colaboradorSisi;
	}

	public ColaboradorSisi removeColaboradorSisi(ColaboradorSisi colaboradorSisi) {
		getColaboradorSisis().remove(colaboradorSisi);
		colaboradorSisi.setcTipoColaborador(null);

		return colaboradorSisi;
	}*/
}