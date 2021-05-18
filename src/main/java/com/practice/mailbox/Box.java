package com.practice.mailbox;

public abstract class Box {
    int width;
    int height;
    int length;
    public boolean validate(int w, int h, int l){
        return (w<= width && h<= height && l<= length);
    }

    public abstract String getGame();
    public abstract int getPrice();

}
