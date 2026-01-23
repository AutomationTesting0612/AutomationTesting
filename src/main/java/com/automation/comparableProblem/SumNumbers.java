package com.automation.comparableProblem;

public class SumNumbers {

    public static void main(String[] args) {

        int[] num = {2,5,7,9};
        int target = 9;
        sum(num, target);



    }

    public static void sum(int[] num, int target) {

       int a= num.length;
        boolean found = false;

       for (int i=0;i<a;i++) {

           for (int j = i + 1; j < a; j++) {

               if (num[i] + num[j] == target) {

                   System.out.println("Pair found: indices (" + i + ", " + j +
                           ") -> values (" + num[i] + ", " + num[j] + ")");
               found = true;

           }

           }
       }

        if (!found) {
        System.out.println("No pairs found");
    }
    }
}
