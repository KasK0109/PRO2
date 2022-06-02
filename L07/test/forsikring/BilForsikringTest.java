package forsikring;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BilForsikringTest {

    private BilForsikring bilForsikring;

    @BeforeEach
    public void setUpBeforeEach() {
        bilForsikring = new BilForsikring();
    }

    @Test
    @Order(1)
    public void test_beregnPraemie_withoutReductions() {

        int alder = 25;
        boolean isKvinde = false;
        int skadeFrieaar = 0;
        bilForsikring.setGrundpaemie(500);

        //Act
        double praemie = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaar);

        //Assert
        assertEquals(praemie, 500);
    }

    @Test
    @Order(2)
    public void test_beregnPraemie_underTwentyFive() {

        int alder = 24;
        boolean isKvinde = false;
        int skadeFrieaar = 0;
        bilForsikring.setGrundpaemie(500);

        double praemie = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaar);

        assertEquals(praemie, 625);
    }

    @Test
    @Order(3)
    public void test_beregnPraemie_isKvinde() {
        int alder = 25;
        boolean isKvinde = true;
        int skadeFrieaar = 0;
        bilForsikring.setGrundpaemie(500);

        double praemie = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaar);

        assertEquals(praemie, 475);
    }

    @Test
    @Order(4)
    public void test_beregnPraemie_skadeFrieaarThree() {
        int alder = 25;
        boolean isKvinde = false;
        int skadeFrieaar = 3;
        bilForsikring.setGrundpaemie(500);

        double praemie = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaar);

        assertEquals(praemie, 425);
    }

    @Test
    @Order(5)
    public void test_beregnPraemie_skadeFrieaarFive() {
        int alder = 25;
        boolean isKvinde = false;
        int skadeFrieaar = 5;
        bilForsikring.setGrundpaemie(500);

        double praemie = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaar);

        assertEquals(praemie, 425);
    }

    @Test
    @Order(6)
    public void test_beregnPraemie_skadeFrieaarSix() {
        int alder = 25;
        boolean isKvinde = false;
        int skadeFrieaar = 6;
        bilForsikring.setGrundpaemie(500);

        double praemie = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaar);

        assertEquals(praemie, 375);
    }

    @Test
    @Order(7)
    public void test_beregnPraemie_skadeFrieaarEight() {
        int alder = 30;
        boolean isKvinde = false;
        int skadeFrieaar = 8;
        bilForsikring.setGrundpaemie(500);

        double praemie = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaar);

        assertEquals(praemie, 375);
    }

    @Test
    @Order(8)
    public void test_beregnPraemie_skadeFrieaarNine() {
        int alder = 30;
        boolean isKvinde = false;
        int skadeFrieaar = 9;
        bilForsikring.setGrundpaemie(500);

        double praemie = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaar);

        assertEquals(praemie, 325);
    }

    @Test
    @Order(9)
    public void test_beregnPraemie_throwsException() {

        // Arrange
        int alder = 16;
        boolean isKvinde = false;
        int skadeFrieaar = 0;

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaar);
        });
        assertTrue(exception.getMessage().contains("Du er for ung til at tegne en forsikring"));
    }
}
