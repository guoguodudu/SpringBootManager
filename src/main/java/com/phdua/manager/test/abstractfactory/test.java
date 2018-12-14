package com.phdua.manager.test.abstractfactory;

import com.phdua.manager.test.abstractfactory.abstractfactoryimpl.HuaWeiFactory;

public class test {

    public static void main(String[] args) {

        AbstractFactory abstractFactory= new HuaWeiFactory();

        abstractFactory.getMouse().getMouse();

        abstractFactory.getKeyboard().getKeyboard();
    }
}
