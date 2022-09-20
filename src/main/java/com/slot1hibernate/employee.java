package com.slot1hibernate;
//manytoone
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
public class employee {

	@Id
	
	private int empId;
	private String empName;
	private String empRole;
	@ManyToOne
	private address empaddress;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public address getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(address empaddress) {
		this.empaddress = empaddress;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", empaddress="
				+ empaddress + "]";
	}	
		
}
