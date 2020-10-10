package com.pe.web.employee.app.builder;

import com.pe.web.employee.app.dto.response.EmployeeInfo;
import com.pe.web.employee.app.dto.response.EmployeeResponse;
import com.pe.web.employee.app.entity.Employee;
import com.pe.web.employee.app.utilitario.Util;

public class ConvertBuilderEmployee {

	
	public EmployeeResponse convertToEmployeeResponse(Employee employee) {
		return EmployeeResponse.builder()
				.codEmployee(employee.getCodEmployee())
				.names(employee.getNames())
				.lastNameFather(employee.getLastNameFather())
				.lastNameMother(employee.getLastNameMother())
				.employeeInfo(convertToEmployeeInfo(employee))
				.build();
	}
	
	public EmployeeInfo convertToEmployeeInfo(Employee employee) {
		return EmployeeInfo.builder()
				.creationDate(Util.convertToStringDate(employee.getCreationDate()))
				.typeEmployee(employee.getTypeEmployee().getDescription())
				.userValue(employee.getUsuarioValue())
				.passwordValue(employee.getPasswordValue())
				.build();
	}
}
