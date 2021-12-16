package com.company;

import java.util.Random;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(20) + 1;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        int m;
        boolean correct = false;

        while(correct == false){
            System.out.println("Guess the random number between 1 and 20: ");
            m = scanner.nextInt();
            c++;

            if(n == m){
                correct = true;
            }
            else if (n < m){
                System.out.println("Your answer is too high");
            }
            else if (n > m){
                System.out.println("Your answer is too low");
            }
        }
        System.out.println("You guessed right: " + n);
    }
}