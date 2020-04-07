package lv.javaguru.homework.lesson6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberServiceTest {

    private NumberService prime;

    @BeforeEach
    void setUp() {
        prime = new NumberService();
    }

    //tests nedarbojas, jo tu salīdzini servisu summu
    //tev tam servisam ir jāizsauc metode un jaiegūst summa un tad jasaldzina
    @Test
    void shouldShowSumInRange() {
        NumberService sum = new NumberService();
        assertEquals(10, sum);
    }

    @Test
    void shouldGetTotalNumbers() {

    }
}