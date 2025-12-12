package com.example;

public class Food{
    private int calories;
    private double protein;
    private double carbs;
    private double fat;
    private String name;
    private double servingSize;
    public Food(String name, int calories, double protein, double carbs, double fat, double servingSize){
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
        this.servingSize = servingSize;
    }

    public String getName(){
        return name;
    }
    public int getCalories(){
        return calories;
    }
    public double getProtein(){
        return protein;
    }
    public double getCarbs(){
        return carbs;
    }
    public double getFat(){
        return fat;
    }
    public double getServing(){
        return servingSize;
    }
}