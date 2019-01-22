package com.phdua.manager.thread;

public class ThreadDemo extends Thread {

    private String name;

    @Override
    public void run() {

        for(int i=1;i<5;i++){
            System.out.println("title"+name+"i = " + i);
        }
        super.run();
    }

    public ThreadDemo(String name) {
        this.name = name;
    }

}
