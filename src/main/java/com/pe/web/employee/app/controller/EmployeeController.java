package com.pe.web.employee.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.web.employee.app.dto.response.EmployeeResponse;
import com.pe.web.employee.app.service.EmployeeService;

import io.reactivex.Single;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/all")
	public Single<List<EmployeeResponse>> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/{codEmployee}")
	public Single<EmployeeResponse> getEmployeeResponse(@PathVariable("codEmployee")Integer codEmployee){
		return employeeService.getEmployeeResponse(codEmployee);
	}
	
}
