package com.wei.car;

import javax.swing.*;

public class CarDemo {      //new, swing UI designer, GUI form
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().mainPanel);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }
}
