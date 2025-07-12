package com.eylulaleynasahin.services;

import java.util.List;

import com.eylulaleynasahin.dto.DtoEmployee;

public interface IEmployeeService {

	public List<DtoEmployee> findAllEmployees(Long id);
}
