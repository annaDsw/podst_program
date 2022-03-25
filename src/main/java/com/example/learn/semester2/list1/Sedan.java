package com.example.learn.semester2.list1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Sedan extends Osobowy{
    private String model;
    private String symbol;

    public Sedan(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, int ilośćOsób) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, ilośćOsób);
    }

    public Sedan() {
    }
}
//Zadanie 9
//Do klasy Sedan dodaj pola: model, symbol