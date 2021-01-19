package com.jr;

public class CharCount {

    private static String word = "QQQ ouygv  b19834yru104f  hj1o34f";

    /**
     * Digit Char Counter
     * Character.isDigit(char)
     */
    public static int countCharAsInt(String string) {
        int count = 0;
        for (int i = 1; i <= string.length() - 1; i++) {
            char ch = string.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Letter Char Counter
     * Character.isLetter(char)
     */
    public static int countLetters(String string) {
        int count = 0;
        for (int i = 1; i <= string.length() - 1; i++) {
            char ch = string.charAt(i);
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Space Char Counter
     * Character.isSpaceChar(char)
     */
    public static int countSpaces(String string) {
        int count = 0;
        for (int i = 1; i <= string.length() - 1; i++) {
            char ch = string.charAt(i);
            if (Character.isSpaceChar(ch)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCharAsInt(word));
        System.out.println(countLetters(word));
        System.out.println(countSpaces(word));
    }
}
