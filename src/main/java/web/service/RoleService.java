package web.service;

import web.model.Role;
import web.model.User;

import java.util.List;

public interface RoleService {
    void addRole(Role role);

    void updateRole(Role role);

    void removeRoleById(Long id);

    Role getRoleByName(String name);

    List<Role> getAllRoles();
}
