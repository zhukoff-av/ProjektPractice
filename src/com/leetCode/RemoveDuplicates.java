package com.leetCode;

public class RemoveDuplicates {

    /**
     * Remove Duplicates from Sorted Array
     * <p>
     * nums is passed in by reference. (i.e., without making a copy)
     * int len = removeDuplicates(nums);
     * <p>
     * any modification to nums in your function would be known by the caller.
     * using the length returned by your function, it prints the first len elements.
     * for (int i = 0; i < len; i++) {
     * print(nums[i]);
     */

    public static int removeDuplicates(int arr[]) {
        // Return, if array is empty
        // or contains a single element
        int n = arr.length;

        if (n == 0 || n == 1)
            return n;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }

    /**
     * Approach 2
     */

    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        int n = removeDuplicates(arr);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
