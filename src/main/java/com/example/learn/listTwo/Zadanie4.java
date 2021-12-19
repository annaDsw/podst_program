package com.example.learn.listTwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zadanie4 {
    public static void main(String[] args) throws java.lang.Exception {
        List<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(new Osoba(95228L, "Ania", "Nowak", 29, "adres1", 1));
        listaOsob.add(new Osoba(4355L, "Asia", "Nikt", 22, "adres2", 2));
        listaOsob.add(new Osoba(5353L, "Jozef", "Ptak", 4, "adres4", 1));
        listaOsob.add(new Osoba(2424L, "Zosia", "Spiewak", 11, "adres1", 1));
        listaOsob.add(new Osoba(55553L, "Kamil", "Mazurek", 3, "adres3", 2));
        listaOsob.add(new Osoba(2214L, "Dawid", "Kowalski", 44, "adres6", 1));
        listaOsob.add(new Osoba(3329L, "Kamil", "Nowak", 1, "adres5", 2));

        Iterator<Osoba> iterator = listaOsob.iterator();
        while (iterator.hasNext()) {
            Osoba osoba = iterator.next();
            if(osoba.getImie().startsWith("A"))
                iterator.remove();
        }
        System.out.println(listaOsob);
    }
}