package com.yondu.stardard.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue
	@Column(name="username")
	String userId;
	
	@Column(name="password")
	String password;
		
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="roleId", nullable = false)
	private Role roles;
	
	public User() {
		super();
	}

	public User(String userId, String password, Role roles) {
		super();
		this.userId = userId;
		this.password = password;
		this.roles = roles;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRoles() {
		return roles;
	}
	
	public void setRoles(Role roles) {
		this.roles = roles;
	}
}
