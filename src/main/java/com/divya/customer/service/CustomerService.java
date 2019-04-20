package com.divya.customer.service;

import org.springframework.data.repository.CrudRepository;

import com.divya.customer.entity.Customer;

public interface CustomerService extends CrudRepository<Customer, Integer>{

}
