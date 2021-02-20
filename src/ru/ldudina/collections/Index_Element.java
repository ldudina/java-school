package ru.ldudina.collections;

import java.util.ArrayList;
import java.util.List;

public class Index_Element {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Ivanov");
        list1.add("Petrov");
        list1.add("Pushkin");
        list1.add("Beethoven");
        list1.add("Ivanov");
        list1.add("Pushkin");


        String[] array = new String[list1.size()];
        list1.toArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index:" + i + ";" + " " + "Element: " + array[i]);


        }
    }
}