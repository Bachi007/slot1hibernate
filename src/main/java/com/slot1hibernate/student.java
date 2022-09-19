package com.slot1hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class student {

	@Id
	private int stId;
	private String stName;
	private String stGroup;
	@OneToOne
	private bike stBike;
	
	
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStGroup() {
		return stGroup;
	}
	public void setStGroup(String stGroup) {
		this.stGroup = stGroup;
	}
	public bike getStBike() {
		return stBike;
	}
	public void setStBike(bike stBike) {
		this.stBike = stBike;
	}
	
	
}
