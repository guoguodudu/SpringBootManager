package com.phdua.manager.designpattern.Proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyPatternDemo {
    public static void main(String[] args) {
        log.info("123");
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
