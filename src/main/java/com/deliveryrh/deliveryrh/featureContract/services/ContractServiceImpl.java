package com.deliveryrh.deliveryrh.featureContract.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.deliveryrh.deliveryrh.featureContract.models.Contract;
import com.deliveryrh.deliveryrh.featureContract.repositories.ContractRepository;

public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;

    @Override
    public Contract save(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public List<Contract> fetchContractList() {
        return contractRepository.findAll();
    }

    @Override
    public Contract updateContract(Contract contract, Long contractId) {
        Contract contractEntity = contractRepository.findById(contractId).get();

        if (Objects.nonNull(contract.getInitialDate()) && !"".equals(contract.getInitialDate())){
            contractEntity.setInitialDate(contract.getInitialDate());
        }
        if (Objects.nonNull(contract.getEndDate())){
            contractEntity.setEndDate(contract.getEndDate());
        }
        if (Objects.nonNull(contract.getType()) && !"".equals(contract.getType())){
            contractEntity.setType(contract.getType());
        }
        if (Objects.nonNull(contract.getEmployee()) && !"".equals(contract.getEmployee())){
            contractEntity.setEmployee(contract.getEmployee());
        }

        return contractRepository.save(contractEntity);
    }

    @Override
    public void deleteContractById(Long contractId) {
        contractRepository.deleteById(contractId);
    }
}
