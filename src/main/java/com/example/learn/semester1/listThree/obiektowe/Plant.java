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
Zaproponuj temat, kt??ry nadawa??by si?? na utworzenie klasy (z wyj??tkiem: Osoba, Pracownik, Auto).
Utw??rz klas?? posiadaj??c?? przynajmniej 6 p??l r????nego typu.

2. Do klasy utw??rz przynajmniej 3 konstruktory.

3. Skr???? zapis przynajmniej jednego konstruktora by wywo??ywa?? inny konstruktor przez this

4. Utw??rz metody dost??powe (getter, setter) dla p??l klasy.

5.  Utw??rz 6 obiekt??w, wywo??uj??c r????ne konstruktory (nie zawsze znamy warto??ci p??l obiekt??w w momencie ich tworzenia).

6,  Ustaw za pomoc?? settera warto??ci p??l, kt??re nie by??y znane w momencie wywo??ywania konstruktora.
 */