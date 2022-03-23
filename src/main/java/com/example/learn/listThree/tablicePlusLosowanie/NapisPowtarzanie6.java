package com.example.learn.listThree.tablicePlusLosowanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NapisPowtarzanie6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner odczyt = new Scanner(new File("src/main/resources/NAPIS.txt"));
        Map<Integer, String> linesOfText = new HashMap<>();

        int counter = 0;
        while(odczyt.hasNextLine()) {
            linesOfText.put(counter, odczyt.nextLine());
            counter++;
        }
        odczyt.close();
        List<String> listOfReappearingTexts = new ArrayList<>();

        for(Map.Entry<Integer, String> entry : linesOfText.entrySet()) {
            for(Map.Entry<Integer, String> entry2 : linesOfText.entrySet()) {
                if(entry.getValue().equals(entry2.getValue()) && !entry.getKey().equals(entry2.getKey()))
                    listOfReappearingTexts.add(entry.getValue());
            }
        }
        System.out.println(listOfReappearingTexts.toString());

    }
}
/*
W pliku NAPIS.TXT, w oddzielnych wierszach, znajduje się 1 000 napisów o długościach od 2 do 25 znaków.
 Każdy napis składa się z wielkich liter alfabetu łacińskiego. Wypisz napisy z pliku NAPIS.TXT,
 które występują w nim więcej niż jeden raz (każdy taki napis wypisz tylko raz).


import java.util.*;
import java.io.*;
public class Main {
public static void main(String[] args ) throws FileNotFoundException{
   String wiersz;
Scanner odczyt = new Scanner(new File ("plik.txt"));
while(odczyt.hasNextLine())
        {
           wiersz=odczyt.nextLine();
 System.out.println(wiersz);
}
odczyt.close();

 */
