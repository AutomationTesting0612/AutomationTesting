package com.automation.dsa.searchalgo;

public class PrintAllSubArr {


    public static void main(String[] args) {

        int[] num = {1,2,3,4,5};

        for(int st=0; st<num.length;st++){
          for(int end=st;end<num.length;end++){
              for(int i=st;i<=end;i++) {
                  System.out.print(num[i]);
              }
              System.out.println();
          }
        }


    }
}
