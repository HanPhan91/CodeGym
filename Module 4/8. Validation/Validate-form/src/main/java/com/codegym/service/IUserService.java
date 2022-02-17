package com.codegym.service;

import com.codegym.model.User;
import com.codegym.repository.IUserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService extends IGeneralService<User> {
    boolean existsByEmail(String email);
    boolean existsByPhoneNumber(String phone);
}
