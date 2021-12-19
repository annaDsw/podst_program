package com.example.learn.listOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kula5 {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        double r;
        System.out.println("Podaj promien");
        r = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Powierzchnia = " + (4 * Math.PI * Math.pow(r,2) ) );
        System.out.println("Objetosc = " + (4.0/3.0 * Math.PI * Math.pow(r,3) ) );
    }
}
