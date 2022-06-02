import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Test.*;
import static org.junit.jupiter.api.Assertions.*;

public class BiblotekTest {

    @Test
    @Order(1)
    void beregnBøde_enTilSyvDageOverskredet_voksen() {

        // Arrange
        Biblotek biblotek = new Biblotek();
        LocalDate berengetDato = LocalDate.of(2022, 3, 1);
        LocalDate faktiskDato1 = LocalDate.of(2022, 3, 2);
        LocalDate faktiskDato2 = LocalDate.of(2022, 3, 7);
        boolean voksen = true;
        int expectedBøde = 20;

        // Act
        int actualBøde1 = biblotek.beregnBøde(berengetDato, faktiskDato1, voksen);
        int actualBøde2 = biblotek.beregnBøde(berengetDato, faktiskDato2, voksen);

        // Assert
        assertEquals(expectedBøde, actualBøde1);
        assertEquals(expectedBøde, actualBøde2);
    }

//    @Test
//    @Order(2)
//    void beregnBøde_otteTilFjortenDageOverskredet_voksen() {
//
//        // Arrange
//        Biblotek biblotek = new Biblotek();
//        LocalDate berengetDato = LocalDate.of(2022, 3, 1);
//        LocalDate faktiskDato1 = LocalDate.of(2022, 3, 9);
//        LocalDate faktiskDato2 = LocalDate.of(2022, 3, 15);
//        boolean voksen = true;
//        int expectedBøde = 60;
//
//        // Act
//        int actualBøde1 = biblotek.beregnBøde(berengetDato, faktiskDato1, voksen);
//        int actualBøde2 = biblotek.beregnBøde(berengetDato, faktiskDato2, voksen);
//
//        // Assert
//        assertEquals(expectedBøde, actualBøde1);
//        assertEquals(expectedBøde, actualBøde2);
//    }

//    @Test
//    @Order(3)
//    void beregnBøde_mereEndFemtenDageOverskredet_voksen() {
//
//        // Arrange
//        Biblotek biblotek = new Biblotek();
//        LocalDate berengetDato = LocalDate.of(2022, 3, 1);
//        LocalDate faktiskDato = LocalDate.of(2022, 3, 16);
//        boolean voksen = true;
//        int expectedBøde = 90;
//
//        // Act
//        int actualBøde = biblotek.beregnBøde(berengetDato, faktiskDato, voksen);
//
//
//        // Assert
//        assertEquals(expectedBøde, actualBøde);
//
//    }

    @Test
    @Order(4)
    void beregnBøde_enTilSyvDageOverskredet_barn() {

        // Arrange
        Biblotek biblotek = new Biblotek();
        LocalDate berengetDato = LocalDate.of(2022, 3, 1);
        LocalDate faktiskDato1 = LocalDate.of(2022, 3, 2);
        LocalDate faktiskDato2 = LocalDate.of(2022, 3, 7);
        boolean voksen = false;
        int expectedBøde = 10;

        // Act
        int actualBøde1 = biblotek.beregnBøde(berengetDato, faktiskDato1, voksen);
        int actualBøde2 = biblotek.beregnBøde(berengetDato, faktiskDato2, voksen);

        // Assert
        assertEquals(expectedBøde, actualBøde1);
        assertEquals(expectedBøde, actualBøde2);
    }

}
