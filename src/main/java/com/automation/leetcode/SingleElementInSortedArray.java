package com.automation.leetcode;

public class SingleElementInSortedArray {

    public static int singleElement(int[] nums){

        int st=nums[0];
        int end=nums.length-1;
        int mid=0;

        if(nums.length==0){ //if array length is zeo, then single element is in 1st place
            System.out.println(nums[0]);
        }

        while(st<=end) {

            mid=st+(end-st)/2;
            if(mid==0 && nums[0]!=nums[1]) {
                return nums[0];
            }
            if(mid==end && nums[end]!=nums[end-1]) {
                return nums[end];
            }
            if (nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) {
                return nums[mid];
            }

            if(mid%2==0) {

                if (nums[mid] == nums[mid - 1]) {
                    end = mid - 1;
                } else {
                    st=mid+1;
                }

            } else {
                if(nums[mid] == nums[mid - 1]) {
                    st=mid+1;
                } else {
                    end=mid-1;
                }
            }

        }

        return -1;

    }

    public static void main(String[] args) {

//        You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
//
//        Return the single element that appears only once.
//
//        Your solution must run in O(log n) time and O(1) space.
//
//
//
//                Example 1:
//
//        Input: nums = [1,1,2,3,3,4,4,8,8]
//        Output: 2
//        Example 2:
//
//        Input: nums = [3,3,7,7,10,11,11]
//        Output: 10
//
//
//        Constraints:
//
//        1 <= nums.length <= 105
//        0 <= nums[i] <= 105

        int[] nums = {1,1,2,3,3,4,4,8,8};

        System.out.println(singleElement(nums));


    }
}
