package com.example;


import java.util.ArrayList;
import java.util.Scanner;

public class FoodTracker {
    public static void runFoodTracker() {
        Scanner input = new Scanner(System.in);
        ArrayList<Food> foods = FoodTypes.getAllFoods();

        System.out.print("Search for a food: ");
        String search = input.nextLine().toLowerCase();

        boolean found = false;
        for (Food f : foods){
            if (f.getName().toLowerCase().contains(search)){
                found = true;
                System.out.println("\nFood found:");
                System.out.println("Name: " + f.getName());
                System.out.println("Calories: " + f.getCalories());
                System.out.println("Protein: " + f.getProtein());
                System.out.println("Carbs: " + f.getCarbs());
                System.out.println("Fat: " + f.getFat());
                System.out.println("Serving Size: " + f.getServing() + "g\n");
        }
    }

    if (!found) {
        System.out.println("\nNo food matched your search.\n");
        }
    }
}