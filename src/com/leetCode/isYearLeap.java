package com.leetCode;

public class isYearLeap {
    public boolean isYearLeap(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year != 100)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        isYearLeap obj = new isYearLeap();

        System.out.println("2019: " + obj.isYearLeap(2019));
        System.out.println("2020: " + obj.isYearLeap(2020));
    }
}
