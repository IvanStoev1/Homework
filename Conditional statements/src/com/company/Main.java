package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if ((n - 21) < 21) {
            System.out.println(Math.abs(n - 21));
        } else if ((n -21) > 21){
            System.out.println(Math.abs((n - 21) * 2));
        }
    }
}
