package com.digi.microserviceusermanagement.service;

import java.util.List;

public interface BaseService<T>{
    void save(T t);
    T findById(Long id);
    void update(T t);
    void delete(Long id);
    List<T> findAll();
}
