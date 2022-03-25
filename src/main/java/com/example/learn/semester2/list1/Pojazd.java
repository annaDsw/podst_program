package com.example.learn.semester2.list1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//private class Pojazd {
//class Pojazd {
public class Pojazd {
    private int rokProdukcji;
    private String rodzajSilnika;
    private String kolor;
    private int masa;

    public void uruchomSilnik() {
        System.out.println("Silnik uruchomiono");
    }
}
//Zadanie 4
//Do klasy Pojazd do metody uruchomSilnik() dodaj kod wyświetlający napis “Silnik uruchomiono”.


//Zadanie 13
//Sprawdź wpływ dodania słowa private przed klasą Pojazd.
//Odp.:
//Klasa nie może być private (wyjątek: nested class)

//Zadanie 15/16
//Sprawdź zachowanie programu w sytuacji gdy klasa Pojazd nie będzie posiadała informacji
//o modyfikatorze dostępu(modyfikator pusty).
//Przypisz do klas wspólny pakiet (package) sprawdź zachowanie programu w sytuacji
// gdy klasa Pojazd nie będzie posiadała informacji o modyfikatorze dostępu (modyfikator pusty)
//Odp.:
//Usunięcie modyfikatora nic nie zmienia, ponieważ wszystkie klasy należą do tego samego pakietu