package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(isItTheLetterVowel());
    }

    public static boolean isItTheLetterVowel() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        boolean isItTheLetterVowel;

        char vowel = text.charAt(0);
        if ((vowel == 121 || vowel == 97) || (vowel == 101) || (vowel == 111) || (vowel == 117)) {
            isItTheLetterVowel = true;
        } else {
            isItTheLetterVowel = false;
        }

        return isItTheLetterVowel;
    }
}

