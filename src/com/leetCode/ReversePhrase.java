package com.leetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversePhrase {

    public static class ReverseWords {
        public String reverseWords(String phrase) {
            List<String> wordList = Arrays.asList(phrase.split("[ ]"));
            Collections.reverse(wordList);

            StringBuilder sbReverseString = new StringBuilder();
            for (String word : wordList) {
                sbReverseString.append(word + " ");
            }

            return sbReverseString.substring(0, sbReverseString.length() - 1);
        }
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords("Hello World"));
    }
}