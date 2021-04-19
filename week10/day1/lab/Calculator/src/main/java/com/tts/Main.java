package com.tts;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        int ans;
        char op;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        num2 = scanner.nextInt();
        System.out.println("\nEnter an operator (+, -, *, /, ^): ");
        op = scanner.next().charAt(0);

        switch (op) {
            case '+': ans = num1 + num2;
            break;
            case '-': ans = num1 - num2;
            break;
            case '*': ans = num1 * num2;
            break;
            case '/': ans = num1 / num2;
            break;
            case '^': ans = num1 * num1;
            break;
            default:
                System.out.println("Error! Please Enter Correct Operator");
                return;
        }
        System.out.println("\nThe answer is:\n ");
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);

    }
}
