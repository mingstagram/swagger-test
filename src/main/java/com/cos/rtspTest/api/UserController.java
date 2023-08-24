package com.cos.rtspTest.api;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.rtspTest.dto.DefaultResponse;
import com.cos.rtspTest.dto.request.SaveUserDto;
import com.cos.rtspTest.dto.request.UpdateUserDto;
import com.cos.rtspTest.model.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "user-controller", description = "유저 API")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

	@GetMapping("/user/{idx}")
	@Operation(summary = "사용자 조회", description = "사용자의 정보를 조회한다.") 
	@ApiResponses({ 
		@ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = User.class))),
		@ApiResponse(responseCode = "400", description = "BAD REQUEST"),
		@ApiResponse(responseCode = "404", description = "NOT FOUND"),
		@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR") 
	})
	public DefaultResponse userInfo(@PathVariable int idx) {
		User userEntity = new User(idx, "cos", "1234");
		return new DefaultResponse(userEntity);
	}

	@GetMapping("/users")
	@Operation(summary = "전체 사용자 조회", description = "전체 사용자의 정보를 조회한다.")
	public DefaultResponse usersInfo() {
		User user1 = new User(1, "mini1", "1234");
		User user2 = new User(2, "mini2", "1234");
		List<User> userList = new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		return new DefaultResponse(userList);
	}

	@Operation(summary = "사용자 저장", description = "사용자 정보를 저장한다.")
	@PostMapping("/user")
	public DefaultResponse saveUser(@RequestBody SaveUserDto userDto) {
		return new DefaultResponse();
	}

	@PutMapping("/user")
	@Operation(summary = "사용자 정보 수정", description = "사용자 정보를 수정한다.")
	public DefaultResponse updateUser(@RequestBody UpdateUserDto userDto) {
		return new DefaultResponse();
	}

	@DeleteMapping("/user/{idx}")
	@Operation(summary = "사용자 삭제", description = "사용자 정보를 삭제한다.")
	public DefaultResponse deleteUser(@PathVariable @Valid int idx) {
		System.out.println("deleteUser >>>  " + idx);
		return new DefaultResponse();
	}

}
