package com.xipesoft.xipe.entities;

import com.xipesoft.xipe.enums.Enum_StateTask;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "title")
    public String title;

    @Column(name = "description")
    public String description;

    @Enumerated(EnumType.STRING)
    @Column(name="states_id")
    private Enum_StateTask states;


    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

}
