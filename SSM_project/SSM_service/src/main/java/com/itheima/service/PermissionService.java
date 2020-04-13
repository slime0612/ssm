package com.itheima.service;

import com.itheima.domain.Permission;

import java.util.List;

public interface PermissionService {

    public List<Permission> findAll() throws Exception;

    void save(Permission permission)throws Exception;
}
