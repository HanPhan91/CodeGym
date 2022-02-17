package com.cg.service;

import com.cg.model.Customer;
import com.cg.model.Deposit;
import com.cg.model.Transfer;
import com.cg.model.Withdraw;
import com.cg.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private IDepositService depositService;

    @Autowired
    private IWithdrawService withdrawService;

    @Autowired
    private ITransferService transferService;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.getById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
//        Customer customer = customerRepository.getById(id);
//        customerRepository.delete(customer);
    }

    @Override
    public void increment(Long customerId, Deposit deposit) {
        customerRepository.incrementBalance(deposit.getTransactionAmount(), customerId);
        depositService.save(deposit);
    }

    @Override
    public void reduceBalance(Long customerId, Withdraw withdraw) {
        customerRepository.reduceBalance(withdraw.getTransactionAmount(), customerId);
        withdrawService.save(withdraw);
    }

    @Override
    public void incrementTranfer(Long customerId, Transfer transfer) {
        customerRepository.incrementBalance(transfer.getTransferAmount(), customerId);
    }

    @Override
    public void reduceTransfer(Long customerId, Transfer transfer) {
        customerRepository.reduceBalance(transfer.getTransactionAmount(), customerId);
    }

    @Override
    public List<Customer> findAllByIdNot(Long id) {
        return customerRepository.findAllByIdNot(id);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteCustomer(id);
    }

    @Override
    public List<Customer> findAllNotDeleted() {
        return customerRepository.findAllNotDeleted();
    }

    @Override
    public Boolean existsByEmail(String email) {
        return customerRepository.existsByEmail(email);
    }

    @Override
    public List<Customer> findAllByIdNotAndDeletedIsFalse(Long id) {
        return customerRepository.findAllByIdNotAndDeletedIsFalse(id);
    }
}
