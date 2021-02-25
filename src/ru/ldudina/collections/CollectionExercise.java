package ru.ldudina.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExercise {
    public static void main(String[] args) {
        //Exc.1
        List<User> list1 = UserUtil.createFirstList();
        List<User> list2 = UserUtil.createSecondList();
        List<User> result = UserUtil.compareLists(list1, list2);
        System.out.println(result);

        //Exc.2
        Set<User> set1 = UserUtil.createFirstSet();
        Set<User> set2 = UserUtil.createSecondSet();
        Set<User> resultSet = UserUtil.compareSets(set1, set2);
        System.out.println(resultSet);

        //Exc.3
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Index:" + i + ";" + " " + "Element: " + list1.get(i));
        }

        //Exc.4
        for (User user : set1) {
            System.out.println("Element: " + user);
        }

        //Exc.5
        Map<Integer, User> map = UserUtil.createMap();

        //Exc.5a
        for (User value : map.values()) {
            System.out.println("Value = " + value);
        }

        //Exc.5b
        for (Integer key : map.keySet()) {
            System.out.println("Key = " + key + ", Value = " + map.get(key));
        }

        //Exc.5c
        for (Map.Entry<Integer, User> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }


    }
}







