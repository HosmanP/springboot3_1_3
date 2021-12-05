package com.example.springboot.dao;

import com.example.springboot.model.Role;

import java.util.Set;

public interface RoleDao {
    public void save(Role role);
    public Role findByRoleId(Long id);
    public Set<Role> getAllRoles();
    public Role findByRoleName(String name);
}
