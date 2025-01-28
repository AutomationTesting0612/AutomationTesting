package com.automation.test;


import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {

//       A a= new A();
//        System.out.println(a.num1=20);
//        System.out.println(a.num2=30);
//
////       A a1 = new A(40, 50);
//        System.out.println(a1);
//
//        WebDriver driver = new ChromeDriver()
//        we have to add new entry in the array
        int arr[]= {23,6,7,7,8,8,88,8,8,8,8,8,8,8};

        for(int s: arr) {
            System.out.println(s);
        }

//        WebDriver driver = new ChromeDriver();
//        List<WebElement> list = driver.findElements(By.xpath("dfsfs"));



        ArrayList<Integer> arr1 = new ArrayList<Integer>(); //Fixed Data Tye
        ArrayList<String> arr2 = new ArrayList<String>();//Generic data Type
        arr2.add("23");
        arr1.add(23);
    }
}
