package com.phdua.manager.test.abstractfactory.abstractfactoryimpl;

import com.phdua.manager.test.abstractfactory.AbstractFactory;
import com.phdua.manager.test.abstractfactory.computer.Keyboard;
import com.phdua.manager.test.abstractfactory.computer.Mouse;
import com.phdua.manager.test.abstractfactory.computer.impl.keyboardImpl.HuaWeiKeyboard;
import com.phdua.manager.test.abstractfactory.computer.impl.mouseImpl.HuaWeiMouse;
import com.phdua.manager.test.abstractfactory.computer.impl.mouseImpl.SonyMouse;

public class HuaWeiFactory extends AbstractFactory {


    @Override
    public Mouse createMouse() {

        return new HuaWeiMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HuaWeiKeyboard();
    }
}
