package com.pe.web.employee.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_type_employee")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TypeEmployee {

	@Id
	@Column(name="cod_type_employee")
	private Integer codTypeEmployee;
	
	private String description;
	
}
