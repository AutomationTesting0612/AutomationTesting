package com.automation.classes;

public class SumNewClass {
    static int number1=10;
    static  int number2=20;

    static int number3; ///Meta space

    static String name1="ABC";
    static String name2="CDE";

    static String name;

    public static void main(String args[])  {

        number3=number1+number2; ///sum
        System.out.println("The first Statement" + number3);
        name= name1+name2; //concatenate
        System.out.println("The second Statement" +name);
        try {
            number3 = Integer.parseInt(name1) + number1;
        } catch (NumberFormatException e) {
//            throw e;   exit from the code
            System.out.println(e);
//            e.printStackTrace();
        }
        System.out.println("The third Statement" + name);

//        Test test = new Test(); //instance Variable---> Heap
    }

}
