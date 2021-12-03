package com.example.springboot.dao;



import com.example.springboot.model.Role;


public interface RoleDao {

    Role save(Role role);

    public Role findByRoleId(Long id);

}
