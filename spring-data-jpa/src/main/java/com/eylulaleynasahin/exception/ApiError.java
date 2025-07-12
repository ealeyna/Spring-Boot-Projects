package com.eylulaleynasahin.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter&setter demek
@NoArgsConstructor
@AllArgsConstructor
public class ApiError<T> {

	private String id;
	private Date errorTime;
	private T errors; 
}
