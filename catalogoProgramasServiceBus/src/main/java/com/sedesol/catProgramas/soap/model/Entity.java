package com.sedesol.catProgramas.soap.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Entity {
    private String name;
    private String status;
    private StringBuffer datosJson;
    private StringBuffer mensajeJson;

    public Entity(String name) {
        this.name = name;
    }

    public Entity() {}
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public StringBuffer getDatosJson() {
		return datosJson;
	}

	public void setDatosJson(StringBuffer datosJson) {
		this.datosJson = datosJson;
	}

	public StringBuffer getMensajeJson() {
		return mensajeJson;
	}

	public void setMensajeJson(StringBuffer mensajeJson) {
		this.mensajeJson = mensajeJson;
	}

}