package com.wei.mail;

public class Box4 extends Box {
    public Box4(){

            length = 15;
            width = 15;
            height = 15;


    }
    @Override
    public String getGame() {
        return "Box4";
    }

    @Override
    public int getPrice() {
        return 70;
    }
}
