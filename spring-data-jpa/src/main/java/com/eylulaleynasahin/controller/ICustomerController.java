package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoCustomer;

public interface ICustomerController {

	public DtoCustomer findCustomerById(Long id); 
}
