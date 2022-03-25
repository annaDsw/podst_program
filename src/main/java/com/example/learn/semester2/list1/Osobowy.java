package com.example.learn.semester2.list1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Osobowy extends Kołowe{
    private int ilośćOsób;

    public Osobowy(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, int ilośćOsób) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.ilośćOsób = ilośćOsób;
    }

    public Osobowy() {}
}
