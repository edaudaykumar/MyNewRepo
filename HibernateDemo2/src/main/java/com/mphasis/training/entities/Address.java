package com.mphasis.training.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Address {

	
	@Id
	@Column(name = "id")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String street;
	
	//@OneToOne(mappedBy = "address")
	
	@OneToOne
	@MapsId
	private Employee employee;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", employee=" + employee + "]";
	}

	public Address(int id, String street, Employee employee) {
		super();
		this.id = id;
		this.street = street;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
