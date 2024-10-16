package com.automation.dsa.searchalgo;

public class BinarySearchAlgorithm {

    public static void main(String[] args) {

        //condition---Array should i=be in sorted
        //Time Complexity of array is O(logn)

        int[] arr={-1,0,3,4,5,9,12};
        int tar=12;
        int st=arr[0];
        int end= arr.length-1;
        int  mid=0;



        while(st<=end) {
            mid=st+end/2;

          if(tar>mid){
              st=mid+1;
          } else if(tar<mid){
              mid=mid-1;
          } else{
              mid=tar;
          }

        }

        System.out.println(mid);

    }
}
