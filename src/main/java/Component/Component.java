package Component;

import Interfaces.ISell;

public abstract class Component implements ISell {

    private int priceSoldFor;
    private int priceBoughtFor;
    private String description;

    public Component(int priceSoldFor, int priceBoughtFor,
                     String description) {
        this.priceSoldFor = priceSoldFor;
        this.priceBoughtFor = priceBoughtFor;
        this.description = description;
    }
    public int calculateMarkup() {
        return this.priceSoldFor - this.priceBoughtFor;
    }


    public int getPriceSoldFor() {
        return priceSoldFor;
    }

    public void setPriceSoldFor(int priceSoldFor) {
        this.priceSoldFor = priceSoldFor;
    }

    public int getPriceBoughtFor() {
        return priceBoughtFor;
    }

    public void setPriceBoughtFor(int priceBoughtFor) {
        this.priceBoughtFor = priceBoughtFor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
