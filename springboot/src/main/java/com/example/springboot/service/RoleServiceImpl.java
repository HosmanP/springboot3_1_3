package com.example.springboot.service;

import com.example.springboot.dao.RoleDao;
import com.example.springboot.model.Role;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {
    RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    @Transactional
    public void saveRole(Role role) {
        roleDao.save(role);
    }

    @Override
    @Transactional
    public Role findByRoleId(Long id) {
        return roleDao.findByRoleId(id);
    }

    @Override
    @Transactional
    public Set<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

    @Override
    @Transactional
    public Role findByRoleName(String name) {
        return roleDao.findByRoleName(name);
    }
}
