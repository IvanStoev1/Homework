package com.company;


public class TaskTwo {
    public static void main(String[] args) {
        int[] arrayTwo = {3, 5, 8, 9, 4, 5, 2, 3, 20, 36};
        int max = arrayTwo[0];
        int secondMax = arrayTwo[0];


        for (int i = 0; i < arrayTwo.length; i++) {
            if (max < arrayTwo[i]) {
                max = arrayTwo[i];
            }
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            if (secondMax < arrayTwo[i] && arrayTwo[i] != max) {
                secondMax = arrayTwo[i];
            }
        }
        System.out.println(secondMax);
    }
}



