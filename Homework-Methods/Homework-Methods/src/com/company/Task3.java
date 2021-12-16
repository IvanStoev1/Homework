package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(isThereAnyResidueLeft(a, b, c));

    }

    public static boolean isThereAnyResidueLeft(int a, int b, int c) {
        if (a % b == 0 && a % c == 0) {
            return true;
        }
        return false;
    }
}
