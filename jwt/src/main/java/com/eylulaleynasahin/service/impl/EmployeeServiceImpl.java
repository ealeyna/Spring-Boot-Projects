package com.eylulaleynasahin.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eylulaleynasahin.dto.DtoDepartment;
import com.eylulaleynasahin.dto.DtoEmployee;
import com.eylulaleynasahin.model.Department;
import com.eylulaleynasahin.model.Employee;
import com.eylulaleynasahin.repository.EmployeeRepository;
import com.eylulaleynasahin.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository; 
	
	@Override
	public DtoEmployee findEmployeeById(Long id) {
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		Optional<Employee> optional = employeeRepository.findById(id);
		if(!optional.isPresent()) {
			return null;
		}
		Employee employee = optional.get();
		Department department = employee.getDeparment();
		BeanUtils.copyProperties(employee, dtoEmployee);
		BeanUtils.copyProperties(department, dtoDepartment);
		dtoEmployee.setDeparment(dtoDepartment);
		return dtoEmployee;
	}

}
