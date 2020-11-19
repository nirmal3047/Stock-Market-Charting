package com.nirmal.user.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -2731425678149216053L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="user_name")
	private String userName;

	private String password;
	
	@Column(name="is_admin")
	private boolean isAdmin;
	
	private String  email;
	private String mobile;
	private boolean confirmed;
	
	protected UserEntity() {}
	
	public UserEntity(int id, String userName, String password, boolean isAdmin, String email, String mobile,
			boolean confirmed) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
		this.email = email;
		this.mobile = mobile;
		this.confirmed = confirmed;
	}
	
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	
}
