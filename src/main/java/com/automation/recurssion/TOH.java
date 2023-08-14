package com.automation.recurssion;

public class TOH {

    public static void toh(int n, char from_rod, char using_rod, char to_rod) { //

        if(n>0) {
            toh(n-1,from_rod,to_rod,using_rod);
            System.out.println("Moving disc " + n + " from rod : " + from_rod + " to rod : " + to_rod);
            toh(n-1,using_rod,from_rod,to_rod);
        }

    }

    public static void main(String[] args) {
        int n=3;
        toh(n,'A','B', 'C');

    }
}
