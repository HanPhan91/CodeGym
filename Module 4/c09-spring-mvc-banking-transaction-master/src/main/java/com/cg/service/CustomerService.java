package com.cg.service;

import com.cg.model.Customer;
import com.cg.model.Deposit;
import com.cg.model.Transfer;
import com.cg.model.Withdraw;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerService extends IGeneralService<Customer> {
    void increment(Long customerId, Deposit deposit);

    void reduceBalance(Long customerId, Withdraw withdraw);

    void incrementTranfer(Long customerId, Transfer transfer);

    void reduceTransfer(Long customerId, Transfer transfer);

    List<Customer> findAllByIdNot(Long id);

    void deleteCustomer(@Param("id") Long id);

    List<Customer> findAllNotDeleted();

    Boolean existsByEmail(String email);

    List<Customer> findAllByIdNotAndDeletedIsFalse(Long id);
}
