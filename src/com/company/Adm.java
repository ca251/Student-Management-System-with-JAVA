package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Adm {
    private JButton viewCustomerButton;
    private JButton viewLoanButton;
    private JButton approveLoanButton;
    private JTextArea textArea1;
    public JPanel panel1;

    public Adm() {
        viewCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Model db =new Model();
                try {
                    ArrayList<Student> list = db.listStudents();
                    textArea1.setText("");
                    for(int i =0; i< list.size(); i++)
                        textArea1.append(list.get(i).toString()+"\n");

                }catch(Exception re)
                {
                    re.printStackTrace();
                }

            }
        });
        approveLoanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        viewLoanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
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
