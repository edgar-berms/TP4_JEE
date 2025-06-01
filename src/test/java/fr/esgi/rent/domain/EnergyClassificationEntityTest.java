package fr.esgi.rent.domain;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class EnergyClassificationEntityTest {

    @Test
    void shouldSetAndGetFieldsCorrectly() {
        // Given
        UUID id = UUID.randomUUID();
        String designation = "A";

        EnergyClassificationEntity entity = new EnergyClassificationEntity();

        // When
        entity.setId(id);
        entity.setDesignation(designation);

        // Then
        assertEquals(id, entity.getId());
        assertEquals(designation, entity.getDesignation());
    }

    @Test
    void shouldAllowNullValues() {
        EnergyClassificationEntity entity = new EnergyClassificationEntity();

        entity.setId(null);
        entity.setDesignation(null);

        assertNull(entity.getId());
        assertNull(entity.getDesignation());
    }
}