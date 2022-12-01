package com.digi.microserviceusermanagement.repository.permission;

import com.digi.microserviceusermanagement.model.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepo extends JpaRepository<Permission,Long> {
}
