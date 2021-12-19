package com.example.learn.listTwo;

import java.util.*;

public class Sety2 {
    public static void main(String[] args) {

        Integer[] liczby1 = {1,5,2,24,54,22};
        Integer[] liczby2 = {2,4,45,66,33,54};

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        Collections.addAll(hashSet, liczby1);
        Collections.addAll(treeSet, liczby2);

        Iterator<Integer> iterator = hashSet.iterator();
        int howManyRepeatedNumbers = 0;
        List<Integer> repeatedNumber = new ArrayList<>();
        while(iterator.hasNext()) {
            int liczba = iterator.next();
            if(treeSet.contains(liczba)) {
                howManyRepeatedNumbers++;
                repeatedNumber.add(liczba);
            }

        }
        System.out.println("How many repeated numbers: " + howManyRepeatedNumbers);

        //suma
        System.out.println("HashSet " + hashSet);
        hashSet.addAll(Arrays.asList(liczby2));
        System.out.println("HashSet after addAll " + hashSet);
        hashSet.removeAll(Arrays.asList(liczby2));
        hashSet.addAll(repeatedNumber);
        System.out.println("HashSet, back to normal " + hashSet);

        //czesc wspolna
        hashSet.retainAll(treeSet);
        System.out.println("HashSet after retainAll " + hashSet);

        //roznica
        hashSet.removeAll(treeSet);
        System.out.println("HashSet after removeAll " + hashSet);
    }
}

