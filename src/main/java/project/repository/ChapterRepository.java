package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.dm.Chapter;


public interface ChapterRepository extends JpaRepository<Chapter,Integer> {
    Chapter findByChapterName(String chapterName);
}
