package com.jr;

public class CharAsDigitLetterSpace {


    static String string = "s57d 64857fi6o8g7ihonu   ljbo  ";

    public static int charIsDigit(String s) {

        long countDigitInString = s.chars()
                .filter(Character::isDigit)
                .count();
        return (int) countDigitInString;
    }

    public static void main(String[] args) {
        System.out.println(charIsDigit(string));
    }
}
