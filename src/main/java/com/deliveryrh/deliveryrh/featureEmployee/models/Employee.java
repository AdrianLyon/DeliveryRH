package com.deliveryrh.deliveryrh.featureEmployee.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullName", nullable = false)
    @NotNull(message = "fullName cannot be null")
    private String fullName;

    @Column(name = "rfc", nullable = false, length = 13)
    @NotNull(message = "RFC cannot be null")
    @Pattern(regexp = "[A-Z&Ñ]{3,4}[0-9]{6}[A-Z0-9]{3}", message = "Invalid RFC format")
    private String rfc;

    @Column(name = "curp", nullable = false, length = 18)
    @NotNull(message = "CURP cannot be null")
    @Pattern(regexp = "[A-Z][AEIOU][A-Z]{2}\\d{6}[HM][A-Z]{5}[A-Z0-9]{2}", message = "Invalid CURP format")
    private String curp;

    @Column(name = "nss", nullable = false, length = 13)
    @NotNull(message = "NSS cannot be null")
    private String nss;

    @Column(name = "salary", nullable = false)
    @NotNull(message = "Salary cannot be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Salary must be greater than zero")
    private Double salary;

    @Column(name = "hireDate", nullable = false)
    @NotNull(message = "Hire date cannot be null")
    private LocalDate hireDate;

    @Column(name = "department", nullable = false)
    @NotNull(message = "department date cannot be null")
    private String department;

    @Column(name = "job", nullable = false)
    @NotNull(message = "Job date cannot be null")
    private String job;

    public Employee(){}

    public Employee(Long id, @NotNull(message = "fullName cannot be null") String fullName,
            @NotNull(message = "RFC cannot be null") @Pattern(regexp = "[A-Z&Ñ]{3,4}[0-9]{6}[A-Z0-9]{3}", message = "Invalid RFC format") String rfc,
            @NotNull(message = "CURP cannot be null") @Pattern(regexp = "[A-Z][AEIOU][A-Z]{2}\\d{6}[HM][A-Z]{5}[A-Z0-9]{2}", message = "Invalid CURP format") String curp,
            @NotNull(message = "NSS cannot be null") String nss,
            @NotNull(message = "Salary cannot be null") @DecimalMin(value = "0.0", inclusive = false, message = "Salary must be greater than zero") Double salary,
            @NotNull(message = "Hire date cannot be null") LocalDate hireDate,
            @NotNull(message = "department date cannot be null") String department,
            @NotNull(message = "Job date cannot be null") String job) {
        this.id = id;
        this.fullName = fullName;
        this.rfc = rfc;
        this.curp = curp;
        this.nss = nss;
        this.salary = salary;
        this.hireDate = hireDate;
        this.department = department;
        this.job = job;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    
}
