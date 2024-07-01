package com.automation.exceptionClass;

import java.util.Scanner;

public class ExceptionMainClass {

    public static void main(String[] args) throws NullPointerEx {

        Scanner scanner = new Scanner(System.in);

        Sum sum = new Sum();

        System.out.println("Enter the first Number");

        String number1 = scanner.nextLine();

        sum.setNumber1(Integer.parseInt(number1));

        System.out.println("Enter the second Number");

        String number2 = scanner.nextLine();

        sum.setNumber2(Integer.parseInt(number2));
//        sum.divideNumbers();
        try {
//            sum.setNumber2(number2);
//            sum.divideNumbers();
            if(Integer.parseInt(number2)<10) {
                throw new NullPointerEx("I have created this exception");
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("The code will execute");
        }

        System.out.println(sum.getNumber2());








    }
}
