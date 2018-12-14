package com.phdua.manager.test.abstractfactory.computer.impl.keyboardImpl;

import com.phdua.manager.test.abstractfactory.computer.Keyboard;
import com.phdua.manager.test.abstractfactory.computer.Mouse;

public class SonyKeyboard implements Mouse ,Keyboard {

    @Override
    public void getMouse() {
        System.out.println("sony = mouse ");
    }

    @Override
    public void getKeyboard() {
        System.out.println("sony = mouse ");
    }
}
