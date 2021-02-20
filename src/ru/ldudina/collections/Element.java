package ru.ldudina.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Element {
    public static void main(String[] args) {
        SortedSet<String> list1 = new TreeSet<String>();
        list1.add("Ivanov");
        list1.add("Petrov");
        list1.add("Pushkin");
        list1.add("Beethoven");
        list1.add("Ivanov");
        list1.add("Pushkin");


        String[] array = new String[list1.size()];
        list1.toArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Username: " + array[i]);

        }
    }
}
