package com.divya.customer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.divya.customer.entity.Customer;
import com.divya.customer.service.CustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerApplicationTests {

	@Autowired
	CustomerService customer;
	
	@Test
	public void getCustomer() {
		System.out.println(customer.findById(1));
	}
	
	@Test
	public void addCustomer() {
		Customer cu = new Customer();
		cu.setId(2);
		cu.setCustomer_name("abcd");
		cu.setCustomer_email("abcd@gmail.com");
		
		customer.save(cu);
	}
	
	@Test
	public void deleteCustomer() {
		customer.deleteById(2);
	}

}
