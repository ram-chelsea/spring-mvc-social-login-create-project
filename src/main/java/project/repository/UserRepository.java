package project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import project.dm.User;


public interface UserRepository extends JpaRepository<User,Integer> {
        User findByUsername(String username);
}
