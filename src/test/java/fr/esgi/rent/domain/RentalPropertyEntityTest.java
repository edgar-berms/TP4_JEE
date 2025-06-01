package fr.esgi.rent.domain;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class RentalPropertyEntityTest {

    @Test
    void shouldSetAndGetAllFieldsCorrectly() {
        UUID id = UUID.randomUUID();
        String description = "Super appartement";
        String town = "Paris";
        String address = "10 rue des Lilas";
        PropertyTypeEntity propertyType = new PropertyTypeEntity();
        propertyType.setId(UUID.randomUUID());
        propertyType.setDesignation("Appartement");

        double rentAmount = 850.50;
        double securityDepositAmount = 1200.00;
        double area = 45.0;
        byte numberOfBedrooms = 2;
        Short floorNumber = 1;
        Short numberOfFloors = 4;
        short constructionYear = 2015;

        EnergyClassificationEntity energyClassification = new EnergyClassificationEntity();
        energyClassification.setId(UUID.randomUUID());
        energyClassification.setDesignation("A");

        boolean hasElevator = true;
        boolean hasIntercom = false;
        boolean hasBalcony = true;
        boolean hasParkingSpace = false;

        RentalPropertyEntity property = new RentalPropertyEntity();

        property.setId(id);
        property.setDescription(description);
        property.setTown(town);
        property.setAddress(address);
        property.setPropertyType(propertyType);
        property.setRentAmount(rentAmount);
        property.setSecurityDepositAmount(securityDepositAmount);
        property.setArea(area);
        property.setNumberOfBedrooms(numberOfBedrooms);
        property.setFloorNumber(floorNumber);
        property.setNumberOfFloors(numberOfFloors);
        property.setConstructionYear(constructionYear);
        property.setEnergyClassification(energyClassification);
        property.setHasElevator(hasElevator);
        property.setHasIntercom(hasIntercom);
        property.setHasBalcony(hasBalcony);
        property.setHasParkingSpace(hasParkingSpace);

        assertEquals(id, property.getId());
        assertEquals(description, property.getDescription());
        assertEquals(town, property.getTown());
        assertEquals(address, property.getAddress());
        assertEquals(propertyType, property.getPropertyType());
        assertEquals(rentAmount, property.getRentAmount());
        assertEquals(securityDepositAmount, property.getSecurityDepositAmount());
        assertEquals(area, property.getArea());
        assertEquals(numberOfBedrooms, property.getNumberOfBedrooms());
        assertEquals(floorNumber, property.getFloorNumber());
        assertEquals(numberOfFloors, property.getNumberOfFloors());
        assertEquals(constructionYear, property.getConstructionYear());
        assertEquals(energyClassification, property.getEnergyClassification());
        assertEquals(hasElevator, property.isHasElevator());
        assertEquals(hasIntercom, property.isHasIntercom());
        assertEquals(hasBalcony, property.isHasBalcony());
        assertEquals(hasParkingSpace, property.isHasParkingSpace());
    }

    @Test
    void shouldAllowNullValuesForOptionalFields() {
        RentalPropertyEntity entity = new RentalPropertyEntity();

        entity.setFloorNumber(null);
        entity.setNumberOfFloors(null);

        assertNull(entity.getFloorNumber());
        assertNull(entity.getNumberOfFloors());
    }
}