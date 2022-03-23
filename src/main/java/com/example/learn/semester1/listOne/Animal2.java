package com.example.learn.semester1.listOne;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Animal2 {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private static String name;
    private static String surname;
    private static int age;
    private static String sex;
    private static String colorOfEyes;
    private static double weight;
    private static int height;
    private static String favouriteColor;


    public static void main(String[] args) throws IOException {
        System.out.println("Imie");
        name = bufferedReader.readLine();
        System.out.println("Nazwisko");
        surname = bufferedReader.readLine();
        System.out.println("Wiek");
        age = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Plec");
        sex = bufferedReader.readLine();
        System.out.println("Kolor oczu");
        colorOfEyes = bufferedReader.readLine();
        System.out.println("Waga");
        weight = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Wzrost");
        height = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Ulubiony kolor");
        favouriteColor = bufferedReader.readLine();

        System.out.println("Name: " + name + " " + surname + "\n" +
                "Age: " + age + "\n" + "Sex: " + sex + "\n" +
                "Color of eyes: " + colorOfEyes + "\n" +
                "Weight: " + weight + "\n" + "Height: " + height + "\n" +
                "Favourite color: " + favouriteColor);
    }
}
