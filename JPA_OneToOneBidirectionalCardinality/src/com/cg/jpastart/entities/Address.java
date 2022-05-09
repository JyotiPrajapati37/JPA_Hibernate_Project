package com.cg.jpastart.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address") // Optional
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

//	addressId
	@Id
	@Column(name = "ADDRESS_ID") // Optional
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

//	street
	@Column(name = "ADDRESS_STREET") // Optional
	private String street;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

//	city
	@Column(name = "ADDRESS_CITY") // Optional
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

//	state
	@Column(name = "ADDRESS_STATE") // Optional
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

//	zipCode
	@Column(name = "ADDRESS_ZIPCODE") // Optional
	private String zipCode;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

//	Student
	// to create bi-directional relationship, use one to one with mappedBy
	// mappedBy attribute indicates property name of owner i.e. Student class
	@OneToOne(mappedBy = "address")//current table
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}