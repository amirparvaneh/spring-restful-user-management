package com.digi.microserviceusermanagement.repository.user;

import com.digi.microserviceusermanagement.model.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepoImpl implements UserRepo{
    @Override
    public void save(User user) {

    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
