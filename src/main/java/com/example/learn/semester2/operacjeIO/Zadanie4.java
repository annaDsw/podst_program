package com.example.learn.semester2.operacjeIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Zadanie4 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://drive.google.com/uc?id=1dibOVmQIE8dwS7o_exsjQBFJiwWsnw2O&export=download");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        bufferedReader.skip(15464);
        System.out.println(bufferedReader.readLine());
    }
}
//W pliku napis.txt znajduje się ponad 1000 wierszy. Napisz program wczytujący wiersz tekstu rozpoczynający się od pozycji 15464.
//Program nie powinien wykorzystywać pętli, ale przenieść wskaźnik pliku do podanego w nim miejsca.