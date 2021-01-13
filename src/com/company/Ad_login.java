package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ad_login {
    private JButton cancelButton;
    private JButton loginButton;
    private JTextField enterUsernameTextField;
    private JPasswordField enterPasswordField;
    public JPanel logpanel;

    public Ad_login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=enterUsernameTextField.getText();
                String Password=enterPasswordField.getText();
                String   databaseUsername= " ";
                String databasePassword=" ";
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/s.t.e.m", "root", "");
                    //stmt = conn.createStatement();
                    Statement stmt = co.createStatement();
                    String SQL = "SELECT * FROM admin WHERE userName='" + name + "' && password='" + Password+ "'";

                    ResultSet rs = stmt.executeQuery(SQL);


                    // Check Username and Password
                    while (rs.next()) {
                        databaseUsername = rs.getString("userName");
                        databasePassword = rs.getString("password");
                    }

                    if (name.equals(databaseUsername) && Password.equals(databasePassword)) {
                        JOptionPane.showConfirmDialog(null,"Hello admin ur logIn was successful <3","Alert",JOptionPane.WARNING_MESSAGE);
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
                    frame.setContentPane(new Adm().panel1);
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
        frame.setContentPane(new Ad_login().logpanel);
        frame.pack();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
