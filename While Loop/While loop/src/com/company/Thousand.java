package com.company;

import java.util.Scanner;

public class Thousand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int c = 1;
        int res = 1;

        while (c <= res) {
            res = res * num;
            if (res < 1000) {
                System.out.println(res);
            }
            c++;
        }
    }
}

