package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 1;
        int sum = 0;

        while (c <= n/2) {
            if (n % c == 0) {
                sum = sum + c;
            }
            c++;
        }
        if (sum == n) {
            System.out.println("The number is perfect");

        } else {
            System.out.println("The number is not perfect");
        }
    }
}
