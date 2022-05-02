package com.jpa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mgr")

public class Manager extends Employee{
	private static final long serialVersionUID=1l;
	
	
//	departmentName
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSalary(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
