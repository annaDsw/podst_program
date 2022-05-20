package com.example.learn.semester2.operacjeIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Zadanie5 {

    public void readFrom(URL url) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String oneLineFromFile;
        while((oneLineFromFile = bufferedReader.readLine()).contains("@")) {
            System.out.println(oneLineFromFile);
        }
        bufferedReader.close();

    }
}

//1.Napisz program, który ze strony internetowej o wskazanym adresie wyświetla tylko te linie, które zawierają znak “@”.
//        [Operacje wejścia-wyjścia + operacja na tekście].
