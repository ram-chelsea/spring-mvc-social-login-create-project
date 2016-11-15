package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.dm.Creativ;



public interface CreativRepository extends JpaRepository<Creativ,Integer> {
    Creativ findByCreativName(String creativName);
}
