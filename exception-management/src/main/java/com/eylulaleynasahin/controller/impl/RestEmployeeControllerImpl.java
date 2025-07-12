package com.eylulaleynasahin.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eylulaleynasahin.controller.RestEmployeeController;
import com.eylulaleynasahin.dto.DtoEmployee;
import com.eylulaleynasahin.model.RootEntity;
import com.eylulaleynasahin.service.IEmployeeService;

@RestController
@RequestMapping("rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController{

	@Autowired
	private IEmployeeService employeeService;

	@GetMapping("/list/{id}")
	@Override
	public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
		return ok(employeeService.findEmployeeById(id));
	}
}


