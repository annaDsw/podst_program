package com.example.learn.listThree.tablicePlusLosowanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NapisASCII7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner odczyt = new Scanner(new File("src/main/resources/NAPIS.txt"));
        Map<Integer, String> linesOfText = new HashMap<>();

        int counter = 0;
        while(odczyt.hasNextLine()) {
            linesOfText.put(counter, odczyt.nextLine());
            counter++;
        }
        odczyt.close();
        List<String> listOfGrowingTexts = new ArrayList<>();

        for(Map.Entry<Integer, String> entry : linesOfText.entrySet()) {
            char[] text = entry.getValue().toCharArray();
            boolean isGrowing = true;
            for(int i = 0; i < text.length-1; i++) {
                if(text[i] >= text[i+1]) {
                    isGrowing = false;
                    break;
                }
            }
            if(isGrowing)
                listOfGrowingTexts.add(entry.getValue());
        }

        System.out.println(listOfGrowingTexts.toString());

    }
}
/*
Napis rosnący to taki napis, w którym kod ASCII każdej kolejnej litery jest większy od kodu poprzedniej.
Podaj wszystkie napisy rosnące występujące w pliku NAPIS.TXT

http://www.maciejmuras.com/wp-content/uploads/2018/02/NAPIS.txt
 */