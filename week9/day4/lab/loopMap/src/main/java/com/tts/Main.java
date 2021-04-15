package com.tts;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer sum = 0;
        int product = 1;
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a whole number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
            product *= numbers[i];
        }
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[4];
//        int maxValue = numbers[0];
//        for(int i=1;i < numbers.length;i++){
//            if(numbers[i] > maxValue){
//                maxValue = numbers[i];
//            }
//
//        int minValue = numbers[0];
//        for(int i=1;i<numbers.length;i++){
//            if(numbers[i] < minValue){
//                minValue = numbers[i];
//            }
        //  Print the array element
        for (int i : numbers) {
            System.out.print(i + ", ");
        }
        System.out.println("\nYour sum is: " + sum);
        System.out.println("\nYour product is: " + product);
        System.out.println("\nYour max value is: " + max);
        System.out.println("\nYour min value is: " + min);


        System.out.println("\n==== Hashmap ====");
        HashMap<String, String> carMap = new HashMap<>();
        carMap.put("Honda", "Accord");
        carMap.put("Range Rover", "Velar");
        carMap.put("Toyota", "Camry");
        carMap.put("Nissan", "Maxima");
        carMap.put("BMW", "I8");
        carMap.put("Audi", "S7");
        carMap.put("Maserati", "Levante");

        Scanner myScanner = new Scanner(System.in);
        String modelInput;
        System.out.println("Hi! What model car are you looking for? ");
        modelInput = myScanner.nextLine();

            String make = carMap.get(modelInput);
            if(make == null){
                System.out.println("Sorry, that's not in our inventory. Check back later!");
            } else {
                System.out.println("Awesome! We have that in our " + make + " section!");
            }
    }
}





