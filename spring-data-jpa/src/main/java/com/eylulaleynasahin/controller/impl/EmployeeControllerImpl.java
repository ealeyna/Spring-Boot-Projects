package com.eylulaleynasahin.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eylulaleynasahin.controller.IEmployeeController;
import com.eylulaleynasahin.dto.DtoEmployee;
import com.eylulaleynasahin.services.IEmployeeService;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController{

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping(path = "/list")
	@Override
	public List<DtoEmployee> findAllEmployees(Long id) {
		return employeeService.findAllEmployees(id);
	}
}
