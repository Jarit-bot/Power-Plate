package com.example;
import java.util.Scanner;
public class BMICalculator {
    public static void runBMI() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();

        double bmi = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is: %.2f%n", bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
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
        } //while (repeat);
    }
    
