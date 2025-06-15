package com.deliveryrh.deliveryrh.featureContract.services;

import java.util.List;

import com.deliveryrh.deliveryrh.featureContract.models.Contract;

public interface ContractService {
    Contract save(Contract contract);
    List<Contract> fetchContractList();
    Contract updateContract(Contract contract, Long contractId);
    void deleteContractById(Long contractId);
}
