package project.dm;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "creativs")
public class Creativ {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer creativId;

    @Column(name = "NAME")
    private String creativName;

    @Column(name = "CREATIONDATE")
    private Date creationDate;

    @Column(name = "RATE")
    private int rate;


    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToMany(mappedBy="creativ")
    private Set<Chapter> chapters = new HashSet<>();


    public String getCreativName() {
        return creativName;
    }

    public void setCreativName(String creativName) {
        this.creativName = creativName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(Set<Chapter> chapters) {
        this.chapters = chapters;
    }

    public int getCreativId() {
        return creativId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
