package com.its.dto;

public class RolDto {
	
	private Integer rolId;
	private String nbRol;
	
	
	public RolDto() {
		super();
	}

	public RolDto(Integer rolId, String nbRol) {
	
		this.rolId = rolId;
		this.nbRol = nbRol;
	}

	public Integer getRolId() {
		return rolId;
	}

	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	public String getNbRol() {
		return nbRol;
	}

	public void setNbRol(String nbRol) {
		this.nbRol = nbRol;
	}

	@Override
	public String toString() {
		return "RolDto [rolId=" + rolId + ", nbRol=" + nbRol + "]";
	}
	

}
