package com.sedesol.catalogo.programas.model.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AUTORIZACION database table.
 * 
 */
@Entity
@NamedQuery(name="Autorizacion.findAll", query="SELECT a FROM Autorizacion a")
public class Autorizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AUTORIZACION_CSCAUTORIZACION_GENERATOR", sequenceName="SEQ_CSC_AUTORIZACION")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AUTORIZACION_CSCAUTORIZACION_GENERATOR")
	@Column(name="CSC_AUTORIZACION")
	private long cscAutorizacion;

	@Lob
	@Column(name="BLOB_CERTIFICADO_AUT")
	private byte[] blobCertificadoAut;

	@Lob
	@Column(name="BLOB_LLAVE_PRIVADA_AUT")
	private byte[] blobLlavePrivadaAut;

	@Column(name="CHR_CONTRASENIA_AUT")
	private String chrContraseniaAut;

	@Column(name="CHR_ESTATUS_AUT")
	private String chrEstatusAut;

	//bi-directional many-to-one association to CTipoAutorizador
	@ManyToOne
	@JoinColumn(name="CSC_TIPO_AUTORIZADOR_FK")
	private CTipoAutorizador CTipoAutorizador;

	//bi-directional many-to-one association to RegistroAdhesionAutorizacion
	@OneToMany(mappedBy="autorizacion")
	private List<RegistroAdhesionAutorizacion> registroAdhesionAutorizacions;

	public Autorizacion() {
	}

	public long getCscAutorizacion() {
		return this.cscAutorizacion;
	}

	public void setCscAutorizacion(long cscAutorizacion) {
		this.cscAutorizacion = cscAutorizacion;
	}

	public byte[] getBlobCertificadoAut() {
		return this.blobCertificadoAut;
	}

	public void setBlobCertificadoAut(byte[] blobCertificadoAut) {
		this.blobCertificadoAut = blobCertificadoAut;
	}

	public byte[] getBlobLlavePrivadaAut() {
		return this.blobLlavePrivadaAut;
	}

	public void setBlobLlavePrivadaAut(byte[] blobLlavePrivadaAut) {
		this.blobLlavePrivadaAut = blobLlavePrivadaAut;
	}

	public String getChrContraseniaAut() {
		return this.chrContraseniaAut;
	}

	public void setChrContraseniaAut(String chrContraseniaAut) {
		this.chrContraseniaAut = chrContraseniaAut;
	}

	public String getChrEstatusAut() {
		return this.chrEstatusAut;
	}

	public void setChrEstatusAut(String chrEstatusAut) {
		this.chrEstatusAut = chrEstatusAut;
	}

	public CTipoAutorizador getCTipoAutorizador() {
		return this.CTipoAutorizador;
	}

	public void setCTipoAutorizador(CTipoAutorizador CTipoAutorizador) {
		this.CTipoAutorizador = CTipoAutorizador;
	}

	public List<RegistroAdhesionAutorizacion> getRegistroAdhesionAutorizacions() {
		return this.registroAdhesionAutorizacions;
	}

	public void setRegistroAdhesionAutorizacions(List<RegistroAdhesionAutorizacion> registroAdhesionAutorizacions) {
		this.registroAdhesionAutorizacions = registroAdhesionAutorizacions;
	}

	public RegistroAdhesionAutorizacion addRegistroAdhesionAutorizacion(RegistroAdhesionAutorizacion registroAdhesionAutorizacion) {
		getRegistroAdhesionAutorizacions().add(registroAdhesionAutorizacion);
		registroAdhesionAutorizacion.setAutorizacion(this);

		return registroAdhesionAutorizacion;
	}

	public RegistroAdhesionAutorizacion removeRegistroAdhesionAutorizacion(RegistroAdhesionAutorizacion registroAdhesionAutorizacion) {
		getRegistroAdhesionAutorizacions().remove(registroAdhesionAutorizacion);
		registroAdhesionAutorizacion.setAutorizacion(null);

		return registroAdhesionAutorizacion;
	}

}