package com.example.learn.semester2.operacjeIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Zadanie7 {
    public void readFrom(URL url) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        bufferedReader.lines()
                .filter(line -> line.matches(".+@.+\\.pl") || line.matches(".+@.+\\.com"))
                .forEach(System.out::println);
    }
}
// 1.Napisz program, który ze strony internetowej o wskazanym adresie, wyszuka i wypisze adresy e-mail [Operacje wejścia-wyjścia + wyrażenia regularne].