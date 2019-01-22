package com.phdua.manager.thread;

import com.phdua.manager.designpattern.Proxy.demo.Runable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;


public class Demo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
     /*   ThreadDemo threadDemo=new ThreadDemo("sdljf");
        threadDemo.start();
        ThreadDemo threadDemo2=new ThreadDemo("sdljf");
        threadDemo2.start();
        */
        RunnableDemo runnableDemo=new RunnableDemo();
        Thread thread=new Thread(runnableDemo);
        Thread thread2=new Thread(runnableDemo);
        Thread thread3=new Thread(runnableDemo);
        thread.setPriority(MAX_PRIORITY);
        thread2.setPriority(MIN_PRIORITY);
        thread3.setPriority(MAX_PRIORITY);
        thread.start();
        thread2.start();
        thread3.start();

      /*  RunnableDemo runnableDemo=new RunnableDemo();
        new Thread(runnableDemo).start();
        new Thread(runnableDemo).start();
        new Thread(runnableDemo).start();
        new Thread(runnableDemo).start();*/
       /* new Thread(new Runable(){
            @Override
            public void run() {
                System.out.println("thread.getName() = " + thread.getName());
            }
        }).start();



        new Thread(()-> System.out.println("thread.getName() = ")).start();


        FutureTask<String> stringFutureTask=new FutureTask<String>(new CallableDemo());

        new Thread(stringFutureTask).start();

        System.out.println("stringFutureTask = " + stringFutureTask.get());*/

    }
}
