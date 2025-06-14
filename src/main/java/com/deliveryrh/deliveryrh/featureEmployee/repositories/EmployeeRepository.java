package com.deliveryrh.deliveryrh.featureEmployee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliveryrh.deliveryrh.featureEmployee.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
