package com.automation.classes;

import com.automation.test.Automation;
import cucumber.api.java.it.Ma;

public class PracticeMain extends Automation{

    public static void add() {
        System.out.println("adding");
    }


    public static void main(String[] args) {


//        Shape shape = new Shape();
//        Addition addition = new Addition();
//        Maruti maruti = new Maruti();
//
//
//        //classname.fieldName
//        Pencil.color="black";
//        Pencil.brandName="ABC";
//        Pencil.length=20;
//        Pencil.speed();
//        Pencil.write();
//
//        Pencil.color="blue";
//        Pencil.brandName="ttt";
//        Pencil.length=30;
//        Pencil.speed();
//        Pencil.write();
//
//        //non-static
//
//        Pens pen = new Pens(); //pen--> instance variable
//        pen.color="black";
//        pen.brandName="ABC";
//        pen.length=20;
//        pen.speed();
//        pen.write();
//
//        Pens pen1 = new Pens(); //pen--> instance variable
//        pen1.color="black";
//        pen1.brandName="ABC";
//        pen1.length=20;
//        pen1.speed();
//        pen1.write();
//
        int number = 10;  //11--> 10+1
        System.out.println(number);
        System.out.println(number--);
        System.out.println(number);
        System.out.println(--number);
//        System.out.println(++number); 1+10=11





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
