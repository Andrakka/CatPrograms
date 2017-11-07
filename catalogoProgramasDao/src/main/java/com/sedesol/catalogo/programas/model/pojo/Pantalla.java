package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PANTALLAS database table.
 * 
 */
@Entity
@Table(name="PANTALLAS")
@NamedQuery(name="Pantalla.findAll", query="SELECT p FROM Pantalla p")
public class Pantalla implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PANTALLAS_CSCPANTALLA_GENERATOR", sequenceName="SEQ_CSC_PANTALLA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PANTALLAS_CSCPANTALLA_GENERATOR")
	@Column(name="CSC_PANTALLA")
	private long cscPantalla;

	@Column(name="CHR_NOMBRE")
	private String chrNombre;

	//bi-directional many-to-one association to Bitacora
	@OneToMany(mappedBy="pantalla")
	private List<Bitacora> bitacoras;

	public Pantalla() {
	}

	public long getCscPantalla() {
		return this.cscPantalla;
	}

	public void setCscPantalla(long cscPantalla) {
		this.cscPantalla = cscPantalla;
	}

	public String getChrNombre() {
		return this.chrNombre;
	}

	public void setChrNombre(String chrNombre) {
		this.chrNombre = chrNombre;
	}

	public List<Bitacora> getBitacoras() {
		return this.bitacoras;
	}

	public void setBitacoras(List<Bitacora> bitacoras) {
		this.bitacoras = bitacoras;
	}

	public Bitacora addBitacora(Bitacora bitacora) {
		getBitacoras().add(bitacora);
		bitacora.setPantalla(this);

		return bitacora;
	}

	public Bitacora removeBitacora(Bitacora bitacora) {
		getBitacoras().remove(bitacora);
		bitacora.setPantalla(null);

		return bitacora;
	}

}