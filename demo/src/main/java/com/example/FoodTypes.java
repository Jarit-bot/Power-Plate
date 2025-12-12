package com.example;


import java.util.ArrayList;

public class FoodTypes {

    public static ArrayList<Food> getAllFoods() {
        ArrayList<Food> list = new ArrayList<>();

        // Fruits
        list.add(new Food("Apple", 95, 0.5, 25.0, 0.3, 182));
        list.add(new Food("Strawberries", 32, 0.7, 7.7, 0.3, 100));
        list.add(new Food("Banana", 105, 1.3, 27.0, 0.3, 118));
        list.add(new Food("Blueberries", 85, 1.1, 21.0, 0.5, 148));
        list.add(new Food("Watermelon", 86, 1.7, 22.0, 0.2, 280));
        list.add(new Food("Grapes", 62, 0.6, 16.0, 0.3, 92));
        list.add(new Food("Mango", 99, 1.4, 25.0, 0.6, 165));
        list.add(new Food("Pear", 101, 0.6, 27.0, 0.3, 178));

        // Vegetables
        list.add(new Food("Broccoli", 55, 3.7, 11.0, 0.6, 148));
        list.add(new Food("Asparagus", 27, 3.0, 5.0, 0.2, 134));
        list.add(new Food("Bell Peppers", 31, 1.0, 6.0, 0.3, 92));
        list.add(new Food("Corn", 96, 3.4, 21.0, 1.5, 147));
        list.add(new Food("Avocado", 234, 3.0, 12.0, 21.0, 150));
        list.add(new Food("Carrot", 52, 1.2, 12.0, 0.3, 122));
        list.add(new Food("Spinach", 23, 2.9, 3.6, 0.4, 30));
        list.add(new Food("Sweet Potato", 112, 2.0, 26.0, 0.1, 130));
        list.add(new Food("Tomato", 22, 1.1, 5.0, 0.2, 90));

        // Grains
        list.add(new Food("Tortilla", 140, 4.0, 24.0, 3.0, 49));
        list.add(new Food("Cereal", 120, 3.0, 23.0, 1.0, 29));
        list.add(new Food("Rice", 205, 4.3, 45.0, 0.4, 158));
        list.add(new Food("Pasta", 200, 7.0, 42.0, 1.2, 140));
        list.add(new Food("Popcorn", 31, 1.0, 6.0, 0.4, 8));
        list.add(new Food("Crackers", 70, 1.0, 10.0, 4.0, 15));
        list.add(new Food("Bagel", 289, 11.0, 56.0, 2.0, 98));
        list.add(new Food("Oatmeal", 150, 5.0, 27.0, 3.0, 234));

        // Protein
        list.add(new Food("Eggs", 78, 6.0, 0.6, 5.0, 50));
        list.add(new Food("Tuna", 132, 28.0, 0.0, 1.0, 85));
        list.add(new Food("Hamburger", 250, 17.0, 0.0, 20.0, 100));
        list.add(new Food("Nuts", 607, 20.0, 21.0, 54.0, 100));
        list.add(new Food("Chicken", 165, 31.0, 0.0, 3.6, 100));
        list.add(new Food("Tofu", 76, 8.0, 1.9, 4.8, 85));
        list.add(new Food("Beans", 127, 9.0, 23.7, 0.5, 100));
        list.add(new Food("Salmon", 206, 22.0, 0.0, 12.0, 100));

        // Dairy
        list.add(new Food("Milk", 103, 8.0, 12.0, 2.4, 244));
        list.add(new Food("Yogurt", 59, 10.0, 3.6, 0.4, 100));
        list.add(new Food("Cheese", 113, 7.0, 1.0, 9.0, 28));
        list.add(new Food("Cottage Cheese", 98, 11.0, 3.4, 4.3, 113));
        list.add(new Food("Chocolate Milk", 208, 8.0, 26.0, 5.0, 244));

        return list;
    }
}
