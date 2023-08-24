package com.cos.rtspTest.model;
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
 
	int idx; 
	String username; 
	String password;
	
}
