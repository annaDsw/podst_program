package com.example.learn.semester1.listOne;

import java.util.stream.IntStream;

public class Sorting4 {
    public static void main(String[] args) {

        IntStream.of(0,2,4,-1).sorted().forEach(System.out::println);

    }
}
