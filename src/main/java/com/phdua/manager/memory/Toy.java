package com.phdua.manager.memory;

public class Toy {
    static {
        System.out.println("Initializing");// 静态子句，只在类第一次被加载并初始化时执行一次，而且只执行一次
    }

    Toy() {
        System.out.println("Building");// 构造方法，在每次声明新对象时加载
    }

    public static void main(String[] args) {
      //  Toy toy=new Toy();

        try {
            Class c = Class.forName("com.phdua.manager.memory.Toy");
            c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}