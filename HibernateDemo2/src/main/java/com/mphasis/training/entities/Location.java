package com.mphasis.training.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Location {

	@Id
	private String lcode;
	@Column(length = 10,unique = true)
	private String lname;
	
	@OneToMany(mappedBy = "loc",fetch = FetchType.EAGER)
	private List<Department> deps = new ArrayList<>();
	
	@Transient
	private int pincode;
	
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Location(String lcode, String lname) {
		super();
		this.lcode = lcode;
		this.lname = lname;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Location [lcode=" + lcode + ", lname=" + lname + "]";
	}
	
}
