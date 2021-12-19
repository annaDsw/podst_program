package com.example.learn.listTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Losowanie3 {
    public static void main(String[] args) throws java.lang.Exception {
        //wygeneruj Y losowych liczb
        int y = 10;
        //generuj z przedziału 1-X
        int x = 15;
        Map<Integer,Integer> wynikiLosowania = new HashMap<>();
        Random random = new Random();

        for(int i = 0; i < y; i++) {
            int pomocnicza = 0;
            while(pomocnicza == 0) {
                pomocnicza = random.nextInt(x+1);
            }
            if(wynikiLosowania.containsKey(pomocnicza)){
                wynikiLosowania.put(pomocnicza, wynikiLosowania.get(pomocnicza)+1);
            }
            else
                wynikiLosowania.put(pomocnicza,1);
        }
        System.out.println(wynikiLosowania);
    }
}
