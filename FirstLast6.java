package com.codegnan.arrays;

public class FirstLast6 {

	    public static boolean firstLast6(int[] nums) {
	        // Check if array is at least length 1
	        if (nums.length < 1) {
	        	throw new IllegalArgumentException("Array must be of length 3.");
	        	}
	        return nums[0] == 6 || nums[nums.length - 1] == 6;
	    }
	    public static void main(String[] args) {
	        System.out.println(firstLast6(new int[]{6, 1, 2, 3}));  // true
	        System.out.println(firstLast6(new int[]{1, 2, 3, 6}));  // true
	        System.out.println(firstLast6(new int[]{1, 2, 3}));     // false
	        System.out.println(firstLast6(new int[]{6}));           // true
	    }
}
