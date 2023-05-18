package com.cico.restController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cico.model.Student;
import com.cico.requestDto.JwtRequestDto;
import com.cico.responseDto.ApiResponseDto;
import com.cico.service.IStudentService;
import com.cico.utils.JwtUtil;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private IStudentService studentService;

	@PostMapping("/login")
	public ResponseEntity<ApiResponseDto> loginStudent(@RequestBody JwtRequestDto dto){
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getUserId(),dto.getPassword()));
		String token = jwtUtil.generateToken(dto.getUserId());
		ApiResponseDto response = new ApiResponseDto(200, "success", token);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/getCurrentStudent")
	public ResponseEntity<ApiResponseDto> getCurrentStudent(@RequestParam("token") String token){
		System.out.println(new Date());
		Student student = studentService.getCurrentStudent(jwtUtil.getUsername(token));
		ApiResponseDto response = new ApiResponseDto(200, "success", student);
		return ResponseEntity.ok(response);
	}
}
