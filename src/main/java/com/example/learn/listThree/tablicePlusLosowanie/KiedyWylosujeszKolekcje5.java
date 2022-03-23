package com.example.learn.listThree.tablicePlusLosowanie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class KiedyWylosujeszKolekcje5 {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Give me 6 unique numbers separated by coma from 0 to 49");
        String[] numbers = bufferedReader.readLine().split(",");
        List<Integer> numbersToDraw = Arrays.stream(numbers).map(Integer::parseInt).collect(Collectors.toList());

        double counter = 0;
        Random random = new Random();

        while (numbersToDraw.size() != 0) {
            counter++;
            Integer drawnNumber = random.nextInt(50);
            numbersToDraw.remove(drawnNumber);
        }

        int years = (int) (counter/365.0);
        int daysWithoutYears = (int) (counter%365);
        System.out.println(years + " years and " + daysWithoutYears + " days.");
    }
}
/*
Z ZASTOSOWANIEM KOLEKCJI: Napisz program, który pobiera od użytkownika 6 liczb z puli 49.
Program ma wziąć pod  uwagę zestaw unikalnych sześciu liczb.
Następnie program dokonuje losowań do czasu gdy wylosuje wybrane przez użytkownika zestawienie liczb.
Program podaje po ilu latach i ilu dniach użytkownik wylosowałby liczby (np. potrzeba x lat i x dni).
Zakładamy że losowania odbywają się codziennie (jedno losowanie na jeden dzień). *
 */