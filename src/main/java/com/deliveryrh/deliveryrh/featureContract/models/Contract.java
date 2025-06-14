package com.deliveryrh.deliveryrh.featureContract.models;

import java.time.LocalDate;

import com.deliveryrh.deliveryrh.featureContract.enums.TypeContract;
import com.deliveryrh.deliveryrh.featureEmployee.models.Employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "contracts")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TypeContract type;

    @Column(name = "initialDate", nullable = false)
    @NotNull(message = "Initial date cannot be null")
    private LocalDate initialDate;

    @Column(name = "endDate", nullable = false)
    @NotNull(message = "End date cannot be null")
    private LocalDate endDate;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Contract (){}
    
    public Contract(Long id, TypeContract type, @NotNull(message = "Initial date cannot be null") LocalDate initialDate,
            @NotNull(message = "End date cannot be null") LocalDate endDate, Employee employee) {
        this.id = id;
        this.type = type;
        this.initialDate = initialDate;
        this.endDate = endDate;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeContract getType() {
        return type;
    }

    public void setType(TypeContract type) {
        this.type = type;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    } 
}
