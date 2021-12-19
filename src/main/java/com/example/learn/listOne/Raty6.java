package com.example.learn.listOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Raty6 {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Podaj cene (max 50000)");
        double price = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Podaj liczbe rat (max 48)");
        int installment = Integer.parseInt(bufferedReader.readLine());

        double interest = 0;
        if(installment < 13)
            interest = 0.03;
        else if(installment < 25)
            interest = 0.06;
        else if(installment<49)
            interest = 0.1;
        else {
            System.out.println("Something went wrong! Look out for mistakes");
        }

        System.out.println("Miesieczna rata = " + (price + price*interest)/installment);
    }
}
