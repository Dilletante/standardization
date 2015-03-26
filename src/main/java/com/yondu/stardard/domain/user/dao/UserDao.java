package com.yondu.stardard.domain.user.dao;

import java.util.List;

import com.yondu.stardard.domain.user.User;

public interface UserDao {
	
	public User create(User user);
	
	public User update(User user);
	
	public User getUser(String userId);
	
	public List<User> getAllUsers();
	
//	public List<User> getAllUsersBy();
	
	public Boolean delete(String userId);
}
