package com.example.learn.listOne;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class findTheBiggest3 {

    public static void main(String[] args) {

        OptionalInt biggestOne = IntStream.of(0,2,4,-1).max();
        biggestOne.ifPresent(System.out::println);
    }
}
