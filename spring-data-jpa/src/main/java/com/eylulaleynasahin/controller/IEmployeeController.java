package com.eylulaleynasahin.controller;

import java.util.List;

import com.eylulaleynasahin.dto.DtoEmployee;

public interface IEmployeeController {

	public List<DtoEmployee> findAllEmployees(Long id);

}
