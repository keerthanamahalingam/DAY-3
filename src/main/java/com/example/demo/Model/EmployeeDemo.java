package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeDemo")
public class EmployeeDemo {
	@Id
	@Column(name="eid")
	private int eid;
	@Column(name="employeeName")
	private String employeeName;
	@Column(name="employeeAge")
	private int employeeAge;
	@Column(name="esalary")
	private long esalary;
	
		public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public long getEsalary() {
		return esalary;
	}
	public void setEsalary(long esalary) {
		this.esalary = esalary;
	}
	
	public EmployeeDemo(int eid, String employeeName ,int employeeAge , long esalary
			) {
		super();
		this.eid = eid;
		this.employeeName = employeeName;
		this.employeeAge= employeeAge;
		this.esalary= esalary;
	}
public EmployeeDemo() {
		
	}

	}
