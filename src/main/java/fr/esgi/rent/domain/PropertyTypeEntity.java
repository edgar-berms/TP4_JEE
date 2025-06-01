package fr.esgi.rent.domain;

import jakarta.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "property_type")
public class PropertyTypeEntity {

    @GeneratedValue
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "designation")
    private String designation;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PropertyTypeEntity that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PropertyTypeEntity{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                '}';
    }
}
