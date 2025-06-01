package fr.esgi.rent;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTest {

    @Test
    void contextLoads() {
    }

    @Test
    void mainMethodShouldRunWithoutErrors() {
        Application.main(new String[]{});
    }

}


