package com.its.entities;


import java.util.HashSet;
import java.util.Set;

public class Rol  implements java.io.Serializable {


     private Integer rolId;
     private String nbRol;
     private Set<User> users = new HashSet(0);

    public Rol() {
    }

	
    public Rol(String nbRol) {
        this.nbRol = nbRol;
    }
    public Rol(String nbRol, Set users) {
       this.nbRol = nbRol;
       this.users = users;
    }
   
    public Integer getRolId() {
        return this.rolId;
    }
    
    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }
    public String getNbRol() {
        return this.nbRol;
    }
    
    public void setNbRol(String nbRol) {
        this.nbRol = nbRol;
    }
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }


	@Override
	public String toString() {
		return "Rol [rolId=" + rolId + ", nbRol=" + nbRol + ", users=" + users + "]";
	}




}


