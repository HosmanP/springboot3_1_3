package com.example.springboot.dao;

import com.example.springboot.model.Role;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.Set;

@Repository
public class RoleDaoImpl implements RoleDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void save(Role role) {
        entityManager.persist(role);
    }

    @Override
    public Role findByRoleId(Long id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public Set<Role> getAllRoles() {
        return new HashSet<>(entityManager.createQuery("SELECT u FROM Role u", Role.class).getResultList());
    }

    @Override
    public Role findByRoleName(String name) {
        return entityManager.createQuery("SELECT r FROM Role r WHERE r.role = :name", Role.class).setParameter("name", name).getSingleResult();
    }

}
