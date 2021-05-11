package com.wei.mail;

public class Box5 extends Box {
    public Box5(){
        length = 10;
        width = 20;
        height = 20;

        }

    //option+enter
    @Override
    public String getGame() {
        return "Box5";
    }

    @Override
    public int getPrice() {
        return 90;
    }


}


