package com.company;

import java.util.Scanner;

public class Main {
    public static float INVALID_INPUT = Float.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();
        float result = 0;
        switch (options) {
            case 1:
                result = changeTheDigits();
                break;
            case 2:
                result = getAverage();
                break;
            case 3:
                result = solveEquation();
                break;
            default:
                System.out.println("Invalid input");
        }
        if (result == INVALID_INPUT){
            System.out.println("Invalid input");
        } else {
            System.out.println("Result: " + result);
        }
    }

    public static float changeTheDigits() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int newNumber = 0;
        if (a >= 0) {
            while (a != 0) {
                int digit = a % 10;
                newNumber = newNumber * 10 + digit;
                a = a / 10;
            }
            return newNumber;
        }
        return INVALID_INPUT;
    }

    public static float getAverage() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 0 && b > 0) {
            return (a + b) / 2.0f;
        }
        return INVALID_INPUT;
    }

    public static float solveEquation() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = 0;
        if (a != 0) {
            x = b / a;
            return x;
        }
        return INVALID_INPUT;
    }
}
