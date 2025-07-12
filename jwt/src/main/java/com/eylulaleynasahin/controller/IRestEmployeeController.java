package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoEmployee;

public interface IRestEmployeeController {
	
	public DtoEmployee findEmployeeById(Long id);
}
