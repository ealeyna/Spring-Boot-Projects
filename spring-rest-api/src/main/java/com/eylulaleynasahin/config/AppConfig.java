package com.eylulaleynasahin.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eylulaleynasahin.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1", "Eylül", "Şahin"));
		employeeList.add(new Employee("2", "Gizem", "Karal"));
		employeeList.add(new Employee("3", "Almina", "Ertan"));
		employeeList.add(new Employee("4", "İlayda", "Şahiner"));
		employeeList.add(new Employee("5", "Eylül", "Ertan"));

		return employeeList;
	}
}
