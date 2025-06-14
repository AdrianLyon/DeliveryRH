package com.deliveryrh.deliveryrh.featureContract.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliveryrh.deliveryrh.featureContract.models.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

}
