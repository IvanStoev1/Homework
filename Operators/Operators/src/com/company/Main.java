package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int capacity = console.nextInt();
        boolean hasLights = console.nextBoolean();

        boolean isCapacityEnough = capacity >= 35000;
        boolean enoughForAGroupLicense = isCapacityEnough || hasLights;

        System.out.println("Има лиценз за А група: " + enoughForAGroupLicense);
    }
}
