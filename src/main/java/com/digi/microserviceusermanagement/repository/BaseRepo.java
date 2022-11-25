package com.digi.microserviceusermanagement.repository;

import java.util.List;

public interface BaseRepo<T> {
    void save(T t);
    T findById(Long id);
    void update(T t);
    void delete(Long id);
    List<T> findAll();
}
