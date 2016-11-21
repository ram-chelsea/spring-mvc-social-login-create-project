package project.dm;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class User implements Serializable {

        @Id
        @Column(name = "ID")
        @GeneratedValue
        private Integer id;

        @Column(name = "NAME")
        @JsonProperty
        private String username;

        @Column(name = "PASSWORD")
        @JsonProperty
        private String password;

        @Column(name = "ISBANNED")
        private boolean isBanned;

        @Column(name = "PROVIDER")
        private String provider;

        @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        @JoinTable(
                name = "USER_ROLE",
                joinColumns = @JoinColumn(name = "USER_ID"),
                inverseJoinColumns = @JoinColumn(name = "ROLE_ID")
        )
        private Set<Role> roles = new HashSet<>();

        @OneToMany(mappedBy="user")
        private Set<Creativ> creativs = new HashSet<>();

        @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        @JoinTable(
                name = "USER_MEDAL",
                joinColumns = @JoinColumn(name = "USER_ID"),
                inverseJoinColumns = @JoinColumn(name = "MEDAL_ID")
        )
        private Set<Medal> medals = new HashSet<>();


        public int getId() {
                return id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public boolean isBanned() {
                return isBanned;
        }

        public void setBanned(boolean banned) {
                isBanned = banned;
        }

        public String getProvider() {
                return provider;
        }

        public void setProvider(String provider) {
                this.provider = provider;
        }

        public Set<Creativ> getCreativs() {
                return creativs;
        }

        public void setCreativs(Set<Creativ> creativs) {
                this.creativs = creativs;
        }

        public Set<Role> getRoles() {
                return roles;
        }

        public void setRoles(Set<Role> roles) {
                this.roles = roles;
        }

        public Set<Medal> getMedals() {
            return medals;
        }

        public void setMedals(Set<Medal> medals) {
            this.medals = medals;
        }
}
