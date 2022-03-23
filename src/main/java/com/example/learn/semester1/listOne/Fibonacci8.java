package com.example.learn.semester1.listOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci8 {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Podaj N = ");
        int n = Integer.parseInt(bufferedReader.readLine());

        if(n==0)
            System.out.println("-,-");
        else if(n==1)
            System.out.println(0);
        else {
            System.out.println(0 + "\n" + 1);
            long numberOne = 0L;
            long numberTwo = 1L;
            long result;
            for(int i = 0; i < n-2; i++) {
                result = numberOne + numberTwo;
                numberOne = numberTwo;
                numberTwo = result;
                System.out.println(result);
            }
        }



    }
}
