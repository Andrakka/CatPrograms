package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the OBJETO database table.
 * 
 */
@Entity
@NamedQuery(name="Objeto.findAll", query="SELECT o FROM Objeto o")
public class Objeto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OBJETO_CSCOBJETO_GENERATOR", sequenceName="SEQ_CSC_OBJETO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OBJETO_CSCOBJETO_GENERATOR")
	@Column(name="CSC_OBJETO")
	private long cscObjeto;

	@Column(name="CHR_DESCRIPCION")
	private String chrDescripcion;

	//bi-directional many-to-one association to Bitacora
	@OneToMany(mappedBy="objeto")
	private List<Bitacora> bitacoras;

	public Objeto() {
	}

	public long getCscObjeto() {
		return this.cscObjeto;
	}

	public void setCscObjeto(long cscObjeto) {
		this.cscObjeto = cscObjeto;
	}

	public String getChrDescripcion() {
		return this.chrDescripcion;
	}

	public void setChrDescripcion(String chrDescripcion) {
		this.chrDescripcion = chrDescripcion;
	}

	public List<Bitacora> getBitacoras() {
		return this.bitacoras;
	}

	public void setBitacoras(List<Bitacora> bitacoras) {
		this.bitacoras = bitacoras;
	}

	public Bitacora addBitacora(Bitacora bitacora) {
		getBitacoras().add(bitacora);
		bitacora.setObjeto(this);

		return bitacora;
	}

	public Bitacora removeBitacora(Bitacora bitacora) {
		getBitacoras().remove(bitacora);
		bitacora.setObjeto(null);

		return bitacora;
	}

}