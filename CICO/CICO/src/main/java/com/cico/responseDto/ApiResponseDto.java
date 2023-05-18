package com.cico.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponseDto {

	private Integer statusCode;
	
	private String status;
	
	private Object response;
}
