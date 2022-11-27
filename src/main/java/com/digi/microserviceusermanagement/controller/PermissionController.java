package com.digi.microserviceusermanagement.controller;

import com.digi.microserviceusermanagement.model.entity.Permission;
import com.digi.microserviceusermanagement.service.permission.PermissionServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController("/permission")
public class PermissionController {

    private PermissionServiceImpl permissionService;

    public PermissionController(PermissionServiceImpl permissionService){
        this.permissionService = permissionService;
    }


    @GetMapping()
    private Permission getPermission(@RequestParam Long id){
        Permission permission = new Permission();
        permission = permissionService.findById(id);
        return permission;
    }


    @PostMapping
    @ResponseBody
    private String createPermission(@RequestBody Permission permission){
        permissionService.save(permission);
        return permission.getTitle() + "have been saved";
    }

    @GetMapping("/allPermission")
    @ResponseBody
    private List<Permission> getAllPermission(){
        List<Permission> result = new ArrayList<>();
        result = permissionService.findAll();
        return result;
    }

    @PutMapping
    private String updatePermission(@RequestParam Long id){
        Permission permission = permissionService.findById(id);
        if (Objects.nonNull(permission)){
            permissionService.update(permission);
        }
        return permission.getTitle() + "have been updated";
    }

    @DeleteMapping
    private String deletePermission(@RequestParam Long id){
        permissionService.delete(id);
        return "permission with id : " + id + "have been deleted";
    }

}
