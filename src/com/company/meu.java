package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class meu {
    private JTextField fname;
    private JTextField pAddress;
    private JTextField cusNumber;
    private JTextField useer;
    private JTextField textField12;
    private JButton addStudent;
    public JPanel meupanel;
    private JTextField pass;
    private JTextField mail;
    private JTextField lname;
    private JButton addLoanButton;
    private JButton flaggCustomerButton;
    private JButton exitButton;
    private JButton addStudentButton;
    private JTextField interest;
    private JTextField Balance;
    private JTextField date;


    public meu() {




        addLoanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    Model db =new Model();
                    try {


                        double balance =Double.parseDouble(Balance.getText()) ;
                        double intrest = Double.parseDouble(interest.getText());
                        int customerNumber = Integer.parseInt(cusNumber.getText());
                        Date dateIssued = Date.valueOf(date.getText());
                        int i =db.addLoan(customerNumber,dateIssued,balance,intrest);
                        if(i >0)
                            JOptionPane.showMessageDialog(null,"Successfully Added.","Alert",JOptionPane.WARNING_MESSAGE);
                        else
                            JOptionPane.showMessageDialog(null,"Failed to add Student.","Alert",JOptionPane.WARNING_MESSAGE);
                    }catch(Exception ex) {
                        ex.printStackTrace();
                    }
                }



        });
        flaggCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Model db =new Model();
                try {

                    String userName = useer.getText();
                    String password = pass.getText();
                    String emailAddress = mail.getText();
                    String firstName=fname.getText();
                    String lastName =lname.getText();
                    String physicalAddress =pAddress.getText();
                    int customerNumber = Integer.parseInt(cusNumber.getText());
                    Date dateIssued = Date.valueOf(date.getText());
                    int i =db.addStudent(userName, password, emailAddress,  firstName, lastName, physicalAddress,customerNumber,dateIssued);
                    if(i >0)
                        JOptionPane.showMessageDialog(null,"Successfully Added.","Alert",JOptionPane.WARNING_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null,"Failed to add Student.","Alert",JOptionPane.WARNING_MESSAGE);
                }catch(Exception ex)
                {
                    ex.printStackTrace();
                }




            }
        });
        }


    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setTitle(" S.T.E.M");
        // Add panel to frame
        frame.setContentPane(new meu().meupanel);
        frame.pack();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
