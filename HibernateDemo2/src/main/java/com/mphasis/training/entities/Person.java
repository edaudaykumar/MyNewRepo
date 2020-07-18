package com.mphasis.training.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="per_seq")
	@SequenceGenerator(sequenceName = "person_seq",allocationSize= 1,name="per_seq")
	private int pid;
	private String name;

	@OneToMany(mappedBy = "per",fetch = FetchType.EAGER)
	private List<Orders> orders = new ArrayList<>();
	
	@ElementCollection
	@CollectionTable(name = "per_email", joinColumns = @JoinColumn(name="perid"))
	private Set<String> email = new HashSet<>();
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="per_add", joinColumns = {
          @JoinColumn(name="per_id", referencedColumnName = "pid")
  },
  inverseJoinColumns = {
          @JoinColumn(name="prod_id",referencedColumnName = "prid" )
  })
	private Product product;
	
	
	
}
