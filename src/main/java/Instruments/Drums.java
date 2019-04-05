package Instruments;

import Component.Drumsticks;
import Enums.InstrumentType;
import Interfaces.IPlay;

public class Drums extends Instrument implements IPlay {

    private Drumsticks drumsticks;
    public Drums(int priceSold, int priceBought, String description, String material,
                 String color, InstrumentType type, Drumsticks drumsticks) {
        super(priceSold, priceBought, description, material, color, type);
        this.drumsticks = drumsticks;
    }

    public String play() {
        return "playing drums";
    }

    public Drumsticks getDrumsticks() {
        return this.drumsticks;
    }
}
