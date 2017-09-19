package com.mazurnata.practice.module3;

public class ExampleOfContinue {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};
        continueEx(numbers);
        System.out.println();
        continueEx2(numbers);
    }

    private static void continueEx(int[] arr) {
        for(int x : arr ) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }

    private static void continueEx2(int[] nums) {
        for (int i = 0; i < nums.length; i++){

            if (nums[i] > 10)
                continue;
            System.out.println(nums[i]);
        }
    }
}
