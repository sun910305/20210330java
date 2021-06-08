package com.wei.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Tester {
    public static void main(String[] args) {
        try{
//            Socket socket = new Socket("instagram.com",80); //網站都是80port
//            Socket socket = new Socket("tw.yahoo.com",80);
            Socket socket = new Socket("ptt.cc", 23);
//            Socket socket = new Socket("www.google.com",80);
            InputStream is = socket.getInputStream();
            for(int i= 1; i<500; i++){
                int data = is.read();
                System.out.print((char)data);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
