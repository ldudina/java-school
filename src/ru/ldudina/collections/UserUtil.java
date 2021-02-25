package ru.ldudina.collections;
import ru.ldudina.collections.User;

import java.util.*;

// содержит вспомогательные методы для работы с пользователем

public class UserUtil {
    public static List<User> createFirstList() {
        List<User> list1 = new ArrayList();
        list1.add(new User("Ivanov", 25));
        // User user1 = new User("Ivanov", 25);
        list1.add(new User("Petrov", 52));
        list1.add(new User("Pushkin", 23));
        list1.add(new User("Beethoven", 34));
        list1.add(new User("Ivanov", 25));
        return list1;
    }


    public static List<User> createSecondList() {
        List<User> list2 = new ArrayList();
        list2.add(new User("Lermontov", 35));
        list2.add(new User("Pushkin", 23));
        list2.add(new User("Sidorov", 31));
        list2.add(new User("Dudina", 18));
        list2.add(new User("Ivanov", 25));
        return list2;
    }

    public static List<User> compareLists(List<User> list1, List<User> list2) {
        List<User> result = new ArrayList<>();
        for (User user : list1) {
            if (list2.contains(user)) result.add(user);
        }
        return result;
    }

    public static Set<User> createFirstSet() {
        Set<User> set1 = new HashSet<>();
        set1.add(new User("Ivanov", 25));
        // User user1 = new User("Ivanov", 25);
        set1.add(new User("Petrov", 52));
        set1.add(new User("Pushkin", 23));
        set1.add(new User("Beethoven", 34));
        set1.add(new User("Ivanov", 25));
        return set1;
    }


    public static Set<User> createSecondSet() {
        Set<User> set2 = new HashSet<>();
        set2.add(new User("Lermontov", 35));
        set2.add(new User("Pushkin", 23));
        set2.add(new User("Sidorov", 31));
        set2.add(new User("Dudina", 18));
        set2.add(new User("Ivanov", 25));
        return set2;
    }

    public static Set<User> compareSets(Set<User> set1, Set<User> set2) {
        Set<User> result = new HashSet<>();
        for (User user : set1) {
            if (set2.contains(user)) result.add(user);
        }
        return result;
    }

    public static Map<Integer, User> createMap() {
        Map<Integer, User> map = new TreeMap();
        map.put(1, new User("Ivanov", 25));
        map.put(2, new User("Petrov", 52));
        map.put(3, new User("Petrov", 52));
        return map;
    }
}


