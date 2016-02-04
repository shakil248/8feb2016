package com.sogeti.upm.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="ADDRESS")
public class Address {
	
	@Id
    @Column(name="address_Id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   
	private String addressId;
	
	private int houseNo;
	private String street;
	private String city;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name="state_Id")
	private States states;
	
	private String country;
	
	 @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	 @JoinColumn(name="login_Id")
	 private User user;
	
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public States getStates() {
		return states;
	}
	public void setStates(States states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "city"+city;
	}
}
