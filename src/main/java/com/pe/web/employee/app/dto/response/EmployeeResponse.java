package com.pe.web.employee.app.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
	
	private Integer codEmployee;
	private String names;
	private String lastNameFather;
	private String lastNameMother;
	private EmployeeInfo employeeInfo;
	

}
