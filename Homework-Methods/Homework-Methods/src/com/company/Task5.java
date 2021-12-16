package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(isItALeapYear());

    }
    public static boolean isItALeapYear(){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0){
            return true;
        } else {
            return false;
        }
    }
}
