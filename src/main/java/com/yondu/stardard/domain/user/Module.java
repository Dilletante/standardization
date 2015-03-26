package com.yondu.stardard.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="modules_tb")
public class Module {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@ManyToMany
	@Column(name="role_id")
	private Integer roleId;
	
	@Column(name="module", nullable = false)
	private String module;

	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Module(Integer roleId, String module) {
		super();
		this.roleId = roleId;
		this.module = module;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
}
