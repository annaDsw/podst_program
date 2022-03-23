package com.example.learn.semester1.listThree.tablicePlusLosowanie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Losowanie1 {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("We are going to draw a number.");
        System.out.println("Write down a min = ");
        int min = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Write down a max = ");
        int max = Integer.parseInt(bufferedReader.readLine());

        Random random = new Random();

        int result = random.nextInt(max-min+1)+min;
        System.out.println(result);
    }
}
//Wylosuj liczbę z podanego zakresu i wyświetl ją (zakres min i max wpisuje użytkownik)