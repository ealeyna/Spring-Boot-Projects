package com.eylulaleynasahin.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eylulaleynasahin.controller.IRestEmployeeController;
import com.eylulaleynasahin.dto.DtoEmployee;
import com.eylulaleynasahin.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class RestEmployeeControllerImpl implements IRestEmployeeController{

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/{id}")
	@Override
	public DtoEmployee findEmployeeById(@PathVariable(value = "id") Long id) {
		return employeeService.findEmployeeById(id);
	}
}
