package com.tts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void nestedFors(){
        outer:
        for (int i = 0; i < 10; i++) {

            System.out.println("index for outer loop: " + i);

            inner:
            for (int j = 1; j < 10; j++){

                System.out.println("index for outer loop: " + j);

                if (j % 2 == 0) {
                    break outer;
                }
            }
        }
    }

    public static void loopAndBreak(){

        Random random = new Random();
        int breakAt = random.nextInt(100);

        for(int i=0; i<100; i++) {
            if ( i==breakAt) {
                System.out.println("Random number was: " + breakAt);
                break;
            }

            if (i != 0 && i % 2 == 0) {
                continue;
            }
            
            System.out.println("At index: " + i);
        }
        System.out.println("After the loop...");
    }


    public static String returnArg(String arg){
        return arg;
    }

    public static int returnNum(int arg){
        return arg;
    }

    public static void returnNothing(){
        int x = 4;
        x++;
        //the two lines above would be ignored because nothing is being returned
        System.out.println("This method does not return a value.");
    }

    public static void printShirtSize(char shirt)
    {
        String msg= " " ;
        switch(shirt)
        {
            case 's':
                msg= "Shirt is small";
                break;
            case 'm':
                msg= "Shirt is medium";
                break;
            case 'l':
                msg= "Shirt is large";
                break;
            case 'x':
                msg= "Shirt is Xtra large";
                break;
            default:
                msg= "Unknown shirt size";
                break;
//      you can use an arrow message (in version 14 or higher) it would be written like this
//      case 'x' -> msg = "unknown shirt size";
        }
        System.out.println(msg);

    }


    public static void CheckId( boolean validId, int age, boolean buyingAlc ) {
        if (validId) {
            System.out.println("Valid ID presented");
            if ((age >= 21) && (buyingAlc)) {
                System.out.println("Customer legal to purchase alcohol");
            } else {
                System.out.println("No alchol for you!");
            }
        } else {
            System.out.println("Error: Invalid Id!");
        }
    }

    public static void main(String[] args) {


        boolean myBool = true;

        if (myBool) {
            System.out.println("Hello from conditional!");
        }

        int count = 44;
        if (count > 20) {
            String msg = "Count is large!";
            System.out.println(msg);
        }

        if (count > 50) {
            String msg = "Count is VERY large!";
            System.out.println(msg);
        }
        System.out.println("Finished checking count.");

        CheckId(true, 25, true);

        int myInt = 30;
        if (myInt < 20) System.out.println("Print true!");

        printShirtSize('m');

        for(int i = 0; i < 5 ; i++)
        {
            System.out.println("Loop number: " + i + " I am in a for loop!");
        }

        for(int i = 20; i > 1 ; i--)
        {
            System.out.println("Counting down!");
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please give me a number!");
//        int inputNumber = scanner.nextInt();
        //this allows input to be entered in the array

        List<Integer> myList = new ArrayList<>();
        //int[] myArray = {1, 44, 53 53}; -- writing it this way prohibits the array from being dynamic & adding to it later
        myList.add(1);
        myList.add(432);
        myList.add(321);

        for (Integer element: myList){
            System.out.println("This is my element: " + element);
        }


        while (myBool) {
            System.out.println("Hello from inside a while loop!");
            myBool = false;
        }

        do {
            System.out.println("Hello from inside a do-while loop!");
        } while (myBool);

       String returnValue =  returnArg("This is from a return statement inside of a method");
       System.out.println(returnValue);
       returnNothing();

       loopAndBreak();
       nestedFors();

    }
}
