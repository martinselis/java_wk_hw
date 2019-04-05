import Component.Drumsticks;
import Enums.InstrumentType;
import Instruments.Drums;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DrumsTest {

    private Drums drums;

    @Before
    public void setup() {
        Drumsticks drumsticks = new Drumsticks(50, 100, "Drumsticks");
        drums = new Drums(100, 80, "Cool drums",
                "Wood", "Blue", InstrumentType.percussion, drumsticks);
    }

    @Test
    public void canGetPriceSoldFor() {
        assertEquals(100, drums.getPriceSoldFor());
    }

    @Test
    public void canGetPriceBoughtFor() {
        assertEquals(80, drums.getPriceBoughtFor());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Cool drums", drums.getDescription());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", drums.getMaterial());
    }

    @Test
    public void canGetColor() {
        assertEquals("Blue", drums.getColor());
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.percussion, drums.getType());
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("playing drums", drums.play());
    }

    @Test
    public void canGetDrumsticks() {
        assertNotNull(drums.getDrumsticks());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(20, drums.calculateMarkup());
    }

}
