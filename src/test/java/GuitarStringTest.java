import Component.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    private GuitarString guitarString;

    @Before
    public void setup() {
        guitarString = new GuitarString(100, 500, "Cool String");
    }


    @Test
    public void canGetPriceSoldFor() {
        assertEquals(100, guitarString.getPriceSoldFor());
    }

    @Test
    public void canGetPriceBoughtFor() {
        assertEquals(500, guitarString.getPriceBoughtFor());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Cool String", guitarString.getDescription());
    }
}
