package com.example.learn.listOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloYou1 {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException  {
        System.out.print("Podaj imie: ");
        String name = bufferedReader.readLine();
        System.out.println("Hello " + name + "!");
    }
}
