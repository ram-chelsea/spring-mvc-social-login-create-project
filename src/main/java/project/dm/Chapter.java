package project.dm;



import sun.util.calendar.BaseCalendar;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "chapters")
public class Chapter {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer chapterId;

    @Column(name = "NAME")
    private String chapterName;

    @Column(name = "SERIAL_NUMBER")
    private int serialNumber;

    @Column(name = "CREATIONDATE")
    private Date creationDate;

    @Column(columnDefinition = "TEXT", name="CONTENT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "CREATIV_ID")
    private Creativ creativ;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "CHAPTER_TAG",
            joinColumns = @JoinColumn(name = "CHAPTER_ID"),
            inverseJoinColumns = @JoinColumn(name = "TAG_ID")
    )
    private Set<Tag> tags = new HashSet<>();

    public int getChapterId() {
        return chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Creativ getCreativ() {
        return creativ;
    }

    public void setCreativ(Creativ creativ) {
        this.creativ = creativ;
    }
}
