package com.example.learn.listThree.obiektowe;

public class PlantApplication {
    public static void main(String[] args) {
        Plant maranta = new Plant("Maranta", 1.5, false, true, "marantowate", true, true, true);
        Plant monsteraMonkey = new Plant("Monstera Monkey");
        Plant humata = new Plant("Humata", false, true, true, true);
        Plant fikus = new Plant("Fikus");
        Plant starzecRowleya = new Plant("Starzec Rowleya");
        Plant trzykrotka = new Plant("trzykrotka");

        trzykrotka.setItCanBeAHousePlant(true);;
        starzecRowleya.setLikesLight(true);
        fikus.setItCanBeAHousePlant(true);
        monsteraMonkey.setItCanBeAHousePlant(true);
        monsteraMonkey.setLikesHumidity(true);

    }
}
/*

5.  Utwórz 6 obiektów, wywołując różne konstruktory (nie zawsze znamy wartości pól obiektów w momencie ich tworzenia).

6,  Ustaw za pomocą settera wartości pól, które nie były znane w momencie wywoływania konstruktora.
 */