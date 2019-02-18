package com.phdua.manager.Factory;

public class Factory {

    private Factory(){}

    public static <T> T getInstance(String name){

        T obj=null;
        try {
            obj= (T) Class.forName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
