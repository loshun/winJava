package com.tts;
import java.util.Random;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Integer modelYear;
        Integer randNum;
        boolean favQb;
        int jerseyNum = 0;
        Scanner kb = new Scanner(System.in);
        String userName = "";
        String response = "";
        boolean keepGoing = false;
        // Establish our program's legitimacy by printing to console
        System.out.println("Hello world!");
        // Display the valid input characters
        AsciiChars.printNumbers();
        AsciiChars.printLowerCaseLetters();
        AsciiChars.printUpperCaseLetters();
        // Ask for the user's name and display it
        System.out.println("\nWhat is your name?");
        System.out.print("Name: ");
        userName = kb.nextLine();
        System.out.println("Hello, " + userName);
        // Ask if user wants to begin the interactive portion
        System.out.println("Would you like to continue to the interactive zone?");
        System.out.print("(Y/N): ");
        response = kb.nextLine();
//        If they don't wish to continue
        if (response.contains("n") || response.contains("N")) {
            keepGoing = false;
            System.out.println("Please complete survey later!");
        }
//        To continue survey
        else if (response.contains("y") || response.contains("Yes")) {
            keepGoing = true;
        } else {
            System.out.println("Error");
        }
//        System.out.println("Will we keep going: " + keepGoing);  // For debugging
        do {
            System.out.println("Let's generate some numbers!");
            // Question: Red Car
            System.out.println("Do you have a red car? (yes, no): ");
            String redCar = kb.nextLine();
            boolean redCarBool = false;
            if (redCar.contains("y") || redCar.contains("Yes")) {
                redCarBool = true;
            } else {
                redCarBool = false;
            }
//            Q: Favorite Pet
            System.out.println("What's is the name of your favorite pet? (Must be at least 3 letters): ");
            String favPet = kb.next();
//            // Q: Age of Pet
            System.out.println("Age of your favorite pet?: ");
            Integer agePet = kb.nextInt();
//            // Q: Fav num
            System.out.println("What is your lucky number?: ");
            Integer luckyNum = kb.nextInt();
//            =====================================================================
            // Do you have a fav quarterback if so jersey number
//            System.out.println("Do you have a favorite quarterback?: ");
//
//            if (favQuarter.contains("y") || favQuarter.contains("Yes")) {
//                System.out.println("What is their Jersey number?: ");
//                Integer jerseyNum = kb.nextInt();
//                favQb= true;
//            } else if (favQuarter.contains("n") || favQuarter.contains("N")) {
//                Random jerseyNumRand = rand;
//                System.out.println("Random number has been chosen for you.");
//            } else {
//                System.out.println("Error");
//                break;
//            }
//            ==========================================================================
//            Random jerseyNumRand;
//            String favQuarter = kb.nextLine();
            System.out.println("Do you have a favorite quarterback? (y/n)");
            String favQuarter = kb.next();
//            Integer jerseyNum = kb.nextInt();
            if (favQuarter.contains("y") || favQuarter.contains("Yes")) {
                favQb = true;
                System.out.println("What is your favorite quarterback's jersey number?");
                jerseyNum = kb.nextInt();
            } else {
                favQb = false;
                System.out.println("\nRandom number has been chosen for you.");
            }
//            =============================
            do{ System.out.println("What is the 2 digit model year of your car?: ");
                modelYear = kb.nextInt();}
//
            while(modelYear > 99);
//            ============================
//                // Q: Fav Act
            System.out.println("What is name of your favorite actor/actress?: ");
            String favAct = kb.next();
//                Q: Pick a number
            System.out.println("Pick a random number between 1 and 50: ");
            randNum = kb.nextInt();
            if (randNum > 0 && randNum < 51) {
                keepGoing = true;
            } else {
                System.out.println("Error");
            }
//        =========================================================================================
            // Generating output :
            Random rand = new Random();
            int magicballNumber;
            int rand1 = rand.nextInt(50);
            System.out.println(rand1);
            int rand2 = rand.nextInt(50);
            int rand3 = rand.nextInt(50);
            if((rand.nextInt(2) == 1) && (jerseyNum != 0) ) {
                // choose the jersey number else choose the lucky number
                magicballNumber = jerseyNum + rand1;
            }
            else{
                magicballNumber = luckyNum * rand1;
            }
            if(magicballNumber > 75){
                // substract 75 from it
                do{ magicballNumber = magicballNumber - 75;}
                while(magicballNumber > 75);
            }
            //    generate other 5 numbers
            int number1 , number2, number3, number4, number5;
            // choosing the options =  modelnumber + luckynumber
            number1 =  modelYear + luckyNum;
            // checking if the numbers are in range
            if(number1>65)
                number1 = number1 - 65;
            if(number1<1)
                number1 = number1 + 65;
            // choosing the options =  random numbers between 1 and 50 and subtract rand2
            number2 =  rand2 - rand.nextInt(50);
            // checking if the numbers are in range
            if(number2>65)
                number2 = number2 - 65;
            if(number2<1)
                number2 = number2 + 65;
            // choosing the options =  use a value 42
            number3 =  42;
            // choosing the options = age of the favorite pet + model year
            number4 =  agePet + modelYear;
            // checking if the numbers are in range
            if(number4>65)
                number4 = number4 - 65;
            if(number4<1)
                number4 = number4 + 65;
            // choosing the options =  first letter of favorite act
            number5 =  (int)favAct.charAt(0);
            // checking if the numbers are in range
            if(number5>65)
                number5 = number5 - 65;
            if(number5<1)
                number5 = number5 + 65;
            System.out.print("\nLottery numbers : ");
            System.out.print(number1+", ");
            System.out.print(number2+", ");
            System.out.print(number3+", ");
            System.out.print(number4+", ");
            System.out.print(number5+", ");
            System.out.print(" Magic ball: "+magicballNumber);
            System.out.println("\nIf you like to answer question to generate another set of numbers, (yes ,no)? :");
            String continueOption = kb.next();
            if(continueOption.equals("y"));
            else {
                System.out.println("\nPlease return later to complete the survey");
                keepGoing = false;
            }
        }while (keepGoing);
    }
}