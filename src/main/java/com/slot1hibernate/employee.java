package com.slot1hibernate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name="emp_table")
public class employee {

	@Id
	
	private int empId;
	private employeeName empName;
	private String empRole;
	
	@Transient
	private int empSalary;
	
	
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public employeeName getEmpName() {
		return empName;
	}
	public void setEmpName(employeeName empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", empSalary=" + empSalary
				+ "]";
	}
	
		
}
