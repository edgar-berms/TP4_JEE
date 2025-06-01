package fr.esgi.rent.mapper;

import fr.esgi.rent.domain.EnergyClassificationEntity;
import fr.esgi.rent.domain.PropertyTypeEntity;
import fr.esgi.rent.dto.CreateRentalPropertyDto;
import fr.esgi.rent.dto.RentalPropertyDto;
import fr.esgi.rent.domain.RentalPropertyEntity;

import java.util.UUID;

public class RentalPropertyMapper {

    public static RentalPropertyDto toDto(RentalPropertyEntity entity) {
        RentalPropertyDto dto = new RentalPropertyDto();
        dto.setId(entity.getId());
        dto.setDescription(entity.getDescription());
        dto.setTown(entity.getTown());
        dto.setAddress(entity.getAddress());
        return dto;
    }

    public static RentalPropertyEntity fromCreateDto(CreateRentalPropertyDto dto,
                                                     PropertyTypeEntity propertyType,
                                                     EnergyClassificationEntity energyClassification) {
        RentalPropertyEntity entity = new RentalPropertyEntity();
        entity.setId(UUID.randomUUID());
        entity.setDescription(dto.getDescription());
        entity.setTown(dto.getTown());
        entity.setAddress(dto.getAddress());
        entity.setPropertyType(propertyType);
        entity.setRentAmount(dto.getRentAmount());
        entity.setSecurityDepositAmount(dto.getSecurityDepositAmount());
        entity.setArea(dto.getArea());
        entity.setNumberOfBedrooms(dto.getNumberOfBedrooms());
        entity.setFloorNumber(dto.getFloorNumber());
        entity.setNumberOfFloors(dto.getNumberOfFloors());
        entity.setConstructionYear(dto.getConstructionYear());
        entity.setEnergyClassification(energyClassification);
        entity.setHasElevator(dto.isHasElevator());
        entity.setHasIntercom(dto.isHasIntercom());
        entity.setHasBalcony(dto.isHasBalcony());
        entity.setHasParkingSpace(dto.isHasParkingSpace());
        return entity;
    }

}