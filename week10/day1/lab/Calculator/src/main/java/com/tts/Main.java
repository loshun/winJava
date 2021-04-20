package com.tts;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.println("\nHere are your options:");
        System.out.println("\n1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. division");
        System.out.println("4. multiplication");
        System.out.println("5. square");

    //this is a bad question to ask seeing as they need to choose a number... I will specify this in MagicCalculator.java
        System.out.print("\nWhat would you like to do?: ");
    int choice = kb.nextInt();
        System.out.println();

        if (choice == 1) {
        Addition();
    } else if (choice == 2) {
        Subtraction();
    } else if (choice == 3) {
        Division();
    } else if (choice == 4) {
        Multiplication();
    } else if (choice == 5) {
        Square();
    }

        System.out.println();
        kb.close();
}

    public static void Addition() {

        int nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Addition");

        System.out.print("\nFirst Number: ");
        nOne = kb.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = kb.nextInt();

        kb.close();
        System.out.println("\nSum: " + nOne + " + " + nTwo + " = " + (nOne + nTwo));
    }

    public static void Subtraction() {
        int nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Subtraction");

        System.out.print("\nFirst Number: ");
        nOne = kb.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = kb.nextInt();

        kb.close();
        System.out.println("\nSum: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
    }

    public static void Division() {
        int nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Division");

        System.out.print("\nFirst Number: ");
        nOne = kb.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = kb.nextInt();

        kb.close();
        System.out.println("\nSum: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));
    }

    public static void Multiplication() {
        int nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Multiplication");

        System.out.print("\nFirst Number: ");
        nOne = kb.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = kb.nextInt();

        kb.close();
        System.out.println("\nSum: " + nOne + " x " + nTwo + " = " + (nOne * nTwo));
    }

    public static void Square() {

        int nOne;
        Scanner kb = new Scanner(System.in);

        System.out.println("Square");

        System.out.print("\nNumber: ");
        nOne = kb.nextInt();

        kb.close();
        System.out.println("\nSquared Value: " + nOne + " ^2 " + " = " + (nOne * nOne));
    }
}
