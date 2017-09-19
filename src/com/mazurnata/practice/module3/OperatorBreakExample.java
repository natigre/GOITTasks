package com.mazurnata.practice.module3;

public class OperatorBreakExample {
    public static void main(String[] args) {
       breakExample1();
       breakExmaple2();
    }
    private static void breakExample1() {
        int[] nums = new int[] { 1, 2, 3, 4, 12, 9 };
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 10)
                break;
            System.out.println(nums[i]);
        }
    }

    private static void breakExmaple2() {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}
