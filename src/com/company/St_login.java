package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class St_login {
    private JButton loginButton;
    private JButton cancelButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    public JPanel stpanel;

    public St_login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=textField1.getText();
                String Password=passwordField1.getText();
                String   databaseUsername= " ";
                String databasePassword=" ";
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/s.t.e.m", "root", "");
                    //stmt = conn.createStatement();
                    Statement stmt = co.createStatement();
                    String SQL = "SELECT * FROM student WHERE userName='" + name + "' && password='" + Password+ "'";

                    ResultSet rs = stmt.executeQuery(SQL);


                    // Check Username and Password
                    while (rs.next()) {
                        databaseUsername = rs.getString("userName");
                        databasePassword = rs.getString("password");
                    }

                    if (name.equals(databaseUsername) && Password.equals(databasePassword)) {
                        JOptionPane.showConfirmDialog(null,"Hello student ur logIn was successful <3","Alert",JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showConfirmDialog(null,"Incorrect Password or userName","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                }catch (Exception err) {
                    System.out.println("Error: " + err);
                }
                if (name.equals(databaseUsername) && Password.equals(databasePassword)){
                    JFrame frame= new JFrame();
                    frame.setTitle(" S.T.E.M");
                    // Add panel to frame
                    frame.setContentPane(new Stu().panel1);
                    frame.pack();
                    frame.setSize(400, 400);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            }

        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setTitle(" S.T.E.M");
        // Add panel to frame
        frame.setContentPane(new St_login().stpanel);
        frame.pack();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
