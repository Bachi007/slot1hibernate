package com.slot1hibernate;
//onetomany
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity


public class student {

	@Id
	private int stId;
	private String stName;
	private String stGroup;
	@OneToMany
	@JoinColumn(name="stId")
	private List<bike> stBike;
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
	public List<bike> getStBike() {
		return stBike;
	}
	public void setStBike(List<bike> stBike) {
		this.stBike = stBike;
	}
	@Override
	public String toString() {
		return "student [stId=" + stId + ", stName=" + stName + ", stGroup=" + stGroup + ", stBike=" + stBike + "]";
	}
	
	
}
