package fr.esgi.rent.domain;

import jakarta.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "energy_classification")
public class EnergyClassificationEntity {

    @GeneratedValue
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "designation")
    private String designation;

    // Getters et Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}