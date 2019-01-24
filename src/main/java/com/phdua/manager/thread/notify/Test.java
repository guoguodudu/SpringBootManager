package com.phdua.manager.thread.notify;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyCommon();
        Thread t2 = new Thread(new MyDaemon());
        t2.setDaemon(true);        //设置为守护线程

        t2.start();
        t1.start();

        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        Thread.sleep(1000);
    }
}

class MyCommon extends Thread {
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("线程1第" + i + "次执行！");
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyDaemon implements Runnable {
    public void run() {
        for (long i = 0; i < 9999999L; i++) {
            System.out.println("后台线程第" + i + "次执行！");
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}