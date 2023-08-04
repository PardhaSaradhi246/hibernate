package com.pardha.HybernateDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person
{
@Id
	private int sn;
	
	@Column(name="name")
	private String Personname;
	@Column(name="age")
	private int personage;
	@Column(name="gender")
	private char gender;
	@OneToOne
	@JoinColumn(name="address_id")
	Address address;
	public Person() {
		super();
	}
	public Person(int sn, String personname, int personage, char gender, Address address) {
		super();
		this.sn = sn;
		Personname = personname;
		this.personage = personage;
		this.gender = gender;
		this.address = address;
	}
	public int getsn() {
		return sn;
	}
	public void setsn(int sn) {
		this.sn = sn;
	}
	public String getPersonname() {
		return Personname;
	}
	public void setPersonname(String personname) {
		Personname = personname;
	}
	public int getPersonage() {
		return personage;
	}
	public void setPersonage(int personage) {
		this.personage = personage;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
