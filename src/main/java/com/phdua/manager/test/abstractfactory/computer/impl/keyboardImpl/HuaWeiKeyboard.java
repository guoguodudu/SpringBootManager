package com.phdua.manager.test.abstractfactory.computer.impl.keyboardImpl;

import com.phdua.manager.test.abstractfactory.computer.Keyboard;
import com.phdua.manager.test.abstractfactory.computer.Mouse;

public class HuaWeiKeyboard implements Keyboard {


    @Override
    public void getKeyboard() {
        System.out.println(" huaweui= Keyboard");
    }
}
