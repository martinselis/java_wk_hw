package Shop;

import Interfaces.ISell;
import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<>();
    }

    public void addItem(ISell itemToAdd) {
        stock.add(itemToAdd);
    }

    public void removeItem(ISell itemToRemove) {
        this.stock.remove(itemToRemove);
    }

    public int getStockSize() {
        return stock.size();
    }
}
