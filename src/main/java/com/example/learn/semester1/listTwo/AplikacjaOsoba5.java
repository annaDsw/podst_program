package com.example.learn.semester1.listTwo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class AplikacjaOsoba5 {
    PriorityQueue<Osoba> priorityQueue = new PriorityQueue<>();
    ArrayDeque<Osoba> kolejka = new ArrayDeque<>();


    public boolean zarejestruj(Osoba osoba) {
        return priorityQueue.add(osoba);
    }

    public void wywolajNastepnaOsobeIUsunZKolejki() {
        System.out.println("Prosimy: " + kolejka.pollFirst());
    }

    public void dodajDoKolejki(Osoba osoba) {
        kolejka.add(osoba);
    }
}

