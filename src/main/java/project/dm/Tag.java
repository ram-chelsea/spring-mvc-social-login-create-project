package project.dm;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tags")
public class Tag {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer tagId;

    @Column(name = "NAME")
    private String tagName;

    @ManyToMany(mappedBy = "tags")
    private Set<Chapter> chapters = new HashSet<>();

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Set<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(Set<Chapter> chapters) {
        this.chapters = chapters;
    }
}
