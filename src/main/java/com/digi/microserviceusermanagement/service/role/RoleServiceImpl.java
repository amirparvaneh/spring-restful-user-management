package com.digi.microserviceusermanagement.service.role;

import com.digi.microserviceusermanagement.model.entity.Role;
import com.digi.microserviceusermanagement.repository.role.RoleRepoImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepoImpl roleRepo;

    public RoleServiceImpl(RoleRepoImpl roleRepo) {
        this.roleRepo = roleRepo;
    }

    @Override
    public void save(Role role) {
        roleRepo.save(role);
    }

    @Override
    public Role findById(Long id) {
        Role role = roleRepo.findById(id);
        return role;
    }

    @Override
    public void update(Role role) {
        roleRepo.update(role);
    }

    @Override
    public void delete(Long id) {
        roleRepo.delete(id);
    }

    @Override
    public List<Role> findAll() {
        return roleRepo.findAll();
    }
}
