package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long apartmentId;

    private String address;
    private Float price;
    private Integer capacity;
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        AVAILABLE, OCCUPIED
    }

    @ManyToOne
    private Landlord landlord;
}
