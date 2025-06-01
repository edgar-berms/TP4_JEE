package fr.esgi.rent.domain;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PropertyTypeEntityTest {

    @Test
    void shouldSetAndGetFieldsCorrectly() {
        // Given
        UUID id = UUID.randomUUID();
        String designation = "Appartement";

        PropertyTypeEntity entity = new PropertyTypeEntity();

        // When
        entity.setId(id);
        entity.setDesignation(designation);

        // Then
        assertEquals(id, entity.getId());
        assertEquals(designation, entity.getDesignation());
    }

    @Test
    void shouldAllowNullValues() {
        PropertyTypeEntity entity = new PropertyTypeEntity();

        entity.setId(null);
        entity.setDesignation(null);

        assertNull(entity.getId());
        assertNull(entity.getDesignation());
    }
}