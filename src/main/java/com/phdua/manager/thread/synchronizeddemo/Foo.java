package com.phdua.manager.thread.synchronizeddemo;

public  class Foo {
    private  static   int x = 100;

    public  synchronized  int getX() {
        return x;
    }

    public  synchronized  int fix(int y) {
        x = x - y;
        return x;
    }
}