package com.wei.mail;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length:" );
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter object's width:" );
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter object's height:" );
        int height = Integer.parseInt(scanner.next());
        System.out.println("Length: " + length + ", width: " + width + ", height: " + height);
        if (box3.validate(length, width, height)) {
            System.out.println(box3.getGame() + "\t Price: " + box3.getPrice());
        }else{
            System.out.println(box5.getGame() + "\t Price: " + box5.getPrice());
        }


    }
}
