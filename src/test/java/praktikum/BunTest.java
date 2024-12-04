package praktikum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class BunTest {

    private Bun bun;

    @Before
    public void setUp() {
        bun = new Bun("Буханка", 50);
    }

    @Test
    public void testBunCreation() {
        assertNotNull(bun);
    }

    @Test
    public void testGetName() {
        String name = bun.getName();
        assertEquals("Буханка", name);
    }

    @Test
    public void testGetPrice() {
        float price = bun.getPrice();
        assertEquals(50, price, 0.001);
    }
}