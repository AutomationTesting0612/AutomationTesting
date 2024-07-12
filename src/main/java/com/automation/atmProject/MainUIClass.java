package com.automation.atmProject;

import javax.swing.*;
import java.awt.*;

public class MainUIClass {

    public static void main(String[] args) throws ATMValidationException {

        LoginFrame frame = new LoginFrame();
        frame.setTitle("ATM Project");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBackground(Color.BLACK);
    }
//        AtmOperation atmOperation = new ATMOperationImplementation();
//        int atmNumber=1356;
//        int atmPin=5678;
//
//        System.out.println("********WELCOME to ATM Machine********");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the ATM Number");
//        int enterATMNumber = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Enter the ATM Pin");
//        int enterATMPin= Integer.parseInt(scanner.nextLine());
//
//        if (atmNumber == enterATMNumber && atmPin == enterATMPin ) {
//            while (true){
//                System.out.println("The ATM Machine Provide the below Operations");
//                System.out.println("1.Balance\n2.WithDraw Amount\n3.Deposit Amount\n4.Exit");
//                System.out.println("Enter the Operation from above:");
//                int operation = scanner.nextInt();
//
//                    if (operation == 1) {
//                        System.out.println("The Balance is:");
//                        atmOperation.viewBalance();
//
//                    } else if (operation == 2) {
//                        System.out.println("Enter the Amount to WithDraw:");
//                        double amount = scanner.nextDouble();
//                        atmOperation.withDrawAmount(amount);
//                        atmOperation.viewBalance();
//
//                    } else if (operation == 3) {
//                        System.out.println("Enter the Amount to Deposit:");
//                        double amount = scanner.nextDouble();
//
//                        atmOperation.depositAmount(amount);
//
////                        atmOperation.viewBalance();
//
//                    } else {
//                        System.out.println("Thank you to Visit.");
//                        break;
//                    }
//                }
//
//        } else {
//            throw new ATMValidationException("atmNumber is Incorrect");
//
//
//        }
//
//    }
    }

