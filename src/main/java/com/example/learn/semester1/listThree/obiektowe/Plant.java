package com.example.learn.semester1.listThree.obiektowe;

public class Plant {
    private String name;
    private double maxHeight;
    private boolean likesLight;
    private boolean blooms;
    private String family;
    private boolean likesHumidity;
    private boolean needsSprinkling;
    private boolean itCanBeAHousePlant;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, boolean likesLight, boolean likesHumidity, boolean needsSprinkling, boolean itCanBeAHousePlant) {
        this.name = name;
        this.likesLight = likesLight;
        this.likesHumidity = likesHumidity;
        this.needsSprinkling = needsSprinkling;
        this.itCanBeAHousePlant = itCanBeAHousePlant;
    }

    public Plant(String name, double maxHeight, boolean likesLight, boolean blooms, String family, boolean likesHumidity, boolean needsSprinkling, boolean itCanBeAHousePlant) {
        this(name, likesLight, likesHumidity, needsSprinkling,itCanBeAHousePlant);
        this.maxHeight = maxHeight;
        this.blooms = blooms;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public boolean isLikesLight() {
        return likesLight;
    }

    public void setLikesLight(boolean likesLight) {
        this.likesLight = likesLight;
    }

    public boolean isBlooms() {
        return blooms;
    }

    public void setBlooms(boolean blooms) {
        this.blooms = blooms;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public boolean isLikesHumidity() {
        return likesHumidity;
    }

    public void setLikesHumidity(boolean likesHumidity) {
        this.likesHumidity = likesHumidity;
    }

    public boolean isNeedsSprinkling() {
        return needsSprinkling;
    }

    public void setNeedsSprinkling(boolean needsSprinkling) {
        this.needsSprinkling = needsSprinkling;
    }

    public boolean isItCanBeAHousePlant() {
        return itCanBeAHousePlant;
    }

    public void setItCanBeAHousePlant(boolean itCanBeAHousePlant) {
        this.itCanBeAHousePlant = itCanBeAHousePlant;
    }


}
/*
Zaproponuj temat, który nadawałby się na utworzenie klasy (z wyjątkiem: Osoba, Pracownik, Auto).
Utwórz klasę posiadającą przynajmniej 6 pól różnego typu.

2. Do klasy utwórz przynajmniej 3 konstruktory.

3. Skróć zapis przynajmniej jednego konstruktora by wywoływał inny konstruktor przez this

4. Utwórz metody dostępowe (getter, setter) dla pól klasy.

5.  Utwórz 6 obiektów, wywołując różne konstruktory (nie zawsze znamy wartości pól obiektów w momencie ich tworzenia).

6,  Ustaw za pomocą settera wartości pól, które nie były znane w momencie wywoływania konstruktora.
 */