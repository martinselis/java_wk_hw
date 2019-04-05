package Instruments;

import Component.GuitarString;
import Enums.InstrumentType;
import Interfaces.IPlay;

import java.util.ArrayList;

public class Guitar extends Instrument implements IPlay {

    private ArrayList<GuitarString> guitarStrings;

    public Guitar(int priceSold, int priceBought, String description, String material,
                  String color, InstrumentType type, ArrayList<GuitarString> guitarStrings) {
        super(priceSold, priceBought, description, material, color, type);
        this.guitarStrings = guitarStrings;
    }

    public String play() {
        return "playing guitar";
    }

    public ArrayList<GuitarString> getGuitarStrings() {
        return this.guitarStrings;
    }

}
