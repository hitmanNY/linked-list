package jason.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    private LinkedList jlist;

    @Before
    public void setup() {
        jlist = new LinkedList();
    }

    @Test
    public void addElementTestGood() {
        int expected = 1;

        jlist.add(1);
        int actual = jlist.getSize();

        assertEquals(expected, actual);
    }

    @Test
    public void removeElementTestGood() {
        jlist.add(1);
        assertTrue(jlist.remove());
    }

    @Test
    public void removeElementEmptyGood() {
        assertFalse(jlist.remove());
    }

    @Test
    public void getElementTestGood() {
        Integer expected = 5;
        jlist.add(5);
        Integer response = (Integer) jlist.get();

        assertEquals(expected, response);
    }

    @Test
    public void getElementIndexTooLargeGood() {
        Integer seed = 5000;

        assertFalse(jlist.remove(seed));
    }

    @Test
    public void getElementIndexNegativeGood() {
        Integer seed = -1;

        assertFalse(jlist.remove(seed));
    }

    @Test
    public void getElementIndexGood() {
        Integer seed = 2;
        jlist.add("one");
        jlist.add("two");
        jlist.add("three");

        boolean response = jlist.remove(seed);

        if (response) {
            assertEquals(jlist.getSize(), 2);
        }
    }
}
