package com.phdua.manager.designpattern;

public class tes {
    public static void main(String[] args) {


        Long num1 = new Long(8);
        Long num2 = new Long(8);
        System.out.println(num1.hashCode());    //8
        System.out.println(num2.hashCode());    //8

        tes tes1=new tes();
        tes tes2=new tes();
        System.out.println(tes1);    //8
        System.out.println(tes2);    //8

        String string1=new String("123");
        String string2=new String("321");

        System.out.println(string1.hashCode());    //8
        System.out.println(string2.hashCode());    //8

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1);    //8
        System.out.println(s1.getClass());    //8
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }

}
