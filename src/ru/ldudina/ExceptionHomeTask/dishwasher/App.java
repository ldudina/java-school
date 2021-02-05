package ru.ldudina.ExceptionHomeTask.dishwasher;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Dishwasher dishwasher = new Dishwasher(5);

        ArrayList<String> dishes = new ArrayList<String>();
        dishes.add("Тарелка");
        dishes.add("Ложка");
        dishes.add("Нож");

        try {
            dishwasher.loadDishes(dishes);
            dishwasher.loadDishes(dishes);
        } catch (DishwasherException e) {
            System.out.println("Что-то пошло не так");
            e.printStackTrace();
        }
        dishwasher.wash();
        try {
            dishwasher.getDishes();
        } catch (Exception e) {
            e.printStackTrace();
        }

        dishwasher.getDishes();


    }
}
