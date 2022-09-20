package com.slot1hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class laptop {

	@Id
	private int lapId;
	private String lapName;
	@ManyToMany
	private List<developer> lapdev;
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	public String getLapName() {
		return lapName;
	}
	public void setLapName(String lapName) {
		this.lapName = lapName;
	}
	public List<developer> getLapdev() {
		return lapdev;
	}
	public void setLapdev(List<developer> lapdev) {
		this.lapdev = lapdev;
	}
	@Override
	public String toString() {
		return "laptop [lapId=" + lapId + ", lapName=" + lapName + ", lapdev=" + lapdev + "]";
	}
	
	
}
