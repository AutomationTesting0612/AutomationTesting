package com.automation.dsa.sorting;

public class SelectionSort {


    public static void selectionSort(int[] arr, int n) {

        for (int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[index]){
                 index=j;  //searching lowest index
                }

            }

            int smallestNumber=arr[index];
            arr[index]=arr[i];
            arr[i]=smallestNumber;
        }
    }

    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        int arr[]={4,1,5,2,3};
        int n=5;

        selectionSort(arr, n);
        printArr(arr, n);
    }
}
