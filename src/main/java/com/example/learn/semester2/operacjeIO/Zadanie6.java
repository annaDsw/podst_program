package com.example.learn.semester2.operacjeIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Zadanie6 {
    public void readFrom(URL url) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String oneLineFromFile;
        while((oneLineFromFile = bufferedReader.readLine()).contains("@") && !oneLineFromFile.contains("@media")) {
            System.out.println(oneLineFromFile);
        }
        bufferedReader.close();

    }
}
//        2.Napisz program, który ze strony internetowej o wskazanym adresie, wyświetla tylko te linie, które zawierają znak “@”, pod warunkiem że  nie występują w @media
//[Operacje wejścia-wyjścia + operacja na tekście].