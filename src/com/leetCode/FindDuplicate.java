package com.leetCode;

import java.util.Arrays;

public class FindDuplicate {

    /**
     * *
     * Approach 1
     */

    public boolean findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) return true;
            }
        }
        return false;
    }

    /**
     * *
     * Approach 2
     */

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] input = new int[]{1, 2, 3, 1};
        FindDuplicate d = new FindDuplicate();
        System.out.println("Result: " + d.findDuplicate(input));
    }

}
