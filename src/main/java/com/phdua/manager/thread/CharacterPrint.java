package com.phdua.manager.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CharacterPrint implements Runnable {

    private int state = 0;
    private final int COUNT = 10;

    private String[] chs = { "A", "B", "C", "D","E","F" };
    private final int N = chs.length;

    private Lock lock = new ReentrantLock();

    private CharacterPrint() {
    }

    @Override
    public void run() {
        for (int i = 0; i < N; i++) {
            createThread(i);
        }
    }

    private void createThread(final int i) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (state != i) {
                        Thread.yield();
                    };
                    lock.lock();
                    for (int j = 0; j < COUNT; j++) {
                        System.out.println(chs[i]);
                    }
                    state = (i + 1) % N;
                } finally {
                    lock.unlock();
                }
            }
        }, "thread" + i).start();
    }

    public static void main(String[] args) {
        new CharacterPrint().run();
    }
}
