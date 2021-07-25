package com.task.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Algorithms {

    private static final int ARRAY_SIZE = 10;
    private static final int ARRAY_VALUE_FROM = 10;
    private static final int ARRAY_VALUE_TO = 100;
    private static final int TASK_CONDITION = 7;
    private static final int DIVISOR = 3;
    private static final String SPACE_STRING = " ";

    public static void main(String[] args) {

        // task ¹1
        int digit = scannerInt();
        algoritmFirstTask(digit);

        // task ¹2
        String string = scannerLine();
        algoritmSecondTask(string);

        System.out.println();

        // task ¹3
        int[] array = new Random().ints(ARRAY_SIZE, ARRAY_VALUE_FROM, ARRAY_VALUE_TO).toArray();
        Arrays.stream(array).filter(value -> value % DIVISOR == 0)
                .forEach(value -> System.out.print(value + SPACE_STRING));
    }

    private static void algoritmFirstTask(int digit) {
        if (digit > TASK_CONDITION) {
            System.out.println("Hello");
        }
    }

    private static void algoritmSecondTask(String string) {
        if (string.equals("Vyacheslav")) {
            System.out.println("Hello, Vyacheslav");
        } else {
            System.out.println("No such name");
        }
    }

    private static int scannerInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the digit: ");
        return scanner.nextInt();
    }

    private static String scannerLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string: ");
        return scanner.nextLine();
    }
}
