package com.automation.atmProject;

import java.util.Scanner;

public class AtmMainClass {

    public static void main(String[] args) throws ATMValidationException {

        String atmNumber="9090";
        String atmPin="1212";

        Scanner scanner = new Scanner(System.in);
        System.out.println("****************WELCOME TO ATM Project*********************");
        System.out.println("Enter the ATM Number:");
        String enteredAtmNumber=scanner.nextLine();

        System.out.println("Enter the ATM Pin:");
        String enteredAtmPin=scanner.nextLine();
        if(enteredAtmNumber.equals(atmNumber) && enteredAtmPin.equals(atmPin)) {

        } else {
            throw new ATMValidationException("Atm Number Or Atm Pin Incorrect");
        }


    }
}
