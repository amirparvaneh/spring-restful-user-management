package com.digi.microserviceusermanagement.service.permission;

import com.digi.microserviceusermanagement.model.entity.Permission;
import com.digi.microserviceusermanagement.repository.permission.PermissionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService{

    private PermissionRepo permissionRepo;

    public PermissionServiceImpl(PermissionRepo permissionRepo){
        this.permissionRepo = permissionRepo;
    }
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
