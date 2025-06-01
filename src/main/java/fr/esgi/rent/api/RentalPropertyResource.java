package fr.esgi.rent.api;

import fr.esgi.rent.domain.EnergyClassificationEntity;
import fr.esgi.rent.domain.PropertyTypeEntity;
import fr.esgi.rent.dto.CreateRentalPropertyDto;
import fr.esgi.rent.dto.RentalPropertyDto;
import fr.esgi.rent.mapper.RentalPropertyMapper;
import fr.esgi.rent.domain.RentalPropertyEntity;
import fr.esgi.rent.repository.EnergyClassificationRepository;
import fr.esgi.rent.repository.PropertyTypeRepository;
import fr.esgi.rent.repository.RentalPropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class RentalPropertyResource {

    @Autowired
    private PropertyTypeRepository propertyTypeRepository;

    @Autowired
    private EnergyClassificationRepository energyClassificationRepository;

    private final RentalPropertyRepository rentalPropertyRepository;

    public RentalPropertyResource(RentalPropertyRepository rentalPropertyRepository) {
        this.rentalPropertyRepository = rentalPropertyRepository;
    }

    @GetMapping("/rental-properties")
    public List<RentalPropertyDto> getRentalProperties() {
        return rentalPropertyRepository.findAll()
                .stream()
                .map(RentalPropertyMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/rental-properties/{id}")
    public ResponseEntity<RentalPropertyDto> getRentalPropertyById(@PathVariable UUID id) {
        return rentalPropertyRepository.findById(id)
                .map(RentalPropertyMapper::toDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/rental-properties")
    public ResponseEntity<RentalPropertyDto> createRentalProperty(@RequestBody CreateRentalPropertyDto dto) {
        PropertyTypeEntity propertyType = propertyTypeRepository.findById(dto.getPropertyTypeId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid propertyTypeId"));

        EnergyClassificationEntity energy = energyClassificationRepository.findById(dto.getEnergyClassificationId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid energyClassificationId"));

        RentalPropertyEntity saved = rentalPropertyRepository.save(
                RentalPropertyMapper.fromCreateDto(dto, propertyType, energy));

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(RentalPropertyMapper.toDto(saved));
    }

}