package com.example.learn.listThree.tablicePlusLosowanie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;


public class KiedyWylosujesz4 {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Give me 6 unique numbers separated by coma from 0 to 49");
        String[] numbers = bufferedReader.readLine().split(",");

        double counterOfDays = 0;
        Random random = new Random();
        int counterOfGuessedNumber = 0;
        Arrays.sort(numbers);

        while (counterOfGuessedNumber < 6) {
            counterOfDays++;
            String drawnNumber = String.valueOf(random.nextInt(50));
            int indexOfNumber = Arrays.binarySearch(numbers, drawnNumber);
            if(indexOfNumber >= 0) {
                counterOfGuessedNumber++;
                System.out.println("GuessedNumbwe vcounter"+counterOfGuessedNumber);
                numbers[indexOfNumber] = "50";
            }
        }
        int years = (int) (counterOfDays/365.0);
        int daysWithoutYears = (int) (counterOfDays%365);
        System.out.println(years + " years and " + daysWithoutYears + " days.");
    }
}
/*
Napisz program, który pobiera od użytkownika 6 liczb z puli 49. Program ma wziąć pod  uwagę zestaw unikalnych sześciu liczb.
 Następnie program dokonuje losowań do czasu gdy wylosuje wybrane przez użytkownika zestawienie liczb.
  Program podaje po ilu latach i ilu dniach użytkownik wylosowałby liczby (np. potrzeba x lat i x dni).
Zakładamy że losowania odbywają się codziennie (jedno losowanie na jeden dzień). * (z zastosowanie tablic)
 */