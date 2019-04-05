import Component.Drumsticks;
import Enums.InstrumentType;
import Instruments.Drums;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Drums drums;

    @Before
    public void setup() {
        shop = new Shop();
        Drumsticks drumsticks = new Drumsticks(50, 100, "Drumsticks");
        drums = new Drums(100, 80, "Cool drums",
                "Wood", "Blue", InstrumentType.percussion, drumsticks);
        shop.addItem(drums);
    }

    @Test
    public void canAddItemsToStock() {
        Drumsticks drumsticks = new Drumsticks(50, 100, "Drumsticks");
        Drums drums2 = new Drums(100, 80, "Cool drums",
                "Wood", "Blue", InstrumentType.percussion, drumsticks);
        shop.addItem(drums2);
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void canRemoveItemsFromStock() {
        shop.removeItem(drums);
        assertEquals(0, shop.getStockSize());
    }
}
