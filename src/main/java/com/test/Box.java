package com.test;

public class Box {
    String name;
    int length;
    int width;
    int height;
    int price;
    public boolean validate(int l, int w, int h){
        if(length >= l && width >= w && height >= h){
            return true;
        }else return false;
    }

}
