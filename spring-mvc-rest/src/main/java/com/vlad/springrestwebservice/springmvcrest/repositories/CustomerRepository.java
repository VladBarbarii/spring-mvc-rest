package com.vlad.springrestwebservice.springmvcrest.repositories;

import com.vlad.springrestwebservice.springmvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
