package crudsec.DAO;



import crudsec.model.Role;

import java.util.Set;

public interface RoleDao {
    public Set<Role> getAllRoles();

    public Role findByRoleName(String name);

    public Role findByRoleId(Long id);

    void saveRole(Role role);
}