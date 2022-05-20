package com.example.learn.semester2.operacjeIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Zadanie2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://drive.google.com/uc?id=1OjMq0iTSZj9wrjcZapcNjtoW1vENzWBW&export=download");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        int sum = 0;
        String oneLineFromFile;
        while((oneLineFromFile = bufferedReader.readLine()) != null) {
            for(int i=0; i < oneLineFromFile.length(); i+=2) {
                sum += Character.getNumericValue(oneLineFromFile.charAt(i));
            }
        }
        bufferedReader.close();
        System.out.println(sum);
    }
}
// W pliku dane1.txt znajdują się liczby typu int. Napisz program, który wczyta dane z pliku i wyświetli ich sumę.