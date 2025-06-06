package fr.esgi.rent.api;

import fr.esgi.rent.domain.RentalPropertyEntity;
import fr.esgi.rent.repository.EnergyClassificationRepository;
import fr.esgi.rent.repository.PropertyTypeRepository;
import fr.esgi.rent.repository.RentalPropertyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.Optional;
import java.util.UUID;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(RentalPropertyResource.class)
class RentalPropertyResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RentalPropertyRepository rentalPropertyRepository;

    @MockBean
    private PropertyTypeRepository propertyTypeRepository;

    @MockBean
    private EnergyClassificationRepository energyClassificationRepository;

    @Test
    void shouldReturnListOfRentalProperties() throws Exception {
        RentalPropertyEntity rental = new RentalPropertyEntity();
        rental.setId(UUID.randomUUID());
        rental.setDescription("Studio");
        rental.setTown("Paris");
        rental.setAddress("10 rue test");

        when(rentalPropertyRepository.findAll()).thenReturn(Collections.singletonList(rental));

        mockMvc.perform(get("/api/rental-properties"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].description").value("Studio"))
                .andExpect(jsonPath("$[0].town").value("Paris"))
                .andExpect(jsonPath("$[0].address").value("10 rue test"));
    }

    @Test
    void shouldReturnPropertyById() throws Exception {
        UUID id = UUID.randomUUID();
        RentalPropertyEntity entity = new RentalPropertyEntity();
        entity.setId(id);
        entity.setDescription("Studio");
        entity.setTown("Paris");
        entity.setAddress("10 rue A");

        when(rentalPropertyRepository.findById(id)).thenReturn(Optional.of(entity));

        mockMvc.perform(get("/api/rental-properties/" + id))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.description").value("Studio"))
                .andExpect(jsonPath("$.town").value("Paris"));
    }
}