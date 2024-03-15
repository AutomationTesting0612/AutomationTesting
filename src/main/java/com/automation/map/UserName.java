package com.automation.map;

import java.util.*;

public class UserName {


    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("Username1", "Akhil");
        map.put("Username2", "Akhil1");
        map.put("Username3", "Akhil2");
        map.put("Username4", "Akhil3");
        map.put("Username1", "Test"); //collosion

        System.out.println("----------HashMap-----------------------------");
//        System.out.println(map);

        //Iteration
        for (Map.Entry<String, String> test: map.entrySet()) {
            System.out.println("The value of " + test.getKey() + ":" + test.getValue() );
        }
       Set<String> s=  map.keySet();
        for (String s1: s) {
            System.out.println(s1 + ":" + map.get(s1));
        }



//        if(map.containsKey("Username1") && map.get("Username7").equalsIgnoreCase("Test")) {
//            System.out.println("The key and value present");
//        } else {
//            System.out.println("The key is not present");
//        }
//
//        Map<String, String> map1 = new LinkedHashMap<String, String>();
//        map1.put("Username1", "Akhil");
//        map1.put("Username2", "Akhil1");
//        map1.put("Username3", "Akhil2");
//        map1.put("Username4", "Akhil3");
//        map1.put("Username4", "Saksham");
//
//        System.out.println("----------LinkedHashMap-----------------------------");
//        System.out.println(map1);
    }
}
