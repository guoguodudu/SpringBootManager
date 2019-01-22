package com.phdua.manager.thread;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String>  {
    @Override
    public String call() throws Exception {

        for(int i=1;i<5;i++){
            System.out.println("i = " + i);
        }
        return "String---3";
    }
}
