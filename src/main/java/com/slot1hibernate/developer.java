package com.slot1hibernate;
//manytomany
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class developer {

	@Id
	private int devId;
	private String devName;
	private String devProject;
	@ManyToMany(targetEntity=laptop.class)
	@JoinTable(
			name="devlap",
			joinColumns= {@JoinColumn(name="devId")},
			inverseJoinColumns= {@JoinColumn(name="lapId")}
			)
	private List<laptop> devLap;
	public int getDevId() {
		return devId;
	}
	public void setDevId(int devId) {
		this.devId = devId;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevProject() {
		return devProject;
	}
	public void setDevProject(String devProject) {
		this.devProject = devProject;
	}
	public List<laptop> getDevLap() {
		return devLap;
	}
	public void setDevLap(List<laptop> devLap) {
		this.devLap = devLap;
	}
	@Override
	public String toString() {
		return "developer [devId=" + devId + ", devName=" + devName + ", devProject=" + devProject + ", devLap="
				+ devLap + "]";
	}
	
}
