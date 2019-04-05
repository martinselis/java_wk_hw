import Component.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    private Drumsticks drumsticks;

    @Before
    public void setup() {
        drumsticks = new Drumsticks(100, 500, "Cool drumstick");
    }


    @Test
    public void canGetPriceSoldFor() {
        assertEquals(100, drumsticks.getPriceSoldFor());
    }

    @Test
    public void canGetPriceBoughtFor() {
        assertEquals(500, drumsticks.getPriceBoughtFor());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Cool drumstick", drumsticks.getDescription());
    }
}
