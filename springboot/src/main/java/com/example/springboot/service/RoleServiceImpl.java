package com.example.springboot.service;

import com.example.springboot.dao.RoleDao;
import com.example.springboot.model.Role;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RoleServiceImpl implements RoleService{
    RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    @Transactional
    public Role saveRole(Role role) {
        return roleDao.save(role);
    }

    @Override
    @Transactional
    public Role findByRoleId(Long id) {
        return roleDao.findByRoleId(id);
    }
}
