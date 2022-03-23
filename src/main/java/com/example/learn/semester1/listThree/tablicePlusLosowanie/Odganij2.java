package com.example.learn.semester1.listThree.tablicePlusLosowanie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Odganij2 {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("We are going to draw a number form 0 to 50. You have to guess it.");
        boolean guessed = false;

        Random random = new Random();
        int number = random.nextInt(51);

        int counter = 0;
        while (!guessed) {
            counter++;
            System.out.println("What is your guess?");
            int guess = Integer.parseInt(bufferedReader.readLine());
            if(guess == number) {
                guessed = true;
                System.out.println("You guessed it!!! It took you " + counter + " trials.");
            } else if(guess < number)
                System.out.println("not enough");
            else
                System.out.println("too much");
        }

    }
}
/*
Napisz program,  który losuje liczbę. Użytkownik ma za zadanie odgadnąć liczbę wylosowaną przez komputer
z określonego zakresu. Program ma podpowiadać “za dużo”, “za mało” lub “odgadłeś za “+liczba_prób+”razem”.
 */