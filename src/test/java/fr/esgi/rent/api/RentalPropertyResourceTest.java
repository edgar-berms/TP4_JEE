package fr.esgi.rent.api;

import fr.esgi.rent.domain.RentalPropertyEntity;
import fr.esgi.rent.repository.RentalPropertyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
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

    @Test
    void shouldReturnListOfRentalProperties() throws Exception {
        // Given
        RentalPropertyEntity rental = new RentalPropertyEntity();
        rental.setId(UUID.randomUUID());
        rental.setDescription("Studio");
        rental.setTown("Paris");
        rental.setAddress("10 rue test");

        when(rentalPropertyRepository.findAll()).thenReturn(Collections.singletonList(rental));

        // When / Then
        mockMvc.perform(get("/api/rental-properties"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].description").value("Studio"))
                .andExpect(jsonPath("$[0].town").value("Paris"))
                .andExpect(jsonPath("$[0].address").value("10 rue test"));
    }
}