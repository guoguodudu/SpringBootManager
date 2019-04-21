package com.phdua.manager.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachePool {
    private static Runnable getThread(final int i){
        return new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                }catch (Exception e){

                }
                System.out.println(Thread.currentThread().getName()+"  "+i);
            }
        };
    }

    public static  void main(String args[]){
        ExecutorService cachePool = Executors.newCachedThreadPool();
        for (int i=1;i<=100000;i++){
            cachePool.execute(getThread(i));
        }
        cachePool.shutdown();
    }
}
