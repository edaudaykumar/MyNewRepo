package com.mphasis.training.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Department {

	@Id
	private int deptcode;
	@Column(length = 12)
	private String dname;
	
	@ManyToOne
	@JoinColumn(name="lcode")
	private Location loc = new Location();

	public int getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public Department(int deptcode, String dname, Location loc) {
		super();
		this.deptcode = deptcode;
		this.dname = dname;
		this.loc = loc;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [deptcode=" + deptcode + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
}
