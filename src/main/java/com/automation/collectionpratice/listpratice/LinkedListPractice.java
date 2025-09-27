package com.automation.collectionpratice.listpratice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public static void main(String[] args) {

        // duplicate allowed, element will in order, faster
        List<String> ls = new LinkedList<>();
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
