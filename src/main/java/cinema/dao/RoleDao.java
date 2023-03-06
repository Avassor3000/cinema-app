package cinema.dao;

import cinema.model.Role;
import java.util.Optional;

public interface RoleDao {
    Optional<Role> getByName(Role.RoleName roleName);

    Role add(Role role);
}
