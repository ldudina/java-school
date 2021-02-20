package ru.ldudina.collections;

import java.util.*;

public class MyList_1 {
    public static void main(String[] args) {
        SortedSet<String> list1 = new TreeSet<String>();
        list1.add("Ivanov");
        list1.add("Petrov");
        list1.add("Pushkin");
        list1.add("Beethoven");
        list1.add("Ivanov");

        SortedSet<String> list2 = new TreeSet<>();
        list2.add("Lermontov");
        list2.add("Pushkin");
        list2.add("Sidorov");
        list2.add("Dudina");
        list2.add("Ivanov");


        list1.retainAll(list2);
        System.out.println(list1);

    }
}
