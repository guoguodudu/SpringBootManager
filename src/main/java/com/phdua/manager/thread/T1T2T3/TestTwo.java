package com.phdua.manager.thread.T1T2T3;

public class TestTwo {
    static TestTwo t=new TestTwo();
    class T1 extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //T1线程中要处理的东西
            System.out.println("T1线程执行");
        }
    }

    class T2 extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //T2线程中要处理的东西
            System.out.println("T2线程执行");
            t.new T1().start();
        }
    }

    class T3 extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //T3线程中要处理的东西
            System.out.println("T3线程执行");
            t.new T2().start();
        }
    }

    public static void main(String[] args) {
        t.new T3().start();
    }

}