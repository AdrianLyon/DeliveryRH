package com.deliveryrh.deliveryrh.featureEmployee.services;

import java.util.List;

import com.deliveryrh.deliveryrh.featureEmployee.models.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> fetchEmployeeList();
    Employee updateEmployee(Employee employee, Long employeeId);
    void deleteEmployeeById(Long employeeId);
}
