package com.phdua.manager.memory;

public class  Reordering {
    int x = 0, y = 0;
    public void writer() {
        x = 1;
        y = 2;
    }

    public void reader() {
        int r1 = y;
        int r2 = x;
    }

    public static void main(String[] args) {
        Reordering reordering=new Reordering();

        reordering.writer();
        reordering.reader();

        System.out.println("reordering.x = " + reordering.x);
        System.out.println("reordering.x = " + reordering.y);
    }
}