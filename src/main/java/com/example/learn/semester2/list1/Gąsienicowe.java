package com.example.learn.semester2.list1;

public class Gąsienicowe extends Pojazd{

    //public final void uruchomSilnik() {
    //protected void uruchomSilnik() {
    public  void uruchomSilnik() {
        super.uruchomSilnik();
        System.out.println("Jest to pojazd gąsienicowy");
    }
}
//Zadanie 6
//Do klasy Gąsienicowe dodaj własną metodę uruchomSilnik(),
// wewnątrz której wywołaj metodę z klasy nadrzędnej (Pojazd), następnie wyświetl tekst “Jest to pojazd gąsienicowy”.

//Zadanie 14
//Dodaj słowo protected zamiast private z zadania 12 i sprawdź wpływ na uruchomiony program.
//Odp.:
//Nie możemy zostawić protected, ponieważ metody kolidują ze sobą, nie można przez to przysłonić metody w klasie Czołg