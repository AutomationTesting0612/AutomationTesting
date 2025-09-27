package com.automation.collectionpratice.listpratice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        // duplicate allowed, element will in order, faster
        List<String> ls = new ArrayList<>();
        ls.add("Java");
        ls.add("Java");
        ls.add("Python");
        ls.add("CSS");
        ls.add("HTML");
// size method
        System.out.println(ls.size());
        System.out.println(ls);

        System.out.println(ls.get(2));
//
    }
}
