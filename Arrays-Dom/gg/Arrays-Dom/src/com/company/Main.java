package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbersBefore = {1,2,3,4,5};
        int[] numbersAfter = new int[5];


        for(int i =0;i < numbersBefore.length;i++){
            numbersAfter[i] = i * numbersBefore[i];
        }
        System.out.println(Arrays.toString(numbersAfter));
    }
}
