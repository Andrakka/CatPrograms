package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sedesol.catalogo.programas.model.serializer.JsonDateDeserializer;
import com.sedesol.catalogo.programas.model.serializer.JsonDateSerializer;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the VIGENCIA_CONVENIO database table.
 * 
 */
@Entity
@Table(name="VIGENCIA_CONVENIO")
@NamedQuery(name="VigenciaConvenio.findAll", query="SELECT v FROM VigenciaConvenio v")
public class VigenciaConvenio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="VIGENCIA_CONVENIO_CSCVIGENCIACONVENIO_GENERATOR", sequenceName="SEQ_CSC_VIGENCIA_CONVENIO",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VIGENCIA_CONVENIO_CSCVIGENCIACONVENIO_GENERATOR")
	@Column(name="CSC_VIGENCIA_CONVENIO")
	private long cscVigenciaConvenio;

	@Temporal(TemporalType.DATE)
	@Column(name="FCH_FINAL")
	private Date fchFinal;

	@Temporal(TemporalType.DATE)
	@Column(name="FCH_INICIAL")
	private Date fchInicial;

	

	
	public VigenciaConvenio() {
	}

	public long getCscVigenciaConvenio() {
		return this.cscVigenciaConvenio;
	}

	public void setCscVigenciaConvenio(long cscVigenciaConvenio) {
		this.cscVigenciaConvenio = cscVigenciaConvenio;
	}
	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getFchFinal() {
		return this.fchFinal;
	}

	@JsonDeserialize(using = JsonDateDeserializer.class)
	public void setFchFinal(Date fchFinal) {
		this.fchFinal = fchFinal;
	}
	
	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getFchInicial() {
		return this.fchInicial;
	}

	@JsonDeserialize(using = JsonDateDeserializer.class)
	public void setFchInicial(Date fchInicial) {
		this.fchInicial = fchInicial;
	}


}