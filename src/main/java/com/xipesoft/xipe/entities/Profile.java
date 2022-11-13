package com.xipesoft.xipe.entities;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "phone")
    private String phone;

    public Profile() {
    }

    public Profile(Long id, String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
