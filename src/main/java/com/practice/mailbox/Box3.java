package com.practice.mailbox;

public class Box3 extends Box{
    public Box3(){
        width = 10;
        length = 10;
        height = 10;

    }

    @Override
    public String getGame() {
        return "Box3";
    }

    @Override
    public int getPrice() {
        return 60;
    }
}
