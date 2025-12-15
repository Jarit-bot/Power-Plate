package com.example;

import java.util.Scanner;

public class WorkoutSuggestion {
    public static void runWorkoutSuggestion(){
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        input.nextLine();

        System.out.println("What is your main fitness goal?");
        System.out.println("1. Build Muscle");
        System.out.println("2.Lose Weight");
        System.out.println("3. Prepare for a Marathon");
        System.out.print("Choose 1, 2, 3: ");
        int goal = input.nextInt();
        input.nextLine();

        int baseCalories = (int)(weight * 15);
        int suggestedCalories = baseCalories;
        String plan = "";
        String goalName = "";

        if (goal == 1){
            goalName = "Build Muscle";
            suggestedCalories += 500;
            plan = "Strength training 4-5x per week with compound lifts (bench, squat, deadlift).";
        } else if (goal == 2){
            goalName = "Lose Weight";
            suggestedCalories -= 500;
            plan = "Combine cardio 3-4x per week with strength training 2-3x per week.";
        } else if (goal == 3){
            goalName = "Prepare for Marathon";
            plan = "Run 4-5 times per week, mix long runs with intervals, include core workouts.";

        } else {
            System.out.println("Invalid goal choice. Exiting");
            return;
        }

        System.out.println("\n--- Your Workout Suggestion ---");
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Goal: " + goalName);
        System.out.println("Suggested Daily Calories: " + suggestedCalories + " cal");
        System.out.println("Plan + " + plan);

        int action = MenuSystem.postToolMenu();
        if (action == 2) {
            runWorkoutSuggestion();
        } else if (action == 1) {
            return; 
        } else {
            System.out.println("Exiting program. Goodbye!");
            System.exit(0);
        }
    }
}
