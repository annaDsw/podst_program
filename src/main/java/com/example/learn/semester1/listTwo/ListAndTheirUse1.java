package com.example.learn.semester1.listTwo;

import java.util.*;

public class ListAndTheirUse1 {

    public static void main(String[] args) throws java.lang.Exception {

        List<String> names = new LinkedList<>();
        names.add("Ann");
        names.add("Karol");
        names.add("Eustachy");
        names.add("Lucja");
        names.add("Zuzanna");
        names.add("Jacek");
        names.add("Piotr");
        names.add("Weronika");
        names.add("Edmund");
        names.add("Anastazja");

        System.out.println("Displaying names");
        for (String name:names) {
            System.out.print(name + ", ");
        }
        System.out.println();

        System.out.println("\n" + "Displaying names with index: 0,1,2,7,8,9");
        System.out.println(names.get(0) + ", " + names.get(1) + ", " +
                names.get(2) + ", " + names.get(7) + ", " + names.get(8) + ", " + names.get(9));

        System.out.println("\n" + "Displaying names with new name at index 5");
        names.add(5, "NewName");
        for (String name:names) {
            System.out.print(name + ", ");
        }
        System.out.println();

        names.remove(10);
        names.remove(9);
        names.remove(8);
        names.remove(2);
        names.remove(1);
        names.remove(0);

        System.out.println("\n" + "Displaying names after deleting");

        for (String name:names) {
            System.out.print(name + ", ");
        }

        List<String> listNrTwo = new ArrayList<>();
        listNrTwo.add("Kasia");
        listNrTwo.add("Basia");
        listNrTwo.add("Bartek");
        listNrTwo.add("Zosia");
        listNrTwo.add("Mateusz");
        listNrTwo.add("Julia");

        for (String name: listNrTwo) {
            names.add(name);
        }
        System.out.println();

        Collections.sort(names);
        System.out.println("\n" + "Sorted list");
        for (String name:names) {
            System.out.print(name + ", ");
        }
        System.out.println();

        System.out.println("\n" + "Sorted list in opposite order");
        Collections.reverse(names);
        for (String name:names) {
            System.out.print(name + ", ");
        }
        System.out.println();
    }

}
