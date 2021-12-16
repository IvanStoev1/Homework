package com.company;

public class Dog {
    public static void main(String[] args){
    String ownerName = "Pesho";
    String dogName = "Georgi";
    String dogBreed = "German Shepherd";
    String color = "White";
    byte ageInDogYears = 35;
    byte ageInYears = 5;
    String gender = "Male";
    String scar = "A Cool Birthmark";
    String currentPartner = "Desi";
    String previousPartners = "Maria,Milena";
    byte kids = 4;
    String kidNames = "Penka,Hristinka,Daniel,Momchil";

    System.out.println("Owner:" + ownerName);
    System.out.println("Dog:" + dogName +"," + dogBreed +","+ color);
    System.out.println("Age:" + ageInYears + "," + "(dogYears)" + ageInDogYears);
    System.out.println("Gender:" + gender);
    System.out.println("Scars:" + scar);
    System.out.println("Partners:" + "(current)" + currentPartner + "," + "(previous)" + previousPartners);
    System.out.println("Kids:" + kids + "(" + kidNames + ")");

    }
}
