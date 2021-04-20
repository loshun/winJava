package com.tts;
import java.util.*;

public class MagicCalculator extends Main {
    public static void main(String[] args) {
        // menu on startup
        Scanner kb = new Scanner(System.in);

        System.out.println("Magic Calculator");

        System.out.println("\nHere are your options:");

        // this should be inherited from Calculator.java!
        System.out.println("\n1. Addition");
        System.out.println("\n2. Subtraction");
        System.out.println("\n3. Division");
        System.out.println("\n4. Multiplication");
        System.out.println("\n5. Square");

        // this is the new stuff that I need to create things for!
        System.out.println("\n6. Square Root");
        System.out.println("\n7. Trigonometry");
        System.out.println("\n8. Factorial");
        System.out.println("\n----------------------------------------------------------------------------------------------------");

        // PLEASE MAKE SURE TO PUT NUMBER INPUTS!!!!! WONT WORK IF YOU DON'T!
        System.out.print("\nWhat would you like to do? (choose the # for the option): ");
        int choice = kb.nextInt();
        System.out.println();

        // just call them, don't need to set up the methods, they are inherited!
        if (choice == 1) {
            Addition();
        } else if (choice == 2) {
            Subtraction();
        } else if (choice == 3) {
            Division();
        }
        if (choice == 4) {
            Multiplication();
        } else if (choice == 5) {
            Square();
        }
        // -------------------------------------NEW
        // STUFF-----------------------------------------------------------------------------------------------

        else if (choice == 6) {
            SquareRoot();
        }
        if (choice == 7) {
            Trigonometry();
        } else if (choice == 8) {
            Factorial();
        }

        System.out.println();
        kb.close();
    }

    // the different operations that you can do are below each divided into sections
    // -----------------------------------------------------------------------------------------------------------------------------------------------
    public static void SquareRoot() {

        int x;
        Scanner kb = new Scanner(System.in);

        System.out.println("SquareRoot");

        System.out.print("\nSquare Root of... ");
        x = kb.nextInt();

        kb.close();
        System.out.println("\nSquare Root: " + (Math.sqrt(x)));
    }
    // -----------------------------------------------------------------------------------------------------------------------------------------------

    public static void Trigonometry() {
        // This needs a submenu!
        // should say Degree or Radian, then depending on choice different operations!
        // I should be able to do this the same as the original menu....

        Scanner kb = new Scanner(System.in);

        System.out.println("Trigonometry");

        System.out.println("\nSelect a Mode:");

        // this should be inherited from Calculator.java!
        System.out.println("\n1. Radian");
        System.out.println("\n2. Degree");

        System.out.print("\nWhat would you like to do? (choose the # for the option): ");
        int choice = kb.nextInt();
        System.out.println();

        // just call them, don't need to set up the methods, they are inherited!
        if (choice == 1) {
            Radian();
        } else if (choice == 2) {
            Degree();
        }

        kb.close();
    }// ---------------------------------Submenu is Donezo-----------------
    //--------Need To Make These Methods!----------------------------------

    public static void Radian() {

        Scanner in = new Scanner(System.in);


        System.out.print("Which operation? (sin, cos, tan):");
        String operation = in.nextLine();
        switch (operation) {
            case "sin":
                System.out.print("What number do you want in the sin: ");
                System.out.println(Math.sin(in.nextInt()));
                break;
            case "cos":
                System.out.print("What number do you want in the cos: ");
                System.out.println(Math.cos(in.nextInt()));
                break;
            case "tan":
                System.out.print("What number do you want in the tan: ");
                System.out.println(Math.tan(in.nextInt()));
                break;
            default:
                break;
        }
        in.close();
    }
    // ------------------------------------------------------------------------------------------------------------------------------------------------

    public static void Degree() {

        Scanner in = new Scanner(System.in);

        System.out.println("Which operation? (sin, cos, tan):");

        String operation = in.nextLine();
        switch (operation) {
            case "sin":
                System.out.print("What number do you want in the sin: ");
                System.out.println(Math.sin(Math.toRadians(in.nextInt())));
                break;
            case "cos":
                System.out.print("What number do you want in the cos: ");
                System.out.println(Math.cos(Math.toRadians(in.nextInt())));
                break;
            case "tan":
                System.out.print("What number do you want in the tan: ");
                System.out.println(Math.tan(Math.toRadians(in.nextInt())));
                break;
            default:
                break;
        }
        in.close();
    }

    // ------------------------------------------------------------------------------------------------------------------------------------------------
    public static void Factorial() {

        int x;
        Scanner kb = new Scanner(System.in);

        System.out.println("Factorial");

        System.out.print("\nFactorial of... ");
        x = kb.nextInt();
        // nerd shiz, time to flex those brain muscles!
        // this while loop acts out or factorial function, beautiful.
        int fact = 1;
        int i = 1;
        while (i <= x) {
            fact = fact * i;
            i++;
        }

        kb.close();
        System.out.println("\nThe Factorial of " + x + " is " + fact);

    }

    // -----------------------------------------------------------------------------------------------------------------------------------------------

}



}
