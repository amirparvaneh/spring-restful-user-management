package com.digi.microserviceusermanagement.repository.permission;

import com.digi.microserviceusermanagement.model.entity.Permission;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionRepoImpl implements PermissionRepo{
    @Override
    public void save(Permission permission) {

    }

    @Override
    public Permission findById(Long id) {
        return null;
    }

    @Override
    public void update(Permission permission) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Permission> findAll() {
        return null;
    }
}
