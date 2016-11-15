package project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import project.dm.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {
    Tag findByTagName(String tagName);
}