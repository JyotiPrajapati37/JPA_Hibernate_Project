package com.jpa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name ="emp")

//This annotation must be written only on parent class
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee implements Serializable {
	
	private static final long serialVersionUID=1l;
 
//	employeeId
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)// AutoIncrement
	private int employeeId;
 	public int getEmployeeId()
 	{
 		return employeeId;
 	}
 	public void setEmployeeid(int employeeId)
 	{
 		this.employeeId= employeeId;
 			
 	}
	
//	name
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	salary
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
