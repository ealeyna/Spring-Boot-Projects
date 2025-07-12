package com.eylulaleynasahin.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eylulaleynasahin.dto.DtoDepartment;
import com.eylulaleynasahin.dto.DtoEmployee;
import com.eylulaleynasahin.entities.Employee;
import com.eylulaleynasahin.repository.EmployeeRepository;
import com.eylulaleynasahin.services.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<DtoEmployee> findAllEmployees(Long id) {
		List<DtoEmployee> dtoEmployeeList = new ArrayList<>();
		List<Employee> employeeList = employeeRepository.findAll();
		if(employeeList!=null && !employeeList.isEmpty()) {
			for (Employee employee : employeeList) {
				DtoEmployee dtoEmployee = new DtoEmployee();
				BeanUtils.copyProperties(employee, dtoEmployee);
				
				dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),
						employee.getDepartment().getDepartment_name()));
				
				dtoEmployeeList.add(dtoEmployee);
			}
		}
		return dtoEmployeeList;
	}
}

