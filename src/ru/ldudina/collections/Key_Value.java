package ru.ldudina.collections;

import java.util.Map;
import java.util.TreeMap;

public class Key_Value {
    public static void main(String[] args) {
        Map<Integer, String> sortedList1 = new TreeMap<>();
        sortedList1.put(23, "Ivanov");
        sortedList1.put(12, "Petrov");
        sortedList1.put(34, "Pushkin");
        sortedList1.put(45, "Beethoven");
        sortedList1.put(56, "Ivanov");
        sortedList1.put(67, "Pushkin");

        for (String value : sortedList1.values()) {
            System.out.println("Value = " + value);

        }
        System.out.println();


        for (Integer key : sortedList1.keySet()) {
            String value = sortedList1.get(key);
            System.out.println("Key = " + key + ", Value = " + value);

        }
        System.out.println();

        for (Map.Entry<Integer, String> entry : sortedList1.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ";" + " " + "Value = " + entry.getValue());
        }
    }
}




