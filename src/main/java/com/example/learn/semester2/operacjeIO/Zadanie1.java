package com.example.learn.semester2.operacjeIO;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Zadanie1 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://drive.google.com/uc?id=1OjMq0iTSZj9wrjcZapcNjtoW1vENzWBW&export=download");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String oneLineFromFile;
        while((oneLineFromFile = bufferedReader.readLine()) != null) {
            System.out.println(oneLineFromFile);
        }
        bufferedReader.close();
    }
}
//1. Wczytaj dane z pliku tekstowego dane1.txt i wyświetl je na ekranie.
//https://drive.google.com/open?id=1OjMq0iTSZj9wrjcZapcNjtoW1vENzWBW