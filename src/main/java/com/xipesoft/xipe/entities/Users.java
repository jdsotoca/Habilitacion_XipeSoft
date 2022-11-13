package com.xipesoft.xipe.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "users",uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "email")
    private String email;
    private String task;
    private String profile;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    @JoinTable(
            name = "users_profiles",
            joinColumns = {@JoinColumn(name = "user_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "profile_id",referencedColumnName = "id")})

    private Collection<Profile> profiles;

    public Users() {
    }

    public Users(Long id, String email, String task, String profile, String password, Collection<Profile> profiles) {
        this.id = id;
        this.email = email;
        this.task = task;
        this.profile = profile;
        this.password = password;
        this.profiles = profiles;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getProfile() {
        return this.profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Profile> getProfiles() {
        return this.profiles;
    }

    public void setProfiles(Collection<Profile> profiles) {
        this.profiles = profiles;
    }
}


