/**
 * 
 */
package com.sanya.boot.feignenabledmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanya.boot.feignenabledmicroservice.entity.Employee;
import com.sanya.boot.feignenabledmicroservice.proxy.H2DBMicroserviceProxy;

/**
 * @author Sanya_s
 *
 */
@RestController
public class EmployeeConsumerController {

	@Autowired
	H2DBMicroserviceProxy h2dbMicroserviceProxy;
	
	@GetMapping("/feign/employees")
	public List<Employee> getEmployee(){
		return h2dbMicroserviceProxy.getEmployee();
	}
}
