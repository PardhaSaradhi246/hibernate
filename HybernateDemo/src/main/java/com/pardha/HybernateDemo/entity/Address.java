package com.pardha.HybernateDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Address
{
@Id
	
	@Column(name="addres_id")
	private int addresId;
	@Column(name="hno")
	private String hono;
	@Column(name="street")
	private String streetName;
	@Column(name="city")
	private String cityName;
	@Column(name="state")
	private String stateName;
	@OneToOne(mappedBy="address")
	Person person;
	public Address() {
		super();
	}

	public Address(int addressId, String hno, String streetName, String cityName, String stateName) {
		super();
		this.addresId = addresId;
		this.hono = hno;
		this.streetName = streetName;
		this.cityName = cityName;
		this.stateName = stateName;
	}

	public int getAddresId() {
		return addresId;
	}

	public void setAddresId(int addresId) {
		this.addresId = addresId;
	}

	public String getHno() {
		return hono;
	}

	public void setHno(String hno) {
		this.hono = hno;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
}
