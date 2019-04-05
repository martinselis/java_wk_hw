import Component.GuitarString;
import Enums.InstrumentType;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setup() {
        GuitarString string = new GuitarString(100, 50, "guitar strings");
        GuitarString string2 = new GuitarString(100, 50, "guitar strings");
        ArrayList<GuitarString> strings = new ArrayList<>();
        strings.add(string);
        strings.add(string2);
        guitar = new Guitar(100, 80, "Cool guitar",
                "Wood", "Blue", InstrumentType.string, strings);
    }

    @Test
    public void canGetPriceSoldFor() {
        assertEquals(100, guitar.getPriceSoldFor());
    }

    @Test
    public void canGetPriceBoughtFor() {
        assertEquals(80, guitar.getPriceBoughtFor());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Cool guitar", guitar.getDescription());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetColor() {
        assertEquals("Blue", guitar.getColor());
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.string, guitar.getType());
    }

    @Test
    public void canGetGuitarStrings() {
        assertNotNull(guitar.getGuitarStrings());
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("playing guitar", guitar.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(20, guitar.calculateMarkup());
    }

}
