package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the OBJETIVOS_ESPECIFICOS database table.
 * 
 */
@Entity
@Table(name="OBJETIVOS_ESPECIFICOS")
@NamedQuery(name="ObjetivosEspecifico.findAll", query="SELECT o FROM ObjetivosEspecifico o")
public class ObjetivosEspecifico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OBJETIVOS_ESPECIFICOS_CSCOBJETIVOSESP_GENERATOR", sequenceName="SEQ_CSC_OBJETIVOS_ESP")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OBJETIVOS_ESPECIFICOS_CSCOBJETIVOSESP_GENERATOR")
	@Column(name="CSC_OBJETIVOS_ESP")
	private long cscObjetivosEsp;

	@Column(name="OBJ_ESP_PROG")
	private String objEspProg;

	//bi-directional many-to-one association to NormatividadPrograma
	@ManyToOne
	@JoinColumn(name="CSC_NORMATIVIDAD_PRO_FK")
	private NormatividadPrograma normatividadPrograma;

	public ObjetivosEspecifico() {
	}

	public long getCscObjetivosEsp() {
		return this.cscObjetivosEsp;
	}

	public void setCscObjetivosEsp(long cscObjetivosEsp) {
		this.cscObjetivosEsp = cscObjetivosEsp;
	}

	public String getObjEspProg() {
		return this.objEspProg;
	}

	public void setObjEspProg(String objEspProg) {
		this.objEspProg = objEspProg;
	}

	public NormatividadPrograma getNormatividadPrograma() {
		return this.normatividadPrograma;
	}

	public void setNormatividadPrograma(NormatividadPrograma normatividadPrograma) {
		this.normatividadPrograma = normatividadPrograma;
	}

}