package com.automation.dsa.sorting;

public class DutchSortingAlgoZerosOnes {

//    0s->o to low-1
//    1s-> low to mid-1
//    2s-> high+1 to n-1
//
//    while(mid<=high){
//
//        if(arr[mid==0]){
//            swap(arr[low], arr[mid])
//            mid++,low++
//        } else if(arr[mid]==1){
//            mid++;
//        } else{
//            if(arr[mid]==2){
//                swap(arr[mid],arr[high])
//                high--
//            }
//        }
//    }

    public static void dutchSortingAlgo(int[] arr, int n){

        int low=0, mid=0, high=n-1;
        int temp=0;

        while(mid<=high){

            if(arr[mid]==0){
                temp =arr[low];
                arr[low]= arr[mid];
                arr[mid]= temp;
                mid++;
                low++;
            } else if(arr[mid]==1){
                mid++;
            } else {
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;

            }
        }
    }

    public static void printArr(int[] arr, int n){

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0,1,2,0,0};
        int n=10;

        dutchSortingAlgo(arr, n);
        printArr(arr, n);

    }
}
