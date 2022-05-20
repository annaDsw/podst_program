package com.example.learn.semester2.operacjeIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;

public class Zadanie3 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://drive.google.com/uc?id=1zxu3v3KnZjIdhOJM-y32sOQKirAh8Hhe&export=download");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        bufferedReader.lines().forEach(System.out::println);

    }
}
//Wczytaj w całości zawartość pliku dane2.txt i wyświetl go na ekranie (nie używając do tego pętli i podejście sekwencyjnego wprowadzania danych).
//https://drive.google.com/uc?id=1zxu3v3KnZjIdhOJM-y32sOQKirAh8Hhe&export=download