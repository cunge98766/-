package com.example.demo.controller;

import com.example.demo.domain.UserDTO;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/lpy/user")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;


	@GetMapping(value = "/userList")
	@ResponseBody
	public List<UserDTO> getUserList() {
		return userService.getUserList();
	}



}
