package com.phdua.manager.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        ExecutorService executorServicekk= Executors.newFixedThreadPool(3);

        ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 10; i++) {

        /*    cachedThreadPool.submit(()->{
                System.out.println(Thread.currentThread().getName());
            });
            executorService.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
*/
            scheduledExecutorService.scheduleAtFixedRate(()->{System.out.println(Thread.currentThread().getName());},2,3, TimeUnit.SECONDS);
        }
    }
}
