package com.jpa.entities;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

@DiscriminatorValue(value ="MGR")
public class Manager extends Employee {
	
	private static final long serialVersionUID =1l;

	//departmentName
	private String departmentName;
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	

}
