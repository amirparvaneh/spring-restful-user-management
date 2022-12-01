package com.digi.microserviceusermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepo<T> extends JpaRepository<T,Long> {
}
