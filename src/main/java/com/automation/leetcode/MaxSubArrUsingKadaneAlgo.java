package com.automation.leetcode;

import static java.lang.Math.max;

public class MaxSubArrUsingKadaneAlgo {

    public static void main(String[] args) {

        int[] arr={3,-4, 5,4,-1,7,-8};

        int cur_ele=0,max_arr=Integer.MIN_VALUE;

        for (int ele: arr) {
            cur_ele+=ele;
            max_arr=max(cur_ele, max_arr);

            if(cur_ele<0) {
                cur_ele= 0;
            }
        }

        System.out.println(max_arr);


    }


}
