package com.eylulaleynasahin.repository;

import com.eylulaleynasahin.entities.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
