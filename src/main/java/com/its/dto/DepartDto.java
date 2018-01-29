package com.its.dto;

public class DepartDto {
	private Integer depId;
	private String departamento;
	
	public DepartDto(Integer depId, String departamento) {
		this.depId = depId;
		this.departamento = departamento;
	}
	
	public DepartDto() {
		
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "DepartDto [depId=" + depId + ", departamento=" + departamento + "]";
	}
	
	
}
