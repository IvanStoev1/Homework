package com.company;

import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        int[] arr3 = {1, 2, 3, 4, 5, 1};
        int[] arr4 = {4, 10, 2, 6, 20};
        int[] result4 = commonElements(arr3, arr4);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println("Common Elements");
        System.out.println(Arrays.toString(result4));
    }

    public static int[] commonElements(int[] arr3, int[] arr4) {
        int count = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (arr3[i] == arr4[j]) {
                    count++;
                }
            }
        }
        int[] array = new int[count];
        int common = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (arr3[i] == arr4[j]) {
                    array[common] = arr3[i];
                    common++;
                }
            }
        }
        return array;
    }
}
