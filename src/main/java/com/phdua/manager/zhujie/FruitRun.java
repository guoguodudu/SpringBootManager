package com.phdua.manager.zhujie;

import static com.phdua.manager.zhujie.FruitInfoUtil.getFruitInfo;

public class FruitRun {
        public static void main(String[] args) {

            Class apple=FruitInfoUtil.getFruitInfo(Apple.class);
            Apple apple1=new Apple();
            System.out.println("apple = " +apple);
        }
}
