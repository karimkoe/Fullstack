package com.karim.schule.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Classroom")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String room;
    @OneToMany(
            mappedBy = "classRoom",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Student> students = new ArrayList<>();

    public ClassRoom() {
    }

    public ClassRoom(String name, String room, List<Student> students) {
        this.name = name;
        this.room = room;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public List<Student> getStudents() {
        return students;
    }
}
