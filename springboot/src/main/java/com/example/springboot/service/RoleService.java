package com.example.springboot.service;

import com.example.springboot.model.Role;

import java.util.Set;

public interface RoleService {
    public void saveRole(Role role);
    public Role findByRoleId(Long id);
    public Set<Role> getAllRoles();
    public Role findByRoleName(String name);
}
