package com.phdua.manager.thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        //火车票列表
        final List<String> tickets = new Vector<String>();
        //final Vector<String> tickets = new Vector<String>();
        //初始化票据池
        for(int i=0;i<100;i++){
            tickets.add("火车票" + i);
        }
        //10个窗口售票
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {

                        System.out.println(Thread.currentThread().getId() +"——"+ tickets.remove(0));

                };
            }.start();
        }


    }

}
