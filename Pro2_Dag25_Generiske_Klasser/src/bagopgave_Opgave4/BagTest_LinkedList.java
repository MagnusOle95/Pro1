package bagopgave_Opgave4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BagTest_LinkedList
{
    private Bag<String> bag;

    @Before
    public void setUp()
    {
        bag = new LinkedListBag<>();
        bag.add("Jan");
        bag.add("Per");
        bag.add("Hans");
    }

    @Test
    public void testGetCurrentSize()
    {
        assertEquals(3, bag.getCurrentSize());
        bag.add("Lis");
        assertEquals(4, bag.getCurrentSize());
    }

   

    @Test
    public void testIsEmpty()
    {
        assertFalse(bag.isEmpty());
        bag.clear();
        assertTrue(bag.isEmpty());
    }

    @Test
    public void testAdd()
    {
        assertFalse(bag.contains("Lis"));
        bag.add("Lis");
        assertTrue(bag.contains("Lis"));
    }

    @Test
    public void testRemove()
    {
        String s = bag.remove();
        assertFalse(bag.contains(s));
        assertEquals(2, bag.getCurrentSize());
    }

    @Test
    public void testRemoveT()
    {
        assertTrue(bag.contains("Per"));
        assertTrue(bag.remove("Per"));
        assertFalse(bag.contains("Per"));
        assertEquals(2, bag.getCurrentSize());
    }

    @Test
    public void testClear()
    {
        bag.clear();
        assertEquals(0, bag.getCurrentSize());
        assertTrue(bag.isEmpty());
    }

    @Test
    public void testGetFrequencyOf()
    {
        assertEquals(1, bag.getFrequencyOf("Per"));
        bag.add("Per");
        assertEquals(2, bag.getFrequencyOf("Per"));
    }

    @Test
    public void testContains()
    {
        assertTrue(bag.contains("Per"));
        assertFalse(bag.contains("Pia"));
    }

    @Test
    public void testToArray()
    {
        Object[] arr = bag.toArray();
        assertEquals(3, arr.length);
    }

}
