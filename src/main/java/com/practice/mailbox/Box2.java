package com.practice.mailbox;

public class Box2 extends Box {
    public Box2() {
        width = 15;
        length = 15;
        height = 15;

    }

    @Override
    public String getGame() {
        return "Box2";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
