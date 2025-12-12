package com.example;


import java.util.Scanner;

public class MenuSystem {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do{
            printMenu();
            choice = getChoice();

            if(choice == 1){
            System.out.println("Strength Calculator selected.");
            StrengthRankSystem.runStrengthCalculator();
           }
           else if (choice == 2){
            System.out.println("BMI Calculator selected.");
            BMICalculator.runBMI();

           }
           else if (choice == 3){
            System.out.println("Food Tracker selected.");
            Main.runFoodTracker();
           }
           else if(choice == 4){
            System.out.println("Total Macros selected.");
            Main.totalMacros();
           }
           else if(choice == 5){
            System.out.println("Workout Suggestion selected.");
            //WorkoutSuggestion.runWorkoutSuggestion();
           }
           else if(choice == 6){
            System.out.println("Thank you for choosing PowerPlate!");
            
           }
           
           else{
            System.out.println("Invalid choice. Try again");
           }
        } while (choice != 5);
        input.close();
    }
        private static void printMenu(){
            System.out.println("\n==== MAIN MENU ===");
            System.out.println("1. Strength Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Food Tracker");
            System.out.println("4. Total Macros");
            System.out.println("5. Custom Lift Input");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
        }
        private static int getChoice(){
            while (!input.hasNextInt()){
                System.out.print("Please enter a number: ");
                input.nextLine();
            }
            int choice = input.nextInt();
            input.nextLine();
            return choice;
        }
        public static int postToolMenu(){
            System.out.println("\n==== TOOL MENU ===");
            System.out.println("(Type in what you would like to do!)");
            System.out.println("1. Return to Main Menu");
            System.out.println("2. Repeat this tool");
            System.out.println("3. Exit program");
            while (!input.hasNextInt()){
                System.out.print("Please enter a number: ");
                input.nextLine();
            }
            int choice = input.nextInt();
            input.nextLine();
            return choice;
}
}


    


