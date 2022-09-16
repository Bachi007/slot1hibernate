package com.slot1hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {

	@Id
	private int empId;
	private String empName;
	private String empPassword;
	private String empDomain;
	private int empSalary;
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
	
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public String getEmpDomain() {
		return empDomain;
	}
	public void setEmpDomain(String empDomain) {
		this.empDomain = empDomain;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empDomain=" + empDomain + ", empSalary="
				+ empSalary + "]";
	}
	
	
}
