package fr.esgi.rent.dto;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CreateRentalPropertyDtoTest {

    @Test
    void shouldSetAndGetAllFields() {
        CreateRentalPropertyDto dto = new CreateRentalPropertyDto();

        String description = "Appartement spacieux";
        String town = "Lyon";
        String address = "12 rue des tests";
        UUID propertyTypeId = UUID.randomUUID();
        UUID energyClassificationId = UUID.randomUUID();
        double rentAmount = 850.50;
        double depositAmount = 1200.00;
        double area = 55.7;
        byte numberOfBedrooms = 2;
        Short floorNumber = 3;
        Short numberOfFloors = 5;
        short constructionYear = 1999;
        boolean hasElevator = true;
        boolean hasIntercom = true;
        boolean hasBalcony = false;
        boolean hasParkingSpace = true;

        dto.setDescription(description);
        dto.setTown(town);
        dto.setAddress(address);
        dto.setPropertyTypeId(propertyTypeId);
        dto.setEnergyClassificationId(energyClassificationId);
        dto.setRentAmount(rentAmount);
        dto.setSecurityDepositAmount(depositAmount);
        dto.setArea(area);
        dto.setNumberOfBedrooms(numberOfBedrooms);
        dto.setFloorNumber(floorNumber);
        dto.setNumberOfFloors(numberOfFloors);
        dto.setConstructionYear(constructionYear);
        dto.setHasElevator(hasElevator);
        dto.setHasIntercom(hasIntercom);
        dto.setHasBalcony(hasBalcony);
        dto.setHasParkingSpace(hasParkingSpace);

        assertEquals(description, dto.getDescription());
        assertEquals(town, dto.getTown());
        assertEquals(address, dto.getAddress());
        assertEquals(propertyTypeId, dto.getPropertyTypeId());
        assertEquals(energyClassificationId, dto.getEnergyClassificationId());
        assertEquals(rentAmount, dto.getRentAmount());
        assertEquals(depositAmount, dto.getSecurityDepositAmount());
        assertEquals(area, dto.getArea());
        assertEquals(numberOfBedrooms, dto.getNumberOfBedrooms());
        assertEquals(floorNumber, dto.getFloorNumber());
        assertEquals(numberOfFloors, dto.getNumberOfFloors());
        assertEquals(constructionYear, dto.getConstructionYear());
        assertEquals(hasElevator, dto.isHasElevator());
        assertEquals(hasIntercom, dto.isHasIntercom());
        assertEquals(hasBalcony, dto.isHasBalcony());
        assertEquals(hasParkingSpace, dto.isHasParkingSpace());
    }
}
