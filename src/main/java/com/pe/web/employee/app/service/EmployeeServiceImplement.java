package com.pe.web.employee.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.web.employee.app.builder.ConvertBuilderEmployee;
import com.pe.web.employee.app.dto.response.EmployeeResponse;
import com.pe.web.employee.app.entity.Employee;
import com.pe.web.employee.app.repository.EmployeeRepository;

import io.reactivex.Observable;
import io.reactivex.Single;


@Service
public class EmployeeServiceImplement implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeResponse invokeBuilderEmpleadoResponse(Employee employee) {
		ConvertBuilderEmployee convert = new ConvertBuilderEmployee();
		return convert.convertToEmployeeResponse(employee);
	}
	
	@Override
	public Single<List<EmployeeResponse>> getAllEmployee() {
		// TODO Auto-generated method stub
		return Observable.fromIterable(employeeRepository.findAll())
				.map(this::invokeBuilderEmpleadoResponse)
				.toList();
	}

	@Override
	public Single<EmployeeResponse> getEmployeeResponse(Integer codEmployee) {
		// TODO Auto-generated method stub
		return Single.just(employeeRepository.findById(codEmployee).orElse(null))
				.map(this::invokeBuilderEmpleadoResponse);
	}

}
