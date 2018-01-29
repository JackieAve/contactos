package com.its.entities;



import java.util.HashSet;
import java.util.Set;


public class Depart  implements java.io.Serializable {


     private Integer deptId;
     private String nbdepart;
     private String ext;
     private Set<User> users = new HashSet(0);

    public Depart() {
    }

	
    public Depart(String nbdepart, String ext) {
        this.nbdepart = nbdepart;
        this.ext = ext;
    }
    public Depart(String nbdepart, String ext, Set users) {
       this.nbdepart = nbdepart;
       this.ext = ext;
       this.users = users;
    }
   
    public Integer getDeptId() {
        return this.deptId;
    }
    
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
    public String getNbdepart() {
        return this.nbdepart;
    }
    
    public void setNbdepart(String nbdepart) {
        this.nbdepart = nbdepart;
    }
    public String getExt() {
        return this.ext;
    }
    
    public void setExt(String ext) {
        this.ext = ext;
    }
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }


	@Override
	public String toString() {
		return "Depart [deptId=" + deptId + ", nbdepart=" + nbdepart + ", ext=" + ext + ", users=" + users + "]";
	}




}


