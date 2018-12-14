package com.phdua.manager.test.abstractfactory.abstractfactoryimpl;

import com.phdua.manager.test.abstractfactory.AbstractFactory;
import com.phdua.manager.test.abstractfactory.computer.Keyboard;
import com.phdua.manager.test.abstractfactory.computer.Mouse;
import com.phdua.manager.test.abstractfactory.computer.impl.keyboardImpl.SonyKeyboard;
import com.phdua.manager.test.abstractfactory.computer.impl.mouseImpl.SonyMouse;

public class SonyFactory extends AbstractFactory {

    @Override
    public Mouse createMouse() {
        return new SonyMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new SonyKeyboard();
    }
}
