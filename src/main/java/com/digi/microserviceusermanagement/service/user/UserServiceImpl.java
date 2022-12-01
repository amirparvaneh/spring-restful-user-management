package com.digi.microserviceusermanagement.service.user;

import com.digi.microserviceusermanagement.model.entity.User;
import com.digi.microserviceusermanagement.repository.user.UserRepoImpl;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private UserRepoImpl userRepo;

    public UserServiceImpl(UserRepoImpl userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public User findById(Long id) {
        User user = userRepo.findById(id);
        return user;
    }

    @Override
    public void update(User user) {
        userRepo.update(user);
    }

    @Override
    public void delete(Long id) {
        userRepo.delete(id);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
