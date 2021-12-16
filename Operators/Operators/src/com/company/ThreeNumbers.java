package com.company;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean canItBeATriangle = ((a + b > c) && (a + c > b) && (c + b > a));

        System.out.println(canItBeATriangle);
    }
}
