package com.its.entities;


public class Ref implements java.io.Serializable {

	private Integer refId;
	private User user;
	private String celular;
	private String direccion;

	public Ref() {
	}

	public Ref(User user, String celular, String direccion) {
		this.user = user;
		this.celular = celular;
		this.direccion = direccion;
	}

	public Integer getRefId() {
		return this.refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Ref [refId=" + refId + ", user=" + user + ", celular=" + celular + ", direccion=" + direccion + "]";
	}
	

}
