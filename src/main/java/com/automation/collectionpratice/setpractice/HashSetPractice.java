package com.automation.collectionpratice.setpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {

        // duplicate allowed, element will in order, faster
        Set<String> ls = new HashSet<>();
        ls.add("Java");
        ls.add("Java");
        ls.add("Python");
        ls.add("CSS");
        ls.add("HTML");
// size method
        System.out.println(ls.size());
        System.out.println(ls);

//        System.out.println(ls.get(2));
//
    }
}
