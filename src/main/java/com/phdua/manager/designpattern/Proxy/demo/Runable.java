package com.phdua.manager.designpattern.Proxy.demo;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

public class Runable implements Runnable {
    @Override
    public void run() {
        System.out.println("1 = " + 1);
    }

    public static void main(String[] args) {

        Runable pp=new Runable();

        //Runnable runnable=new Runable()->runnable
        //Thread thread=new Thread(new Runnable() -> System.out.println("thread = " + thread););

        List<Integer> kk=Lists.newArrayList(2,1);

        kk.stream().forEach(i -> System.out.println("kk = " + i));
       // thread.start();
    }

    private List kk(Integer ... e){
        return Arrays.asList(e);
    }
}
