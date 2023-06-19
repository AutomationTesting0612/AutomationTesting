package com.automation.testing;

import java.util.Arrays;
import java.util.List;

public class Car {

    public static void main(String[] args) {

        List list = Arrays.asList("24","30","90", "45", "65");
        int lngth = list.size();

        for (int i=0; i<lngth;i++) { //itrate
//            System.out.println(list.get(i));
            if(list.get(i).equals("90")) {
                continue;
//                System.out.println(list.get(i));
            }
            System.out.println(list.get(i));
        }

        Dog t = new Dog();
        t.eat();
        t.bread="Boxer";

    }
}
