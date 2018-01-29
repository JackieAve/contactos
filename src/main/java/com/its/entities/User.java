package com.its.entities;

import java.util.HashSet;
import java.util.Set;


public class User  implements java.io.Serializable {


     private Integer userId;
     private String name;
     private String lastname1;
     private String lastname2;
     private int estatus;
     private Set<Depart> departs = new HashSet(0);
     private Set<Ref> refs = new HashSet(0);
     private Set<Rol> rols = new HashSet(0);

    public User() {
    }

	
    public User(String name, String lastname1, String lastname2, int estatus) {
        this.name = name;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.estatus = estatus;
    }
    public User(String name, String lastname1, String lastname2, int estatus, Set departs, Set refs, Set rols) {
       this.name = name;
       this.lastname1 = lastname1;
       this.lastname2 = lastname2;
       this.estatus = estatus;
       this.departs = departs;
       this.refs = refs;
       this.rols = rols;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname1() {
        return this.lastname1;
    }
    
    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }
    public String getLastname2() {
        return this.lastname2;
    }
    
    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }
    public int getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
    public Set<Depart> getDeparts() {
        return this.departs;
    }
    
    public void setDeparts(Set<Depart> departs) {
        this.departs = departs;
    }
    public Set<Ref> getRefs() {
        return this.refs;
    }
    
    public void setRefs(Set<Ref> refs) {
        this.refs = refs;
    }
    public Set<Rol> getRols() {
        return this.rols;
    }
    
    public void setRols(Set<Rol> rols) {
        this.rols = rols;
    }


	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", lastname1=" + lastname1 + ", lastname2=" + lastname2
				+ ", estatus=" + estatus + ", departs=" + departs.size() + ", refs=" + refs.size() + ", rols=" + rols.size() + "]";
	}





}


