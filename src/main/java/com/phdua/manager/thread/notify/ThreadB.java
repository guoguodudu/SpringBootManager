package com.phdua.manager.thread.notify;

public class ThreadB extends Thread {
    int total;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 101; i++) {
                total += i;
            }
            //（完成计算了）唤醒在此对象监视器上等待的单个线程，在本例中线程A被唤醒
            notify();
        }
    }
}