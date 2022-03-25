package com.example.learn.semester2.list1;

public class Czołg extends Gąsienicowe{
    public void uruchomSilnik() {
        super.uruchomSilnik();
        System.out.println("Jest to czołg");
    }
}
//Zadanie 12
//Dodaj do metody uruchomSilnik() w klasie Gąsienicowe słowo final,
// sprawdź co się stanie gdy dodasz metodę uruchomSilnik() do klasy Czołg.
//Dostajemy błąd! Nie da się przesłonić metody final