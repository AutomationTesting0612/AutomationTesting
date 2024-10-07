package com.automation.leetcode;

import static java.lang.Math.max;

public class MaxSubArrUsngBruteForce {

    public static void main(String[] args) {

        int[] arr={3,-4, 5,4,-1,7,-8};

        int max_arr=Integer.MIN_VALUE;

        for(int st=0;st< arr.length;st++){

            int curr_arr=0;

            for(int end=st;end<arr.length;end++){

                curr_arr=curr_arr+arr[end];
                max_arr=max(curr_arr, max_arr);

            }
        }

        System.out.println(max_arr);

    }
}
