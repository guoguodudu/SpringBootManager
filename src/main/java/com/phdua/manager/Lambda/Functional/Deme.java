package com.phdua.manager.Lambda.Functional;

import com.phdua.manager.designpattern.Proxy.demo.Runable;

public class Deme {

    public static void main(String[] args) {

        GreetingService greetingService=message -> System.out.println("Hello " + message);
        greetingService.sayMessage("123");
       // System.out.println("args = " + args);
    }
}
