package com.phdua.manager.thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixPoolDemo {

    private  static  int k=0;

    private static List<String> v= new Vector<>();
    private static Runnable getThread(final int i) {
        return new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                v.add("dupihua"+i);
                k++;
                System.out.println(Thread.currentThread().getName()+"  "+i);

                System.out.println(Thread.currentThread().getName()+"--------sumsum "+"  "+ v.size());
            }
        };
    }


    private static Runnable getGetThread(final int i) {
        return new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"--------sumsum2 "+"  "+ v.get(0).toString());
                v.remove(0);
                System.out.println(Thread.currentThread().getName()+"--------sumsum2 "+"  "+ v.size());
            }
        };
    }

    public static void main(String args[]) throws InterruptedException {
        ExecutorService fixPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            fixPool.execute(getThread(i));
        }
        fixPool.shutdown();

        ExecutorService fixPool5 = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 100; i++) {
            fixPool5.execute(getGetThread(1));
        }
        fixPool5.shutdown();

    }
}
