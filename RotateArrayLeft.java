package com.codegnan.arrays;

public class RotateArrayLeft {

	    public static int[] rotateLeft(int[] nums) {
	        if (nums.length != 3) {
	        	throw new IllegalArgumentException("Array must be of length 3.");
	        }

	        return new int[]{nums[1], nums[2], nums[0]};
	    }

	    public static void main(String[] args) {
	        int[] result1 = rotateLeft(new int[]{1, 2, 3});
	        int[] result2 = rotateLeft(new int[]{5, 11, 9});
	        int[] result3 = rotateLeft(new int[]{7, 0, 0});

	        printArray(result1); // [2, 3, 1]
	        printArray(result2); // [11, 9, 5]
	        printArray(result3); // [0, 0, 7]
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

