import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void beregnPraemie() {
        // Arrange
        BilForsikring bilforsikring = new BilForsikring();
        bilforsikring.setGrundpaemie(100);
        // Act
        double TC1 = bilforsikring.beregnPraemie(25, false ,1);
        double TC2 = bilforsikring.beregnPraemie(25, false ,4);
        double TC3 = bilforsikring.beregnPraemie(25, false ,7);
        double TC4 = bilforsikring.beregnPraemie(27, false ,9);
        double TC5 = bilforsikring.beregnPraemie(24, false ,1);
        double TC6 = bilforsikring.beregnPraemie(24, false ,4);
        double TC7 = bilforsikring.beregnPraemie(24, false ,6);
        double TC8 = bilforsikring.beregnPraemie(25, true ,1);
        double TC9 = bilforsikring.beregnPraemie(25, true ,4);
        double TC10 = bilforsikring.beregnPraemie(25, true ,7);
        double TC11 = bilforsikring.beregnPraemie(27, true ,9);
        double TC12 = bilforsikring.beregnPraemie(24, true ,1);
        double TC13 = bilforsikring.beregnPraemie(24, true ,4);
        double TC14 = bilforsikring.beregnPraemie(24, true ,6);

        // Assert
        assertEquals(100,TC1);
        assertEquals(85,TC2);
        assertEquals(75,TC3);
        assertEquals(65,TC4);
        assertEquals(125, TC5);
        assertEquals(106.25,TC6);
        assertEquals(93.75,TC7);
        assertEquals(95,TC8);
        assertEquals(80.75,TC9);
        assertEquals(71.25,TC10);
        assertEquals(61.75,TC11);
        assertEquals(118.75,TC12);
        assertEquals(100.9375,TC13);
        assertEquals(89.0625,TC14);


    }



}