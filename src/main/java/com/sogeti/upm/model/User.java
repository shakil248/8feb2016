package com.sogeti.upm.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
    @Column(name="login_Id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String loginId;
	@Column(name="user_Name")
	private String userName;
	@Column(name="email_Id")
	private String emailId;
	@Column(name="password")
	private String password;
//	@Target(JdbcBlob.class)
//	private JdbcBlob image ;
	
//	@OneToOne(fetch = FetchType.EAGER, mappedBy = "USER", cascade = CascadeType.PERSIST)
//	@Column(name="addressId")
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Address address;
	
//	@OneToOne(fetch = FetchType.LAZY, mappedBy = "USER", cascade = CascadeType.ALL)
//	private Address address;
	
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	public JdbcBlob getImage() {
//		return image;
//	}
//	public void setImage(JdbcBlob image) {
//		this.image = image;
//	}
	
	
//	public Address getAddress() {
//		return address;
//	}
//	
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	
	@Override
	public String toString() {
		return "UserName "+userName+" email "+emailId+" loginId "+loginId;
	}

}
