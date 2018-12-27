package com.phdua.manager.designpattern.Proxy.Dynamic;

public class RealSubject implements Subject
{
    public void doSomething()
    {
        System.out.println( "call doSomething()" );
    }
}