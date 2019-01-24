package com.phdua.manager.thread;

public class RunnableDemo implements java.lang.Runnable {
    @Override
    public void run() {

        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"   i = " + i);

        }
    }
}
