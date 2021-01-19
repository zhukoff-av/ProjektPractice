package com.jr;

public class CharCount2 {

    public static int countDigits(String string) {
        long countDigits = string.chars()
                .filter(Character::isDigit)
                .count();

        return (int) countDigits;
    }

    public static int countLetters(String string) {
        long countLetters = string.chars()
                .filter(Character::isLetter)
                .count();

        return (int) countLetters;
    }

    public static int countSpaces(String string) {
        long countSpaces = string.chars()
                .filter(Character::isSpaceChar)
                .count();

        return (int) countSpaces;
    }

    public static void main(String[] args) {

    }
}
