package com.automation.classes;

//import loopPratice.SwitchStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainClassTest {


    public static void main(String args[]) {

//        Pension pension = new Pension();
//        pension.age=55;
//        pension.checkAge();
//        pension.useDoWhile();
//        pension.useSwitchCase();

//        NonPensionClass.checkAge();
//
//        ForLoopClass.printNumber();

//        ForLoopWithOutStatic forLoopWithOutStatic = new ForLoopWithOutStatic();
//        forLoopWithOutStatic.n1=10;
//        forLoopWithOutStatic.test();
//
//        WhileLoopPratice.whileLoopWithStatic();

//        SwitchStatement.switchMethod();
//        SwitchStatement.dayWeek();

//        SwitchStatement statement= new SwitchStatement();
//        statement.num=4;
//        statement.dayWeek();




//        Scanner scanner = new Scanner(System.in); //User input class
//        System.out.println("enter the number ");
//        String number = scanner.nextLine();
//        statement.num= Integer.parseInt(number);
////        System.out.println("The Number is" + statement.num);
//
//        statement.dayWeek();

        String name;
        String age;
        String rollNumber;

        Student student = new Student();
        DBConnection test = new DBConnection();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student Name");
        name = scanner.nextLine();

        student.studentName=name;



        System.out.println("Enter the Student Age");

        age=scanner.nextLine();
        System.out.println("Enter the Student Roll NUmber");

        rollNumber=scanner.nextLine();

        student.age=Integer.parseInt(age);
        student.printName();
        student.printAge();
        System.out.println(student.rollNumber=Integer.parseInt(rollNumber));

        try (Connection connection = test.db()) {
            String createQuery="CREATE TABLE student (name VARCHAR(50), age int, rollNumber int)";
            Statement statements=connection.createStatement();
            statements.execute(createQuery);
            String query="INSERT INTO student (name, age, rollNumber)"
                    + "values('" + student.studentName + "','" + student.age + "','" + student.rollNumber
                    + "')";

            statements.executeUpdate(query);
            System.out.println("Successfully connected to the H2 database.");

            String selectQuery="Select * from student";
            ResultSet result= statements.executeQuery(selectQuery);
            System.out.println(result.getRow());

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to the H2 database..");
        }

    }
}
