package Instruments;

import Enums.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements ISell, IPlay {

    private int priceSoldFor;
    private int priceBoughtFor;
    private String description;
    private String material;
    private String color;
    private InstrumentType type;

    public Instrument(int priceSold, int priceBought, String description, String material,
                      String color, InstrumentType type) {
        this.priceSoldFor = priceSold;
        this.priceBoughtFor = priceBought;
        this.description = description;
        this.material = material;
        this.color = color;
        this.type = type;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public int calculateMarkup() {
        return this.priceSoldFor - this.priceBoughtFor;
    }

}
