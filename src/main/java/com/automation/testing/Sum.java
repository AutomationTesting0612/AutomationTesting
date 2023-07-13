package com.automation.testing;

import com.automation.classes.MathematicProblem;

public class Sum extends MathematicProblem{

    static int num1=3;
    static int num2=5;

    static int sum;

    public static void main(String[] args) {

       MathematicProblem problem = new  MathematicProblem();
       problem.sum();
       problem.num2=90;



        sum=num1+num2;

//        if(sum==12) {
//            System.out.println("The value is correct");
//        } else {
//            System.out.println("The value is not correct");
//        }

        if(sum==12) {
            System.out.println("The value is 12");
        } else if(sum==13) {
            System.out.println("The value is 13");
        } else if(sum==10) {
            System.out.println("The value is 8");
        } else {
            System.out.println("The sum method is not working correctly");
        }




    }





}
