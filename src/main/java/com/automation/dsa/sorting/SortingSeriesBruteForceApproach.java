package com.automation.dsa.sorting;

public class SortingSeriesBruteForceApproach {

    public static void sorting(int[] arr, int n) {

        for (int i=0;i<n-1;i++){

            for (int j=0;j<n-i-1;j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    public static void printArr(int[] arr, int n){
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {


        int[] arr = {2,0,2,1,1,0,1,2,0,0};
        int n=10;

        sorting(arr, n);
        printArr(arr,n);
    }
}
