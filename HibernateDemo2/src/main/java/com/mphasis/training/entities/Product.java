package com.mphasis.training.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="prod_seq")
	@SequenceGenerator(sequenceName = "product_seq",allocationSize= 1,name="prod_seq")
	private int prid;
	
	private String pname;
	
	@ManyToOne
	@JoinColumn(name="oid")
	private Orders ord = new Orders();
	
	@OneToOne(mappedBy = "product")
	private Person person;
}
