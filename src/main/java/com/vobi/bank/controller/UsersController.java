package com.vobi.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vobi.bank.domain.Users;
import com.vobi.bank.dto.UserDTO;
import com.vobi.bank.mapper.UserMapper;
import com.vobi.bank.service.UsersService;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	@Autowired
	UserMapper userMapper;
	
	@GetMapping
	public List<UserDTO> findAll() throws Exception{
		List<Users> users = usersService.findAll();
		List<UserDTO> userDTOs = userMapper.usersListTouserDTOList(users);
		
		return userDTOs;
	}

}
