package com.cos.rtspTest.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UpdateUserDto {

	int idx;
	String username;
	String password; 
	
}
