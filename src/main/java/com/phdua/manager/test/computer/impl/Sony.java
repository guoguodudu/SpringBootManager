package com.phdua.manager.test.computer.impl;

import com.phdua.manager.test.computer.Assemble;

public class Sony implements Assemble {
    @Override
    public void getMouse() {
        System.out.println("sony  =  mouse");
    }

    @Override
    public void getKeyboard() {
        System.out.println("sony  =  keyboard(");
    }
}
