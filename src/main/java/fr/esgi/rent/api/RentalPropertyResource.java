package fr.esgi.rent.api;

import fr.esgi.rent.domain.RentalPropertyEntity;
import fr.esgi.rent.repository.RentalPropertyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RentalPropertyResource {

    private final RentalPropertyRepository rentalPropertyRepository;

    public RentalPropertyResource(RentalPropertyRepository rentalPropertyRepository) {
        this.rentalPropertyRepository = rentalPropertyRepository;
    }

    @GetMapping("/rental-properties")
    public List<RentalPropertyEntity> getRentalProperties() {
        return rentalPropertyRepository.findAll();
    }
}