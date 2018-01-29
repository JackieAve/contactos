package com.its.dto;

public class UserDto {
	
	 private Integer userId;
     private String name;
     private String lastname1;
     private String lastname2;
     private int estatus;
     private String celular;
     private String direccion;
     private String departamento;
     private String extencion;
     private String tipoUsuario;
	
     public UserDto(Integer userId, String name, String lastname1, String lastname2, int estatus, String celular,
			String direccion, String departamento, String extencion, String tipoUsuario) {
		super();
		this.userId = userId;
		this.name = name;
		this.lastname1 = lastname1;
		this.lastname2 = lastname2;
		this.estatus = estatus;
		this.celular = celular;
		this.direccion = direccion;
		this.departamento = departamento;
		this.extencion = extencion;
		this.tipoUsuario = tipoUsuario;
	}

	public UserDto() {
		
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname1() {
		return lastname1;
	}

	public void setLastname1(String lastname1) {
		this.lastname1 = lastname1;
	}

	public String getLastname2() {
		return lastname2;
	}

	public void setLastname2(String lastname2) {
		this.lastname2 = lastname2;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getExtencion() {
		return extencion;
	}

	public void setExtencion(String extencion) {
		this.extencion = extencion;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", name=" + name + ", lastname1=" + lastname1 + ", lastname2=" + lastname2
				+ ", estatus=" + estatus + ", celular=" + celular + ", direccion=" + direccion + ", departamento="
				+ departamento + ", extencion=" + extencion + ", tipoUsuario=" + tipoUsuario + "]";
	}
     
	
	
     
     
     
     
}
