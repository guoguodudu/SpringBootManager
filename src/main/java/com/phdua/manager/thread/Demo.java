package com.phdua.manager.thread;

import com.phdua.manager.designpattern.Proxy.demo.Runable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class Demo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadDemo threadDemo=new ThreadDemo("sdljf");
        threadDemo.start();
        ThreadDemo threadDemo2=new ThreadDemo("sdljf");
        threadDemo2.start();

        RunnableDemo runnableDemo=new RunnableDemo();
        Thread thread=new Thread(runnableDemo);
        thread.start();

        new Thread(new Runable(){
            @Override
            public void run() {
                System.out.println("thread.getName() = " + thread.getName());
            }
        }).start();



        new Thread(()-> System.out.println("thread.getName() = ")).start();


        FutureTask<String> stringFutureTask=new FutureTask<String>(new CallableDemo());

        new Thread(stringFutureTask).start();

        System.out.println("stringFutureTask = " + stringFutureTask.get());

    }
}
