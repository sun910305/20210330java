package com.wei.mail;

public abstract class Box {
    int length;
    int width;
    int height;

    public boolean validate(int l, int w, int h){

        return(l<=length && w<=width && h<=height);
    }
    public abstract String getGame();
    public abstract int getPrice();


}
