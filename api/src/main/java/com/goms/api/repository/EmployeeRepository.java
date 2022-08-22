package com.goms.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.goms.api.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}