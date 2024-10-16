package com.automation.dsa.sorting;

public class BubbleSortAlgo {


//    for(i=0;<i<n-1;i++){
//        for(j=0;j<n-i-1;j++){
//            if( A[j]>A[j+1]){
//                swap(A[j]),A[j+1])
//            }
//        }
//    }

    public static void bubbleSort(int[] arr, int n) {
        int temp=0;
        for (int i = 0; i < n - 1; i++) {
//            boolean isSwap=false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
//                    isSwap=true;
                }
            }

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

        bubbleSort(arr,n);
        printArr(arr,n);


        }

    }

