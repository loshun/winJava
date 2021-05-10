package com.tts;

public class Main {

    public static int displaySum(int a, int b) {
        return a + b;

    }

    public static void printFirstItem(int[] items) {
        System.out.println(items[0]);
    }

    public static void printAllItems(int[] items) {
        for (int item: items) {
            System.out.println(item);
        }
    }

    public static void printAllPossibleOrderedPairs(int[] items) {
        for (int firstItem : items) {
            for (int secondItem : items) {
                System.out.println(firstItem + ", " + secondItem);
            }
        }
    }

    public static void sayHiNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("hi");
        }
    }

    public static void main(String[] args) {
        System.out.println(displaySum(3, 7));

        int[] intArr = {1, 2, 3, 4, 5};
        printFirstItem(intArr);
        printAllItems(intArr);
        printAllPossibleOrderedPairs(intArr);
        sayHiNTimes(50);

    }
}
