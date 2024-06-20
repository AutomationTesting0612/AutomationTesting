package com.automation.classes;

public class BMW implements Car {


    String name = "This IS BMW car";

    char ch1 = 'M';

    boolean haveBackCamera;
    @Override
    public void tyre() {
     char[] ch =   name.toCharArray();
     for (char c : ch) {
         System.out.println(c);
     }

//        System.out.println(ch.);

    }

    @Override
    public void brake() {

    }

    @Override
    public void light() {

    }

    @Override
    public void gear() {

    }

    private void test() {

    }

    public boolean backCamera(){
        return haveBackCamera;
    }

}
