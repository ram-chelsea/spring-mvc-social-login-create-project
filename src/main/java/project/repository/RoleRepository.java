package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.dm.Role;


public interface RoleRepository extends JpaRepository<Role, Integer>{
    Role findByName(String name);

}
