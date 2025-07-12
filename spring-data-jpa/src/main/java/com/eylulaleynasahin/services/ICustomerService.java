package com.eylulaleynasahin.services;

import com.eylulaleynasahin.dto.DtoCustomer;

public interface ICustomerService {

	public DtoCustomer findCustomerById(Long id);
}
