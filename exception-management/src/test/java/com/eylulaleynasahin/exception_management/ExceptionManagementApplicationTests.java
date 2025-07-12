package com.eylulaleynasahin.exception_management;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.eylulaleynasahin.dto.DtoEmployee;
import com.eylulaleynasahin.service.IEmployeeService;
import com.eylulaleynasahin.starter.ExceptionManagementStarter;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("beforeEach çalıştı...");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("afterEach çalıştı...");
	}
	
	@Test
	public void testFindEmployeeById() {
		DtoEmployee employee = employeeService.findEmployeeById(4L);
		assertNotNull(employee);
	}
}
