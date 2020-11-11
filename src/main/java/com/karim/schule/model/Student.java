package com.karim.schule.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToOne(fetch =
            FetchType.LAZY
    )
    @JoinColumn(name = "class_id")
    private ClassRoom classRoom;


    public Student() {
    }

    public Student(String firstName, String lastName, ClassRoom classRoom) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classRoom =classRoom;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }
}
