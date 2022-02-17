package com.cg.service.customer;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public class CustomerServiceImpl implements ICustomerService {
    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Optional findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
