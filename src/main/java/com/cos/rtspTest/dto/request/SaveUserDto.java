package com.cos.rtspTest.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SaveUserDto {
	String username;
	String password; 
}
