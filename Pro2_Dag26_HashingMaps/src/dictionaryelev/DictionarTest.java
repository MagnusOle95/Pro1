package dictionaryelev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DictionarTest {
    Dictionary<Integer, String> dictionary;
   

    @BeforeEach
    public void setUp() throws Exception {
        //dictionary = new DictionaryHashMap_Aflevering_Opgave2<>();
        //dictionary = new DictionaryLinked<>();
        dictionary = new DictionaryHashArray_Aflevering_Opgave3<>();
    }
    
    @Test
    public void test() {
        assertTrue(dictionary.isEmpty());
        assertEquals(0, dictionary.size());

        dictionary.put(8, "hans");
        dictionary.put(3, "viggo");


        
        assertFalse(dictionary.isEmpty());
        assertEquals(2, dictionary.size());

        assertEquals("hans", dictionary.get(8));

        dictionary.put(7, "bent");
        dictionary.put(2, "lene");
        
        assertFalse(dictionary.isEmpty());
        assertEquals(4, dictionary.size());
        
        assertEquals("viggo", dictionary.remove(3));

        assertEquals(3, dictionary.size());
        
        assertEquals("hans", dictionary.put(8, "Ida"));
        assertEquals("Ida", dictionary.get(8));

        assertEquals(3, dictionary.size());


        //Min ejen test, om add og remove flytter rigtigt i arrayet med keys og value.
        dictionary.put(18,"Ole");
        assertEquals(4,dictionary.size());
        assertEquals("Ole",dictionary.get(18));
        assertEquals("Ida",dictionary.get(8));

        assertEquals("Ida",dictionary.remove(8));
        assertEquals("Ole",dictionary.get(18));

        assertEquals(null,dictionary.put(8,"Bent"));
        assertEquals(null,dictionary.put(38,"Gurli"));

        assertEquals("Bent",dictionary.get(8));
        assertEquals("Ole",dictionary.get(18));
        assertEquals("Gurli",dictionary.get(38));

        assertEquals("Ole",dictionary.remove(18));

        assertEquals("Gurli",dictionary.get(38));
        assertEquals("Bent",dictionary.get(8));






    }



    
    
}
