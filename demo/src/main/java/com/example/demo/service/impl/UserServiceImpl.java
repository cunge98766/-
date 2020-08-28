package com.example.demo.service.impl;


import com.example.demo.domain.UserDTO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public List<UserDTO> getUserList(){
		return userMapper.userList();
	}
}

