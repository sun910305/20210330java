package com.practice.mailbox;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Box[] boxes = {new Box1(), new Box2(), new Box3()

        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object\'s width : ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s height : ");
        int height = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s length : ");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Width: " + width + "Height: " + height + "Length: " + length );
        for(Box box : boxes){
            if(box.validate(width, height, length)){
                System.out.println(box.getGame() + " / " + box.getPrice());
                break;
            }
        }
    }
}
