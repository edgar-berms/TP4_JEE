package fr.esgi.rent.mapper;

import fr.esgi.rent.dto.RentalPropertyDto;
import fr.esgi.rent.domain.RentalPropertyEntity;

public class RentalPropertyMapper {

    public static RentalPropertyDto toDto(RentalPropertyEntity entity) {
        RentalPropertyDto dto = new RentalPropertyDto();
        dto.setId(entity.getId());
        dto.setDescription(entity.getDescription());
        dto.setTown(entity.getTown());
        dto.setAddress(entity.getAddress());
        return dto;
    }
}