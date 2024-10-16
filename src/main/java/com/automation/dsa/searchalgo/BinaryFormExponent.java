package com.automation.dsa.searchalgo;

public class BinaryFormExponent {

//    Leetcode 50
//
//    mplement pow(x, n), which calculates x raised to the power n (i.e., xn).
//
//
//
//    Example 1:
//
//    Input: x = 2.00000, n = 10
//    Output: 1024.00000
//    Example 2:
//
//    Input: x = 2.10000, n = 3
//    Output: 9.26100
//    Example 3:
//
//    Input: x = 2.00000, n = -2
//    Output: 0.25000
//    Explanation: 2-2 = 1/22 = 1/4 = 0.25
//
//
//    Constraints:
//
//            -100.0 < x < 100.0
//            -231 <= n <= 231-1
//    n is an integer.
//    Either x is not zero or n > 0.
//            -104 <= xn <= 104

   static double x = 2.0000;
   static  int n=10;

   static double ans =1;

    static long binaryForm=n;

    public static void main(String[] args) {

        if(n==0) {
            x=1;
        }
        if(x==0) {
            x=0;
        }
        if(n==1) {
            x=x;
        }
        if(x==-1 && n%2==0) {
            x=1;
        }
        if(x==-1 && n%2!=0) {
            x=-1;
        }

        if(n<0){
            x=1/x;
            binaryForm=-binaryForm;
        }

        //We are running the loop on binary form not on the number
        while (binaryForm>0) {
            if(binaryForm%2==1) {
                ans=ans*x;
            }
             x*=x;
            binaryForm=binaryForm/2;
            System.out.println(binaryForm);
        }

        System.out.println(ans);



    }
}
