package com.eylulaleynasahin.exception;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	private List<String> addMapValue(List<String> list, String newValue){
		list.add(newValue);
		return list;
	}
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<ApiError> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		// ex.getBindingResult().getAllErrors() //butun hata mesajlari burada
		Map<String, List<String>> errorsMap = new HashMap<>();
		
		for (ObjectError objError : ex.getBindingResult().getAllErrors()) {
			String fieldName = ((FieldError)objError).getField(); //hangi field'da hata oldugunu gosterir
			if(errorsMap.containsKey(fieldName)) {
				errorsMap.put(fieldName, addMapValue(errorsMap.get(fieldName),  objError.getDefaultMessage()));
			}else {
				errorsMap.put(fieldName, addMapValue(new ArrayList<>(), objError.getDefaultMessage()));

			}
		}
		return ResponseEntity.badRequest().body(createApiError(errorsMap)); 
	}
	
	private <T> ApiError<T> createApiError(T errors) { 
		ApiError<T> apiError = new ApiError<T>();
		apiError.setId(UUID.randomUUID().toString());
		apiError.setErrorTime(new Date());
		apiError.setErrors(errors);
		return apiError;
	}
}
