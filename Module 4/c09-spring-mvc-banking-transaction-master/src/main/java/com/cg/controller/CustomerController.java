package com.cg.controller;


import com.cg.model.Customer;
import com.cg.model.Deposit;
import com.cg.model.Transfer;
import com.cg.model.Withdraw;
import com.cg.service.CustomerService;
import com.cg.service.IDepositService;
import com.cg.service.ITransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private IDepositService depositService;

    @Autowired
    private ITransferService transferService;

    @GetMapping
    public ModelAndView showListPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/list");
        List<Customer> customers = customerService.findAllNotDeleted();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

// Get Method

    //Get create Customer
    @GetMapping("/create")
    public ModelAndView showCreatePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    //Get deposit
    @GetMapping("/deposit/{id}")
    public ModelAndView showDepositPage(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/deposit");
        Optional<Customer> customer = customerService.findById(id);
        modelAndView.addObject("customer", customer.get());
        modelAndView.addObject("deposit", new Deposit());
        return modelAndView;
    }

    //Get withdraw
    @GetMapping("/withdraw/{id}")
    public ModelAndView showWithdrawPage(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/withdraw");
        Optional<Customer> customer = customerService.findById(id);
        modelAndView.addObject("customer", customer.get());
        modelAndView.addObject("withdraw", new Withdraw());
        return modelAndView;
    }


    //Get transfer
    @GetMapping("/transfer/{customerId}")
    public ModelAndView showPageTransfer(@PathVariable Long customerId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/transfer");
        Optional<Customer> sender = customerService.findById(customerId);
        if (sender.isPresent()) {
            List<Customer> recipients = customerService.findAllByIdNotAndDeletedIsFalse(customerId);
            modelAndView.addObject("sender", sender.get());
            modelAndView.addObject("recipients", recipients);
        } else {
            modelAndView.addObject("sender", new Customer());
        }
        modelAndView.addObject("transfer", new Transfer());
        return modelAndView;
    }

    //Get delete
    @GetMapping("/delete/{customerId}")
    public ModelAndView showPageDelete(@PathVariable Long customerId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/customer/delete");
        Optional<Customer> customer = customerService.findById(customerId);
        if (customer.isPresent()) {
            modelAndView.addObject("customer", customer.get());
        } else {
            modelAndView.addObject("customer", null);
        }
        return modelAndView;
    }

    //Get update
    @GetMapping("/update/{customerId}")
    public ModelAndView showPageUpdate(@PathVariable Long customerId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/customer/edit");
        Optional<Customer> customer = customerService.findById(customerId);
        if (customer.isPresent()) {
            modelAndView.addObject("customer", customer.get());
        } else {
            modelAndView.addObject("customer", null);
        }
        return modelAndView;
    }

//Post method

    //Post create Customer
    @PostMapping("/create")
    public ModelAndView doCreate(@ModelAttribute Customer customer) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/create");
        modelAndView.addObject("customer", new Customer());
        customerService.save(customer);
        return modelAndView;
    }

    //Post deposit
    @PostMapping("/deposit/{customerId}")
    public ModelAndView doDeposit(@PathVariable Long customerId, @ModelAttribute Deposit deposit) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/deposit");
        customerService.increment(customerId, deposit);
        Optional<Customer> customer = customerService.findById(customerId);
        if (customer.isPresent()) {
            modelAndView.addObject("customer", customer.get());
        } else
            modelAndView.addObject("customer", null);
        return modelAndView;
    }

    //Post withdraw
    @PostMapping("/withdraw/{customerId}")
    public ModelAndView doWithdraw(@PathVariable Long customerId, @ModelAttribute Withdraw withdraw) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/withdraw");
        modelAndView.addObject("withdraw", new Withdraw());

        Optional<Customer> customer = customerService.findById(customerId);
        if (customer.isPresent()) {
            BigDecimal currentBalance = customer.get().getBalance();
            BigDecimal transactionAmount = withdraw.getTransactionAmount();

            if (currentBalance.compareTo(transactionAmount) >= 0) {
                customerService.reduceBalance(customerId, withdraw);
            }

            modelAndView.addObject("customer", customerService.findById(customerId).get());

        } else
            modelAndView.addObject("customer", null);
        return modelAndView;
    }

    //Post transfer
    @PostMapping("/transfer/{customerId}")
    public ModelAndView doTransfer(@PathVariable Long customerId, @ModelAttribute Transfer transfer) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/transfer");
        modelAndView.addObject("transfer", new Transfer());
        Optional<Customer> customer = customerService.findById(customerId);

        if (customer.isPresent()) {
            BigDecimal currentBalance = customer.get().getBalance();
            int fees = 10;
            BigDecimal transfer_amount = transfer.getTransferAmount();
            BigDecimal fees_amount = transfer_amount.multiply(BigDecimal.valueOf(10L)).divide(BigDecimal.valueOf(100L));
            BigDecimal transaction_amount = transfer_amount.add(fees_amount);
            if (currentBalance.compareTo(transaction_amount) >= 0) {
                customerService.incrementTranfer(transfer.getRecipient().getId(), transfer);
                customerService.reduceTransfer(customerId, transfer);
                transfer.setFees(fees);
                transfer.setFeesAmount(fees_amount);
                transfer.setTransactionAmount(transaction_amount);
                transfer.setSender(customer.get());
                transferService.save(transfer);
            }
            List<Customer> recipients = customerService.findAllByIdNot(customerId);
            modelAndView.addObject("recipients", recipients);
            modelAndView.addObject("sender", customerService.findById(customerId).get());
        } else {
            modelAndView.addObject("sender", new Customer());
        }
        return modelAndView;
    }

    //Post delete
    @PostMapping("/delete/{customerId}")
    public ModelAndView doDelete(@PathVariable Long customerId, @ModelAttribute Customer customer) {
        customerService.deleteCustomer(customerId);
        return new ModelAndView("redirect:/customers");
    }

    //Post update
    @PostMapping("/update/{customerId}")
    public ModelAndView doUpdate(@PathVariable Long customerId, @ModelAttribute Customer customer) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/edit");
        if (customerService.existsByEmail(customer.getEmail())) {
            return new ModelAndView("redirect:/customer/errorEmail");
        } else {
            customer.setId(customerId);
            modelAndView.addObject("customer", customerService.save(customer));
            return modelAndView;
        }
    }
}
