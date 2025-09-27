package com.automation.collectionpratice.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void  main(String[] args) {

        int a=10; //procedural programming language
        Integer a1=10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required values: ");
        int age = sc.nextInt();
        String name = sc.next();
        String add = sc.next();
        Person p = new Person();
        p.setAge(age);
        p.setName(name);


        Address address = new Address();
        address.setHouseNo(add);

        Map<Person, Address> map = new HashMap<>();
        map.put(p,address);

        System.out.println(map);
    }
}
