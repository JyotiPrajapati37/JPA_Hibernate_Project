package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



//import javax.annotation.processing.Generated;

@Entity

//This annotation must be written only on parent class
@Table(name = "emp_store")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name = "emp_type", discriminatorType = DiscriminatorType.STRING)

@DiscriminatorValue(value = "Emp")

public class Employee implements Serializable {
	private static final long serialVersionUID = 1l;
	
//EmployeeId
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO) // AutoIncrement
	private int employeeId;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
//name
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//salary
	private  double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
