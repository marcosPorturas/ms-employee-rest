package com.pe.web.employee.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pe.web.employee.app.entity.Employee;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
