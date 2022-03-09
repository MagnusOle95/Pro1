import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StuderendeTest {

    private Studerende studerende1 = new Studerende(22222,"Flemming" );
    private ArrayList<Integer> karakter = new ArrayList<>();

    @Test
    void getStudieNr() {
        assertEquals(22222,studerende1.getStudieNr());
    }

    @Test
    void setStudieNr() {
        studerende1.setStudieNr(33333);
        assertEquals(33333,studerende1.getStudieNr());
    }

    @Test
    void getNavn() {
        assertEquals("Flemming",studerende1.getNavn());
    }

    @Test
    void setNavn() {
        studerende1.setNavn("Per");
        assertEquals("Per",studerende1.getNavn());
    }

    @Test
    void addKarater() {
        studerende1.addKarater(12);
        karakter.add(12);
        studerende1.addKarater(6);
        karakter.add(6);
        assertEquals(karakter,studerende1.getKarakters());
    }

    @Test
    void getKarakters() {
        studerende1.addKarater(12);
        karakter.add(12);
        studerende1.addKarater(6);
        karakter.add(6);
        assertEquals(karakter,studerende1.getKarakters());
    }
}