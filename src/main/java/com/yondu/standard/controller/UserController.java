package com.yondu.standard.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yondu.stardard.domain.user.User;
import com.yondu.stardard.domain.user.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/create", method=RequestMethod.PUT)
	@ResponseBody
	public User create(@RequestParam Map<String, Object> map){
		
		User user = userService.create(map);
		
		return user; 
	}
}
