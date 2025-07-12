package com.eylulaleynasahin.service;

import com.eylulaleynasahin.dto.DtoEmployee;

public interface IEmployeeService {
	
	public DtoEmployee findEmployeeById(Long id);
}
