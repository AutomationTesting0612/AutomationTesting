package com.automation.dsa.sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr, int n) {


        for (int i=1;i< n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }


    }

    public static void printArr(int[] arr, int n) {

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {

        int[] arr = {4,1,5,2,3};

        int n=5;

        insertionSort(arr, n);
        printArr(arr,n);


    }
}
