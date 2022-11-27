package com.digi.microserviceusermanagement.service.user;

import com.digi.microserviceusermanagement.model.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public void save(Role role) {

    }

    @Override
    public Role findById(Long id) {
        return null;
    }

    @Override
    public void update(Role role) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Role> findAll() {
        return null;
    }
}
