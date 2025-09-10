package com.codegnan.arrays;

public class MaxEnd3 {

	    public static int[] maxEnd3(int[] nums) {
	        if (nums.length != 3) {
	        	throw new IllegalArgumentException("Array must be of length 3.");
	        }

	        int max = Math.max(nums[0], nums[2]);
	        return  new int[]{max, max, max};
	        
	    }

	    public static void main(String[] args) {
	        printArray(maxEnd3(new int[]{1, 2, 3}));   // [3, 3, 3]
	        printArray(maxEnd3(new int[]{11, 5, 9}));  // [11, 11, 11]
	        printArray(maxEnd3(new int[]{2, 11, 20})); // [20, 20, 20]
	    }

	    private static void printArray(int[] arr) {
	        System.out.print("[");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]);
	            if (i < arr.length - 1) System.out.print(", ");
	        }
	        System.out.println("]");
	}

}
