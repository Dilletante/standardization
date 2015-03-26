package com.yondu.stardard.domain.user.dao;

import java.util.List;

import com.yondu.stardard.domain.user.Role;

public interface RoleDao {

	public Role create(Role role);
	
	public Role update(Role role);
	
	public Role getRole(Long id);
	
	public List<Role> getRoles();
	
//	public List<Role> getRolesBy();
	
	public Boolean delete(Long id);	
}
