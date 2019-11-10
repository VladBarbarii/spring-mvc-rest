package com.vlad.springrestwebservice.springmvcrest.services;

import com.vlad.springrestwebservice.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById (Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
