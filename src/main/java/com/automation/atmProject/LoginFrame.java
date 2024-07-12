package com.automation.atmProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel atmNumberLabel = new JLabel("ATM NUMBER");
    JLabel atmPinLabel = new JLabel("ATM PIN");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    AtmOperation atmOperation = new ATMOperationImplementation();
    String atmNumber="1356";
    String atmPin="5678";

    LoginFrame() {
        this.getContentPane().setBackground(Color.GRAY);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void addComponentsToContainer() {
        container.add(atmNumberLabel);
        container.add(atmPinLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(loginButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
    }
    public void setLocationAndSize() {
        atmNumberLabel.setBounds(50, 150, 100, 30);
        atmPinLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
    }
    public void setLayoutManager() {
        container.setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton) {
            try {
                String enteredAtmNumber = userTextField.getText();
                String enteredAtmPin = new String(passwordField.getPassword());
                if (!enteredAtmNumber.equals(atmNumber) || !enteredAtmPin.equals(atmPin)) {
                    JOptionPane.showMessageDialog(this, "Please enter valid numbers for ATM Number and PIN");

                } else {
                    JOptionPane.showMessageDialog(this, "Login Successful");
                    ATMUIFrame frame = new ATMUIFrame();
                    frame.setTitle("ATM Project");
                    frame.setVisible(true);
                    frame.setBounds(10, 10, 370, 600);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                    frame.setBackground(Color.BLACK);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "");
            }
        }

    }
}
