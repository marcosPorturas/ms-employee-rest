package com.pe.web.employee.app.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_employee")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codEmployee;
	
	private LocalDateTime creationDate;
	
	private String names;
	
	private String lastNameFather;
	
	private String lastNameMother;
	
	@ManyToOne
	@JoinColumn(name="cod_type_employee",referencedColumnName="cod_type_employee")
	private TypeEmployee typeEmployee;
	
	private String usuarioValue;
	
	private String passwordValue;
	
}
