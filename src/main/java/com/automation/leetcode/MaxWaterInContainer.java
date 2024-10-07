package com.automation.leetcode;

import static java.lang.Math.min;
import static java.lang.Math.max;
public class MaxWaterInContainer {

//    Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//    Return the maximum amount of water a container can store.
//
//    Notice that you may not slant the container.
//
//
//
//    Example 1:
//
//
//    Input: height = [1,8,6,2,5,4,8,3,7]
//    Output: 49
//    Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
//    Example 2:
//
//    Input: height = [1,1]
//    Output: 1
//
//
//    Constraints:
//
//    n == height.length
//2 <= n <= 105
//            0 <= height[i] <= 104

    public static void main(String[] args) {

        int ans=0;


        int[] height = {1,8,6,2,5,4,8,3,7};
        for (int i=0;i< height.length;i++){
            for (int j=i+1;j<height.length;j++) {
                int w=j-i;
                int ht=min(height[i],height[j]);
                int area = w*ht;

                ans=max(ans,area);

                System.out.println(ans);


            }
        }
    }
}
