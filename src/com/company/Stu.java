package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stu {
    private JButton payButton;
    private JButton showBalaceButton;
    private JButton showLoanButton;
    private JTextField textField1;
    private static JTable table1;
    public JPanel panel1;
    private JTextArea textArea1;

    public Stu() {
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        showBalaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        showLoanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {

    }

    public static void main(String[] args) {

        JFrame frame= new JFrame();
        frame.setTitle(" S.T.E.M");
        frame.setContentPane(new Stu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(new Dimension(600, 400));
    }
}
