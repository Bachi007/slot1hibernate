package com.slot1hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class emp {

	@Id
	private int eId;
	private String eName;
	private String eCity;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteCity() {
		return eCity;
	}
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	
	
}
