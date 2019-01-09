package com.phdua.manager.Lambda.Functional;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public void sayMessage(String message) {
        System.out.println("message = " + message);
    }
}
