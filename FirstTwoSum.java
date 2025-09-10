package com.codegnan.arrays;

public class FirstTwoSum {

	    public static int sumFirstTwo(int[] nums) {
	        if (nums.length == 0) {
	            return 0;
	        } else if (nums.length == 1) {
	            return nums[0];
	        } else {
	            return nums[0] + nums[1];
	        }
	    }

	    public static void main(String[] args) {
	        int[] test1 = {1, 2, 3};         // Output: 3
	        int[] test2 = {5, 5};            // Output: 10
	        int[] test3 = {8, 2, 1, 14};     // Output: 10
	        int[] test4 = {};                // Output: 0
	        int[] test5 = {7};               // Output: 7

	        System.out.println(sumFirstTwo(test1)); // 3
	        System.out.println(sumFirstTwo(test2)); // 10
	        System.out.println(sumFirstTwo(test3)); // 10
	        System.out.println(sumFirstTwo(test4)); // 0
	        System.out.println(sumFirstTwo(test5)); // 7
	    }

	}
