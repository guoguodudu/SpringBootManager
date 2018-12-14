package com.phdua.manager.test.abstractfactory;

import com.phdua.manager.test.HuaWei;
import com.phdua.manager.test.abstractfactory.computer.Keyboard;
import com.phdua.manager.test.abstractfactory.computer.Mouse;

import java.awt.event.MouseAdapter;

public abstract class AbstractFactory {

    public abstract Mouse createMouse();

    public abstract Keyboard createKeyboard();

}
