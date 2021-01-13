package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

import static jdk.internal.net.http.common.Utils.close;

public class stem {
    
    private JPanel panel1;
    private JButton studentButton;
    private JButton agentButton;
    private JButton adminButton;
    private JButton exitButton;


    public stem() {

        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        });
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // close();
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
        });
        agentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame= new JFrame();
                frame.setTitle(" S.T.E.M");
                // Add panel to frame
                frame.setContentPane(new Ag_login().Aglog);
                frame.pack();
                frame.setSize(500, 400);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);


            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
close();

            }
        });
    }



    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setTitle(" S.T.E.M");
        // Add panel to frame
        frame.setContentPane(new stem().panel1);
        frame.pack();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    }


