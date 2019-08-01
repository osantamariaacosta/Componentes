package com.cenfotec.distribuidora.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TEmployee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="lastname")
	private String lastname;
	@Column(name="type")
	private String type;
	@Column(name="id_delear")
	private int idDelear;
	
	public Employee(String name, String lastname, String type, int idDelear) {
		this.name = name; 
		this.lastname = lastname; 
		this.type = type;
		this.idDelear = idDelear;
	}
	
	public Employee(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	

	public int getIdDelear() {
		return idDelear;
	}

	public void setIdDelear(int idDelear) {
		this.idDelear = idDelear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
