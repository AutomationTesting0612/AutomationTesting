package com.automation.leetcode;

import static java.lang.Math.max;

public class PainterPartitionProblem {

    //Psuedo code
//    arr=[40,30,10,20], N=4, m=2
//    m =number of painter
//    n= size of of array
//
//    st=max(arr), end=sum(arr);ans=-1
//    while(st<=end)
//        mid=st+(end-st)/2;
//        if(isPossible(mid)) //true
//            ans=mid
//            end =mid-1
//        else
//            st=mid+1
//
//    //check possible of not
//
//    paitner=1;time=0;
//    isPossible(arr[], m, n, maxAllowedTime)  mid=maxAllowedTime
//    for(int i=0;i<n;i++){
//        if(time+arr[i]<=maxAllowedTime) {
//            time+=arr[i];
//
//        } else {
//            painter++;
//            time=arr[i]
//        }
//    }
//
//    return paitner<=m

    public static boolean isMidPossible(int[] arr, int n, int m, int maximumAllowedTime){

        int painters=1, time=0;

        for(int i=0;i<n;i++) {
            if(time+arr[i]<=maximumAllowedTime) {
                time+=arr[i];
            } else {
                painters++;
                time=arr[i];
            }
        }

        return painters<=m;

    }

    public static int painterProblem(int[] arr, int n, int m){

        int maxValue=Integer.MIN_VALUE;
        int sum=0;
        int ans=-1;
        int mid=0;

        for(int i=0;i<n;i++){
           sum+=arr[i];
           maxValue=max(maxValue,arr[i]);

        }
        int st=maxValue, end= sum;

        while(st<=end){

            mid=st+(end-st)/2;

            if(isMidPossible(arr, m, n, mid)){
                ans=mid;
                end=mid-1;
            } else {
                st=mid+1;
            }

        }




        return ans;
    }

    public static void main(String[] args) {
         int[] arr={40,30,10,20};
         int n=4, m=2;
        System.out.println(painterProblem(arr,n,m));
    }

}
