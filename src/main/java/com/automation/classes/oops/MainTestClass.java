package com.automation.classes.oops;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainTestClass {

    public static void main(String args[]) {
//        SwitchCaseClass switchCaseClass = new SwitchCaseClass();
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student name : ");
        String name = scanner.nextLine();

        System.out.println("Enter the teacher Id : ");

        String id = scanner.nextLine();

        System.out.println("Enter the course : ");

        String course = scanner.nextLine();

        College college = new College(name, Integer.parseInt(id), course);
        college.campusPlacement();

        DBConnection connection = new DBConnection();

        try (Connection con = connection.db()) {
            String createQuery="CREATE TABLE if not exists college (name VARCHAR(50))";
            Statement statements=con.createStatement();
            statements.execute(createQuery);
            String query="INSERT INTO college (name)"
                    + "values('" + name
                    + "')";

            statements.executeUpdate(query);
            System.out.println("Successfully connected to the H2 database.");

            String selectQuery="Select * from college";
            ResultSet result= statements.executeQuery(selectQuery);
            System.out.println(result.getRow());
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
