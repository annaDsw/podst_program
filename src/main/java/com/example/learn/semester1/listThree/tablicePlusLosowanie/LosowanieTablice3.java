package com.example.learn.semester1.listThree.tablicePlusLosowanie;

import java.util.Arrays;
import java.util.Random;

public class LosowanieTablice3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randomlySelectedNumbers = new int[6];

        for(int i = 0; i < 6; i++) {
            int newsDrawn = random.nextInt(50);
            randomlySelectedNumbers[i] = newsDrawn;
            System.out.println(randomlySelectedNumbers[i]);
            Arrays.sort(randomlySelectedNumbers);
            while(Arrays.binarySearch(randomlySelectedNumbers,newsDrawn) <0)
                newsDrawn = random.nextInt(50);
            randomlySelectedNumbers[i] = newsDrawn;
        }


    }
}
/*
Napisz program, który losuje 6  liczb z zakresu 1..49 (używając tablic), liczby nie mogą się powtarzać.
 */