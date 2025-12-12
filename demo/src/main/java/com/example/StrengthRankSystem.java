package com.example;


import java.util.Scanner;

public class StrengthRankSystem{
    public static String getRank(double score){
        if (score < 1.5) return "Bronze";
        else if (score < 2.5) return "Silver";
        else if (score < 3.5) return "Gold";
        else if (score < 4.5) return "Platinum";
        else if (score < 5.5) return "Diamond";
        else return "Elite";
    }
    
    public static void runStrengthCalculator(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        System.out.print("Enter weight in lbs: ");
        double weightLbs = input.nextDouble();

        System.out.print("Enter max bench press (lbs): ");
        double bench = input.nextDouble();

        System.out.print("Enter max squat(lbs): ");
        double squat = input.nextDouble();

        System.out.print("Enter max deadlift (lbs): ");
        double deadlift = input.nextDouble();

        double totalLift = bench + squat + deadlift;

        System.out.print("Do you want to add other lifts? (y/n): ");
        if (input.next().equalsIgnoreCase("y")) {
            System.out.print("How many other lifts would you like to add? ");
            int extraCount = input.nextInt();

            input.nextLine();
            
        for (int i = 1; i <= extraCount; i++) {
            System.out.print("Enter lift " + i + " name: ");
            String liftName = input.nextLine();

            System.out.print("Enter max " + liftName + " (lbs): ");
            double accessoryLift = input.nextDouble();
            input.nextLine();

            System.out.println(liftName + " was logged but NOT added to the strength score.");
        }
    }
        double strengthScore = totalLift / weightLbs;

        String rank = getRank(strengthScore);

        System.out.println("\n--- Strength Rank Results ---");
        System.out.println("Your Height: " + height + " in");
        System.out.println("Your Weight: " + weightLbs + " lbs");
        System.out.println("Total Lift Weight: " + totalLift + " lbs");
        System.out.println("Your Strength Score: " + strengthScore + "!");
        System.out.println("You are in the " + rank + " Rank! Keep working out to improve!");

        

    
    boolean repeat;
    int action = MenuSystem.postToolMenu();
    if (action == 2){
        repeat = true;
        } else if (action == 1){
            repeat = false;
        } else {
            System.out.println("Exiting the program. Goodbye!");
            System.exit(0);
            return;
        }
        } 


}