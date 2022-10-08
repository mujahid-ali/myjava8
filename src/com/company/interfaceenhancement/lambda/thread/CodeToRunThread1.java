package com.company.interfaceenhancement.lambda.thread;

public class CodeToRunThread1 implements Runnable {
    @Override
    public void run() {
        for (int count = 1; count <= 5; count++) {
            System.out.println("Child Thread Counter is = " + count);
        }
    }
}
