package ru.ldudina.ExceptionHomeTask.dishwasher;


import java.util.Collections;
import java.util.List;

public class Dishwasher {

    private boolean isEmpty = true;
    private boolean isWorking = false;
    private List<String> dishes = Collections.emptyList();
    private int capacity;
    private int numberOfLoadedDishes = 0;

    public Dishwasher(int capacity) {

        if (capacity < 0) {
            throw new IllegalArgumentException("Параметр вместимость не может быть отрицательным");
        }
        this.capacity = capacity;
    }

    /**
     *
     * @param dishes
     * @throws DishwasherException если машинка уже загружена
     */
    public void loadDishes(List<String> dishes) throws DishwasherException {

        if (!isEmpty) {
            throw new DishwasherException("Машинка уже загружена");
        }
        this.dishes = dishes;
        System.out.println("Посуда загружена");
        isEmpty = false;

    }

    public void wash() {
        System.out.println("Washing..." + dishes);

        if (!isWorking) {
            try {
                throw new DishwasherException("Нельзя выгрузить посуду. Машинка запущена.");
            } catch (DishwasherException e) {
                e.printStackTrace();
            }
        }
        this.dishes = dishes;
        System.out.println("Дождитесь пока машинка не закончит цикл стирки");
        isWorking = true;
    }


    public void getDishes()  {
        if (dishes.size() > 0) {
            System.out.println("Посуда выгружена: " + dishes);
            isEmpty = true;
            isWorking = false;
            dishes = Collections.emptyList();
        } else {
            System.out.println("Так ничего же и не загружено");
        }


    }
}




