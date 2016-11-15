package project.dm;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User implements Serializable {

        @Id
        @Column(name = "ID")
        @GeneratedValue
        private Integer id;

        @Column(name = "NAME")
        private String username;

        @Column(name = "PASSWORD")
        private String password;

        @Column(name = "ISBANNED")
        private boolean isBanned;

        @Column(name = "PROVIDER")
        private String provider;

        @Column(name = "MEDAL")
        private String medal;

        @Column(name = "PASSWORDCONFIRM")
        private String passwordConfirm;

        @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        @JoinTable(
                name = "USER_ROLE",
                joinColumns = @JoinColumn(name = "USER_ID"),
                inverseJoinColumns = @JoinColumn(name = "ROLE_ID")
        )
        private Set<Role> roles = new HashSet<>();

        @OneToMany(mappedBy="user")
        private Set<Creativ> creativs = new HashSet<>();


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

        public String getMedal() {return medal;    }

        public void setMedal(String medal) { this.medal = medal; }

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


        public String getPasswordConfirm() {
                return passwordConfirm;
        }

        public void setPasswordConfirm(String passwordConfirm) {
                this.passwordConfirm = passwordConfirm;
        }
}
