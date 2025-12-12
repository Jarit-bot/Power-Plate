package com.example;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static int totalcals;
    private static int totalprotein;
    private static int totalcarbs;
    private static int totalfat;
    public static void runFoodTracker(){
        Client client = new Client();
        Scanner input = new Scanner(System.in);
        System.out.print("Search for a food: ");
        String food = input.nextLine();
        System.out.println();
        System.out.print("Input the amount of " + food +": ");
        String amount = input.nextLine();
        String prompt = ("Generate the calories and macronutrient amounts of "+ food + "for " +amount + "in the form of just the integers in food,amount(include units),calories,proteins,carbs,fats format");
        GenerateContentResponse response = client.models.generateContent("gemini-2.5-flash", prompt, null);
        String[] macros = response.text().split(",");
        System.out.println("Food found:");
        System.out.println("Name: " + macros[0]);
        System.out.println("Serving: " + macros[1]);
        System.out.println("Calories: " + macros[2]);
        System.out.println("Protein: " + macros[3]);
        System.out.println("Carbs: " + macros[4]);
        System.out.println("Fat: " + macros[5]);
        
        ArrayList<Integer> Calories = new ArrayList<>();
        ArrayList<Integer> Protein = new ArrayList<>();
        ArrayList<Integer> Carbs = new ArrayList<>();
        ArrayList<Integer> Fat = new ArrayList<>(); 
        int cals = Integer.parseInt(macros[2]);
        Calories.add(cals);
        int protein = Integer.parseInt(macros[3]);
        Protein.add(protein);
        int carb = Integer.parseInt(macros[4]);
        Carbs.add(carb);
        int fats= Integer.parseInt(macros[5]);
        for(int c: Calories){
            totalcals +=c;
        }
        for(int p: Protein){
            totalprotein +=p;
        }
        for(int c: Carbs){
            totalcarbs +=c;
        }
        for(int f: Fat){
            totalfat +=f;
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
    
    
    public static void totalMacros(){
        System.out.println("Total Macros: ");
        System.out.println("Total Calories: " + totalcals);
        System.out.println("Total Protein: " + totalprotein);
        System.out.println("Total Carbs: " + totalcarbs);
        System.out.println("Total Fat: " + totalfat);

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
    
