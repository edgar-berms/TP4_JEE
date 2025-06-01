package fr.esgi.rent.api;

import fr.esgi.rent.dto.RentalPropertyDto;
import fr.esgi.rent.mapper.RentalPropertyMapper;
import fr.esgi.rent.domain.RentalPropertyEntity;
import fr.esgi.rent.repository.RentalPropertyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class RentalPropertyResource {

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
}