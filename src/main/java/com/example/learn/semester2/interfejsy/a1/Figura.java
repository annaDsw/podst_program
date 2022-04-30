package com.example.learn.semester2.interfejsy.a1;

public class Figura implements Rysowanie{
    @Override
    public void rysuj2D() {
        System.out.println("Rysuje figure w 2D");
    }

    @Override
    public void rysuj3D() {
        System.out.println("Rysuje figure w 3D");
    }
}
