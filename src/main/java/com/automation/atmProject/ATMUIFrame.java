package com.automation.atmProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMUIFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel dropdownLabel = new JLabel("Operation");
    JComboBox<String> dropdown = new JComboBox<>(new String[]{"View Balance", "Deposit", "WithDraw", "Exit"});

    JLabel amountLabel = new JLabel("Amount");
    JTextField enteredAmount = new JTextField();
    AtmOperation atmOperation = new ATMOperationImplementation();

    JButton submitButton = new JButton("SUBMIT");
    JLabel messageLabel = new JLabel();

    ATMUIFrame() {
        this.getContentPane().setBackground(Color.GRAY);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void addComponentsToContainer() {
        container.add(dropdownLabel);
        container.add(dropdown);
        container.add(messageLabel);
        if(!dropdown.getSelectedItem().equals(null)) {
            container.add(amountLabel);
            container.add(enteredAmount);
            container.add(submitButton);
        }

    }

    public void addActionEvent() {
        submitButton.addActionListener(this);
    }

    public void setLocationAndSize() {
        dropdownLabel.setBounds(50, 310, 100, 30);
        dropdown.setBounds(150, 310, 150, 30);
        amountLabel.setBounds(50, 400, 100, 30);
        enteredAmount.setBounds(150, 400, 150, 30);
        submitButton.setBounds(150, 490, 150, 30);
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedOption = (String) dropdown.getSelectedItem();

        if (selectedOption != null && e.getSource()==submitButton ) {
            switch (selectedOption) {
                case "View Balance":
                    atmOperation.viewBalance(); // Assuming this method exists in ATMOperationImplementation
                    JOptionPane.showMessageDialog(this, "The balance Amount is "+ atmOperation.viewBalance());
                    break;
                case "Deposit":
                    // Logic for Deposit
                    atmOperation.depositAmount(Double.valueOf(enteredAmount.getText()));
                    JOptionPane.showMessageDialog(this, "The balance Amount is "+ atmOperation.viewBalance());
                    break;
                case "WithDraw":
                    // Logic for Withdraw
                    atmOperation.withDrawAmount(Double.valueOf(enteredAmount.getText()));
                    JOptionPane.showMessageDialog(this, "The balance Amount is "+ atmOperation.viewBalance());
                    break;
                case "Exit":
                    System.exit(0);
                    break;
                default:
                    messageLabel.setText("");
                    break;
            }
        }
    }
}
