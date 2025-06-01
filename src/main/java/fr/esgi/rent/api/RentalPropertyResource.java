package fr.esgi.rent.api;

import fr.esgi.rent.domain.RentalPropertyEntity;
import fr.esgi.rent.repository.RentalPropertyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RentalPropertyResource {

    private final RentalPropertyRepository rentalPropertyRepository;

    private static final Logger log = LoggerFactory.getLogger(RentalPropertyResource.class);

    public RentalPropertyResource(RentalPropertyRepository rentalPropertyRepository) {
        this.rentalPropertyRepository = rentalPropertyRepository;
    }

    @GetMapping("/rental-properties")
    public List<RentalPropertyEntity> getRentalProperties() {
        List<RentalPropertyEntity> properties = rentalPropertyRepository.findAll();
        log.info("Nombre de propriétés récupérées : {}", properties.size());
        return properties;
    }
}
