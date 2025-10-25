package org.example.entity;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Landlord extends User {
    private String companyName;

    @OneToMany(mappedBy = "landlord", cascade = CascadeType.ALL)
    private List<Apartment> apartments;
}
