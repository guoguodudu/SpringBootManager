package com.phdua.manager.test.abstractfactory.computer.impl.mouseImpl;

import com.phdua.manager.test.abstractfactory.computer.Keyboard;
import com.phdua.manager.test.abstractfactory.computer.Mouse;

public class HuaWeiMouse implements Mouse {
    @Override
    public void getMouse() {
        System.out.println(" huaweui= mous");
    }
}
