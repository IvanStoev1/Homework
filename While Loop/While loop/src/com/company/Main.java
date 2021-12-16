package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n = scanner.nextInt();
        int c = 1;
        int res = 1;

        while (c <= n) {
            res = res * num;
            c++;
        }
        System.out.println(res);
    }
}
