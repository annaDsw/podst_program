package com.example.learn.listOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator7 {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Co mam policzyc?");
        String equation = bufferedReader.readLine();


        if(equation.contains("+")) {
            String[] arrOfStr = equation.split("[+]");
            System.out.println(Double.parseDouble(arrOfStr[0]) + Double.parseDouble(arrOfStr[1]));
        } else if(equation.contains("-")) {
            String[] arrOfStr = equation.split("[-]");
            System.out.println(Double.parseDouble(arrOfStr[0]) - Double.parseDouble(arrOfStr[1]));
        } else if(equation.contains("/")) {
            String[] arrOfStr = equation.split("[/]");
            System.out.println(Double.parseDouble(arrOfStr[0]) / Double.parseDouble(arrOfStr[1]));
        } else if(equation.contains("*")) {
            String[] arrOfStr = equation.split("[*]");
            System.out.println(Double.parseDouble(arrOfStr[0]) * Double.parseDouble(arrOfStr[1]));
        } else
            System.out.println("Nie znam takiego dzialania!!!");
    }
}
