package com.automation.dsa.searchalgo;

import java.util.HashMap;
import java.util.Map;

public class SumOfNumbers {
        public static int[] twoSum(int[] nums, int target) {

            Map<Integer, Integer> ind= new HashMap<Integer, Integer>();

           int n=  nums.length;



           for (int i=0;i<n-1;i++){
               int diff= target-nums[i];
               if(ind.containsKey(diff)) {
                 return new int[] {i, ind.get(diff)};
               }
               ind.put(nums[i], i);
           }

//            for (int i=0;i<nums.length-1;i++){
//                for(int j=i+1;j<nums.length;j++){
//                    if(nums[i]+nums[j]==target){
//                        return new int[] {i, j};
//                    }
//                }
//            }
//
            return new int[] {};


        }

    public static void main(String[] args) {

            int target = 9;
            int[] nums={2,7,11,15};
//         int[] num=    twoSum(nums, target);
        System.out.println(twoSum(nums, target));

    }
}
