package com.codegnan.arrays;

public class FirstLastSame {

	    public static boolean sameFirstLast(int[] nums) {
	        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 1};  // true
	        int[] arr2 = {7};           // true
	        int[] arr3 = {1, 2, 3};     // false
	        int[] arr4 = {};            // false

	        System.out.println(sameFirstLast(arr1)); // true
	        System.out.println(sameFirstLast(arr2)); // true
	        System.out.println(sameFirstLast(arr3)); // false
	        System.out.println(sameFirstLast(arr4)); // false
	    }
	}

