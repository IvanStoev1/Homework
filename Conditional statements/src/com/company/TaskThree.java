package com.company;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        switch (n){
            case 1: System.out.println("a + b = " + (a +b));
            case 2: System.out.println("a - b = "+ (a - b));
            case 3: System.out.println("b - 1 = " +(b - 1));
            case 4: System.out.println("a * b = " + (a * b));
            case 5: System.out.println("a / b = " + (a / b));
            case 6: System.out.println("a / b = " + (b / a));
        }
    }
}
