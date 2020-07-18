package com.mphasis.training.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="ord_seq")
	@SequenceGenerator(sequenceName = "order_seq",allocationSize= 1,name="ord_seq")
	private int orderid;
	
	@ManyToOne
	@JoinColumn(name="pid")
	private Person per = new Person();
	
	@OneToMany(mappedBy = "ord")
	private List<Product> orders = new ArrayList<>();
}
