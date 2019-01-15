package com.phdua.manager.designpattern.Facade;

public class FacadePatternDemo {
    public static void main(String[] args) {

        //外观模式
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}