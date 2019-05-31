package com.phdua.manager.jvm.one;

public class TestClass {

    private  int x;;

    public int inc() {

        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }

    public int getX(){

        Integer[] kk=new Integer[10];

        int[] temp={1,2};

        int[] temp2=new int[10];

        Integer[][] tmp=new Integer[1][2];

        return x;
    }

    public static void main(String[] args) {
        int a[] = new int[3];

        for (int i = 0 ; i < 3;i++) {

            a[i] = i;
        }
        System.out.println("new String(a) = " +a.length);
    }

}
