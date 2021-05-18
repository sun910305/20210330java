package com.wei.mail;

public class Box2 extends Box{
    public Box2(){
        length = 8;
        width = 10;
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
