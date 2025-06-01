package fr.esgi.rent.dto;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class RentalPropertyDtoTest {

    @Test
    void shouldSetAndGetFieldsCorrectly() {
        UUID id = UUID.randomUUID();
        String description = "Appartement lumineux";
        String town = "Lyon";
        String address = "45 rue de la République";

        RentalPropertyDto dto = new RentalPropertyDto();
        dto.setId(id);
        dto.setDescription(description);
        dto.setTown(town);
        dto.setAddress(address);

        assertEquals(id, dto.getId());
        assertEquals(description, dto.getDescription());
        assertEquals(town, dto.getTown());
        assertEquals(address, dto.getAddress());
    }

    @Test
    void shouldAllowNullValues() {
        RentalPropertyDto dto = new RentalPropertyDto();
        dto.setId(null);
        dto.setDescription(null);
        dto.setTown(null);
        dto.setAddress(null);

        assertNull(dto.getId());
        assertNull(dto.getDescription());
        assertNull(dto.getTown());
        assertNull(dto.getAddress());
    }
}