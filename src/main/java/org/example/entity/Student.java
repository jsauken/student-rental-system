package org.example.entity;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student extends User {
    private String university;
    private String city;
    private String preferences;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Application> applications;
}

