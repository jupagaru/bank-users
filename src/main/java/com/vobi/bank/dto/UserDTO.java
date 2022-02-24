package com.vobi.bank.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	@NotNull
	private Integer tranId;
	
	@NotNull
	private Integer ustyId;
	
	@NotNull
	private String userEmail;

	@NotNull
	private String enable;

	@NotNull
	private String name;
	
	@NotNull
	private String token;

}
