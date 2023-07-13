package com.automation.classes;

import com.automation.test.Automation;

public class PracticeMain extends Automation{

    public static void add() {
        System.out.println("adding");
    }


    public static void main(String[] args) {

//
//
//        Car car = new BMW(); //upcasting
//        car.gear();
//
//        MathematicProblem mathematicProblem = new MathematicProblem();
//        mathematicProblem.num3=40;
//        mathematicProblem.num4=34;
//
//        Addition add = new Addition();
//        add.setNum1(12);
//
//        auto.pb();
//        auto.testing("Akhil");
//
//        AbstractClass abstractClass= new AbstractClassImpl();
//        abstractClass.test2();
//        add();
//        Practice1 practice1=new Practice1();
//        practice1.sum2();
//        Practice1.sum1();

        Practice2 practice2 = new Practice2();
        practice2.sum2();
        practice2.sum1();
        practice2.sum5();
    }
}
