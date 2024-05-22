package com.app.small_finance.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class UserDto {

	private UUID userId;
	private String userName;
	private String password;
	private String phoneNo;

}
