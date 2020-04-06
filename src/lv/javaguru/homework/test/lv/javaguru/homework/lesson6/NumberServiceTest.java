package lv.javaguru.homework.lesson6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

        private NumberService prime;
    @BeforeEach
    void setUp() {
        prime = new NumberService();
    }

    @Test
    void shouldShowSumInRange() {
        NumberService sum = new NumberService();
        assertEquals(10, sum);


    }

    @Test
    void shouldGetTotalNumbers() {
        
    }
}