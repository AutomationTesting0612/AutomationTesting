package com.automation.dsa.dsaseries;

public class BubbleSort {

//    Time Complexity O(n^2)

//    public static void bubbleSort(int[] arr) {
//         int temp;
//        for (int i=0;i< arr.length-1;i++) {
//
//            if(arr[i]>arr[i+1]) {
//                temp=arr[i+1];
//                arr[i+1]=arr[i];
//                arr[i]=temp;
//            }
//        }
//    }
    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[j];

                    arr[j] = arr[i];
                    arr[i] = temp;

                }

            }
        }
    }

    public static void print_array(int[] myarr) {
        System.out.println("Printing array after applying Bubble Sort");
        for (int i=0;i< myarr.length;i++){

            System.out.println(myarr[i]);
        }
    }




    public static void main(String[] args) {


        int[] myarr= {31,27,67,45,78};

        System.out.println("Printing array before Bubble Sort");

        for (int i=0;i< myarr.length;i++){
            System.out.println(myarr[i]);
        }

        bubbleSort(myarr);

        print_array(myarr);

    }
}
