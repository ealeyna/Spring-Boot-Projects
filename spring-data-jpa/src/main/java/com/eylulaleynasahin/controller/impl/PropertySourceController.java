package com.eylulaleynasahin.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eylulaleynasahin.configuration.GlobalProperties;
import com.eylulaleynasahin.configuration.Server;

@RestController
@RequestMapping("rest/api/property")
public class PropertySourceController {

	@Autowired
	private GlobalProperties globalProperties;
	
	@GetMapping("/getServers")
	public List<Server> getServers(){
		System.out.println("Key value:" + globalProperties.getKey());
		return globalProperties.getServers();
	}
	
/*
	@Autowired
	private GlobalProperties globalProperties;
	
	@GetMapping("/datasource")
	public DataSource getDataSource() {
		DataSource dataSource = new DataSource();
		dataSource.setUrl(globalProperties.getUrl());
		dataSource.setUserName(globalProperties.getUsername());
		dataSource.setPassword(globalProperties.getPassword());
		return dataSource;
}*/	
	
	
	
	
}

