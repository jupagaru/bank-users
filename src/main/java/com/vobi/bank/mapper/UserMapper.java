package com.vobi.bank.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.vobi.bank.domain.Users;
import com.vobi.bank.dto.UserDTO;

@Mapper
public interface UserMapper {

	@Mapping(source = "userType.ustyId" , target = "ustyId")
	public UserDTO userstoUserDTO(Users users);
	
	public List<UserDTO> usersListTouserDTOList(List<Users> users);
}
