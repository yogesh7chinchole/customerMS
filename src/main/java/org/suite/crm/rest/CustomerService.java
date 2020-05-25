package org.suite.crm.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer")
public class CustomerService {

	@RequestMapping(value = "/get/{customerId}", method = RequestMethod.GET)
	public String getOrderDetails(@PathVariable("customerId") String id)
	{
		
		try
		{
			System.out.println("Thread Sleeping ...customer "+ id);
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
		}
		
		return "Customer: "+ id;
	}
	
}
