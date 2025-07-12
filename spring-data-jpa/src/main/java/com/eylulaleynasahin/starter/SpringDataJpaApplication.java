package com.eylulaleynasahin.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.eylulaleynasahin.configuration.GlobalProperties;

@SpringBootApplication
@EntityScan(basePackages = {"com.eylulaleynasahin"})
@ComponentScan(basePackages = {"com.eylulaleynasahin"})
@EnableJpaRepositories(basePackages = {"com.eylulaleynasahin"})
@EnableConfigurationProperties(value = GlobalProperties.class)
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
	

}
