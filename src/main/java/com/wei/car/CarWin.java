package com.wei.car;

import javax.swing.*;
import java.awt.*;

public class CarWin {

    static final int WIDTH = 600; //大寫代表不想被改變,+static才偵測得到

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH,400);
        frame.setLocation(1000,300);
        JButton botton1 = new JButton("TIME");
        JButton botton2 = new JButton("CONTACT US");
        JButton botton3 = new JButton("CASH");
        JButton botton4 = new JButton("VISA");
        JButton botton5 = new JButton("ENTER YOUR CAR ID");
        frame.add(botton1, BorderLayout.NORTH);
        frame.add(botton2, BorderLayout.SOUTH);
        frame.add(botton3, BorderLayout.EAST);
        frame.add(botton4, BorderLayout.WEST);
        frame.add(botton5, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }
}
