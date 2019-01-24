package com.phdua.manager.thread;

public class ThreadDemo extends Thread {

    @Override
    public void run() {

        for(int i=1;i<5;i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+"   i = " + i);
        }
        super.run();
    }


    public ThreadDemo(String name) {
        super(name);
    }
}
