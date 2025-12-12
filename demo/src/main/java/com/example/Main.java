package com.example;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        String food = "Chicken breast";
        String amount = "100g";
        String prompt = ("Generate the calories and macronutrient amounts of "+ food + "for " +amount + "in the form of just the integers in [calories, proteins, carbs, fats] format");
        GenerateContentResponse response = client.models.generateContent("gemini-2.5-flash", prompt, null);
        System.out.println(response.text());
    }
}