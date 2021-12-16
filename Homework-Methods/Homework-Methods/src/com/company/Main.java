package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(isTheResidueTheSame(a , b));


    }
    public static boolean isTheResidueTheSame(int a,int b){
        if(a % 3 == b % 3){
            return true;
        }
        return false;
    }
}