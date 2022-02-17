package com.codegym.service;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();
    void save(T t);
}
