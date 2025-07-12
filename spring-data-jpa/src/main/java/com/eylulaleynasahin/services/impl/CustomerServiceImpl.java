package com.eylulaleynasahin.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eylulaleynasahin.dto.DtoAddress;
import com.eylulaleynasahin.dto.DtoCustomer;
import com.eylulaleynasahin.entities.Address;
import com.eylulaleynasahin.entities.Customer;
import com.eylulaleynasahin.repository.CustomerRepository;
import com.eylulaleynasahin.services.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public DtoCustomer findCustomerById(Long id) {
		
		DtoCustomer dtoCustomer = new DtoCustomer(); 
		DtoAddress dtoAddress = new DtoAddress(); 

		Optional<Customer> optional = customerRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		
		Customer customer = optional.get(); 
		Address address = optional.get().getAddress();
		
		BeanUtils.copyProperties(customer, dtoCustomer); 
		BeanUtils.copyProperties(address, dtoAddress); 
		
		dtoCustomer.setAddress(dtoAddress);
		return dtoCustomer;
	}
}
