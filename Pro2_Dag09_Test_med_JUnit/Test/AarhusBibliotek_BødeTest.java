import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AarhusBibliotek_BødeTest {

    @Test
    void beregnbøde() {
        //Arrange
        AarhusBibliotek_Bøde biblioteksBøde = new AarhusBibliotek_Bøde();

        //Act
        int bøde1 = biblioteksBøde.beregnbøde(LocalDate.of(2022,02 ,1),
                LocalDate.of(2022,02 ,5 ),true);

        int bøde2 = biblioteksBøde.beregnbøde(LocalDate.of(2022,02 ,1),
                LocalDate.of(2022,02 ,5 ),false);

        int bøde3 = biblioteksBøde.beregnbøde(LocalDate.of(2022,02 ,1),
                LocalDate.of(2022,02 ,11 ),true);

        int bøde4 = biblioteksBøde.beregnbøde(LocalDate.of(2022,02 ,1),
                LocalDate.of(2022,02 ,11 ),false);

        int bøde5 = biblioteksBøde.beregnbøde(LocalDate.of(2022,02 ,1),
                LocalDate.of(2022,02 ,16 ),true);

        int bøde6 = biblioteksBøde.beregnbøde(LocalDate.of(2022,02 ,1),
                LocalDate.of(2022,02 ,16 ),false);

        //Assert
        assertEquals(20,bøde1);
        assertEquals(10,bøde2);
        assertEquals(60,bøde3);
        assertEquals(30,bøde4);
        assertEquals(90,bøde5);
        assertEquals(45,bøde6);


    }

}