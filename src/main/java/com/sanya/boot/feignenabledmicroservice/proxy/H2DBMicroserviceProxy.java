/**
 * 
 */
package com.sanya.boot.feignenabledmicroservice.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sanya.boot.feignenabledmicroservice.entity.Employee;

/**
 * @author Sanya_s
 *
 */
@FeignClient(name="h2db-microservice")
public interface H2DBMicroserviceProxy {
	
	@GetMapping("/employees")
	public List<Employee> getEmployee();

	@PostMapping("/employees/add")
	public String addEmployee(@RequestBody() final Employee employee);
}
