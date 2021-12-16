package com.company;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();


        switch (numberInput) {
            case 1: System.out.println((numberInput * 10) + numberInput); break;
            case 2: System.out.println((numberInput * 10) + numberInput); break;
            case 3: System.out.println((numberInput * 10) + numberInput); break;
            case 4: System.out.println((numberInput * 100) + numberInput); break;
            case 5: System.out.println((numberInput * 100) + numberInput); break;
            case 6: System.out.println((numberInput * 100) + numberInput); break;
            case 7: System.out.println((numberInput * 1000) + numberInput); break;
            case 8: System.out.println((numberInput * 1000) + numberInput); break;
            case 9: System.out.println((numberInput * 1000) + numberInput); break;
            default: System.out.println("Грешка");
        }
    }
}
