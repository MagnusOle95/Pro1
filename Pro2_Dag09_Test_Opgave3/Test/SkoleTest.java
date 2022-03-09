import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SkoleTest {

    private Skole skole = new Skole("Holgberskolen");
    private Studerende studerende1 = new Studerende(22222,"Flemming" );
    private Studerende studerende2 = new Studerende(11111,"Hans");
    private ArrayList<Studerende> studerendesList = new ArrayList<>();

    @Test
    void getNavn() {
        assertEquals("Holgberskolen",skole.getNavn());
    }

    @Test
    void setNavn() {
        skole.setNavn("Randers skole");
        assertEquals("Randers skole",skole.getNavn());
    }

    @Test
    void addStuderende() {
        skole.addStuderende(studerende1);
        studerendesList.add(studerende1);
        skole.addStuderende(studerende2);
        studerendesList.add(studerende2);
        assertEquals(studerendesList,skole.studerendes);

    }

    @Test
    void removeStuderende() {
        skole.removeStuderende(studerende1);
        studerendesList.remove(studerende1);
        assertEquals(studerendesList,skole.studerendes);

    }

    @Test
    void gennemsnit() {
        skole.addStuderende(studerende1);
        skole.addStuderende(studerende2);
        studerende1.addKarater(10);
        studerende1.addKarater(12);
        studerende1.addKarater(8);
        studerende2.addKarater(6);
        studerende2.addKarater(10);
        studerende2.addKarater(8);
        assertEquals(9,skole.gennemsnit());

    }

    @Test
    void findStuderende() {
        skole.addStuderende(studerende1);
        skole.addStuderende(studerende2);
        assertEquals(studerende2,skole.findStuderende(11111));

    }

}