package com.cos.rtspTest.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.rtspTest.dto.DefaultResponse;
import com.cos.rtspTest.model.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "board", description = "게시물 API")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BoardController {

	@GetMapping("/board/{idx}")
	@Operation(summary = "게시물 조회", description = "게시물 정보를 조회한다.")
	public DefaultResponse boardInfo(@PathVariable int idx) {
		User userEntity = new User(idx, "cos", "1234");
		return new DefaultResponse(userEntity);
	}
	
}
