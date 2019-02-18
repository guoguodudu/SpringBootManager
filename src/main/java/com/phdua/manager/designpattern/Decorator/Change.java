package com.phdua.manager.designpattern.Decorator;

public abstract class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage){
        this.sage = sage;
    }
    @Override
    public void move() {
        // 代码
        System.out.println(" -----------ppp");
        sage.move();
    }

}
