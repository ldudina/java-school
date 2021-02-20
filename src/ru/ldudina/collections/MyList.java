package ru.ldudina.collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Ivanov");
        list1.add("Petrov");
        list1.add("Pushkin");
        list1.add("Beethoven");
        list1.add("Ivanov");

        List<String> list2 = new ArrayList<>();
        list2.add("Lermontov");
        list2.add("Pushkin");
        list2.add("Sidorov");
        list2.add("Dudina");
        list2.add("Ivanov");

        System.out.println(Collections.disjoint(list1, list2));

        list1.retainAll(list2);
        System.out.println(list1);

        }


}







