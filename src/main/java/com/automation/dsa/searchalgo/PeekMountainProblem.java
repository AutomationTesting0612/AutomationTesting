package com.automation.dsa.searchalgo;

public class PeekMountainProblem {

    public static int peekElement(int[] nums){

        int st= nums[0];
        int end= nums.length-1;
        int mid=0;

        while(st<=end){
            mid=st+(end-st)/2;

            if(nums[mid-1]<nums[mid]&& nums[mid]>nums[mid+1]){
                return nums[mid];
            }

            if(nums[mid]>nums[mid-1]) {
               st=mid+1;
            } else{
                end=mid-1;
            }
        }


        return -1;

    }

    public static void main(String[] args) {

//        Leet code 852

//        You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//
//        Return the index of the peak element.
//
//                Your task is to solve it in O(log(n)) time complexity.
//
//
//
//        Example 1:
//
//        Input: arr = [0,1,0]
//
//        Output: 1
//
//        Example 2:
//
//        Input: arr = [0,2,1,0]
//
//        Output: 1
//
//        Example 3:
//
//        Input: arr = [0,10,5,2]
//
//        Output: 1
//
//
//
//        Constraints:
//
//        3 <= arr.length <= 105
//        0 <= arr[i] <= 106
//        arr is guaranteed to be a mountain array.

        int[] arr = {0,2,1,0};

        System.out.println(peekElement(arr));
    }
}
