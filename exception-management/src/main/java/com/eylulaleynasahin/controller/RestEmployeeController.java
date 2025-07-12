package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoEmployee;
import com.eylulaleynasahin.model.RootEntity;

public interface RestEmployeeController {

	public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
