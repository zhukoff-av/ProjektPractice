package com.company.prep;

import java.util.Arrays;

public class Enum {

    enum Title {
        MR("Mr. "), MS("Ms. ");
        private String title;

        Title(String s) {
            title = s;
        }

        public String format(String first, String last) {
            return title + " " + first + " " + last;
        }
    }

    enum Title2{
        Dr;
        private Title t;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Title.values()));
        System.out.println(Title.valueOf("MS"));

        System.out.println(Title.MR.ordinal());
        System.out.println(Title.MS.name());
    }
}
