package com.yondu.stardard.domain.user.service;

import java.util.Map;

import com.yondu.stardard.domain.user.User;

public interface UserService {
	
	public User create(Map<String, Object> user);
	
}
