package com.deliveryrh.deliveryrh.featureEmployee.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.deliveryrh.deliveryrh.featureEmployee.models.Employee;
import com.deliveryrh.deliveryrh.featureEmployee.repositories.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchEmployeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee, Long employeeId) {
        Employee employeeEntity = employeeRepository.findById(employeeId).get();

        if (Objects.nonNull(employee.getFullName()) && !"".equalsIgnoreCase(employee.getFullName())){
            employeeEntity.setFullName(employee.getFullName());
        }
        if (Objects.nonNull(employee.getCurp()) && !"".equalsIgnoreCase(employee.getCurp())){
            employeeEntity.setCurp(employee.getCurp());
        }
        if (Objects.nonNull(employee.getDepartment()) && !"".equalsIgnoreCase(employee.getDepartment())){
            employeeEntity.setDepartment(employee.getDepartment());
        }
        if (Objects.nonNull(employee.getJob()) && !"".equalsIgnoreCase(employee.getJob())){
            employeeEntity.setJob(employee.getJob());
        }
        if (Objects.nonNull(employee.getRfc()) && !"".equalsIgnoreCase(employee.getRfc())){
            employeeEntity.setRfc(employee.getRfc());
        }
        if (Objects.nonNull(employee.getNss()) && !"".equalsIgnoreCase(employee.getNss())){
            employeeEntity.setNss(employee.getNss());
        }
        if (Objects.nonNull(employee.getHireDate()) && !"".equals(employee.getHireDate())){
            employeeEntity.setHireDate(employee.getHireDate());
        }
        if (Objects.nonNull(employee.getSalary()) && !"".equals(employee.getSalary())){
            employeeEntity.setSalary(employee.getSalary());
        }
        if (Objects.nonNull(employee.getContract()) && !"".equals(employee.getContract())){
            employeeEntity.setContract(employee.getContract());
        }
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployeeById(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

}
