package com.example.learn.semester2.list1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Kołowe extends Pojazd{
    private String rozmiarOpony;

    public Kołowe(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.rozmiarOpony = rozmiarOpony;
    }

    public Kołowe() {}

    public void uruchomSilnik(String rodzajSilnika) {
        System.out.println("uruchomiono silnik " + rodzajSilnika);
    }
}
//Zadanie 7
//Do klasy Kołowe dodaj metodę uruchomSilnik(String rodzajSilnika) która wypisze rodzaj uruchomionego silnika
// na podstawie przesłanej wartości do metody (np. uruchomiono silnik benzynowy, uruchomiono silnik elektryczny itp).