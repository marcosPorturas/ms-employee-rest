package com.pe.web.employee.app.service;

import java.util.List;

import com.pe.web.employee.app.dto.response.EmployeeResponse;

import io.reactivex.Single;

public interface EmployeeService {

	
	Single<List<EmployeeResponse>> getAllEmployee();
	
	Single<EmployeeResponse> getEmployeeResponse(Integer codEmployee);
	
}
