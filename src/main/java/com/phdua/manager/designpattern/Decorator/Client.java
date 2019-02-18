package com.phdua.manager.designpattern.Decorator;

public class Client {

    public static void main(String[] args) {

        //装饰模式以对客户端透明的方式扩展对象的功能，是继承关系的一个替代方案。
        TheGreatestSage sage = new Monkey();
        // 第一种写法
        TheGreatestSage bird = new Bird(sage);
        TheGreatestSage fish = new Fish(bird);
        // 第二种写法
        TheGreatestSage fishd = new Fish(new Bird(sage));
        fishd.move();
        //sage.move();
    }
}
