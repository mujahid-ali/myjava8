package com.company.interfaceenhancement.lambda.thread;

public class ThreadMain {

    public static void main(String[] args) {
        Runnable runnable = new CodeToRunThread1();
        Thread thread1 = new Thread(runnable);
        thread1.start();

        for (int count = 1; count <= 5; count++) {
            System.out.println("Main thread counter = " + count);
        }

        // using lambda

        Runnable runnable2 = () -> {
            for (int count = 1; count <= 5; count++) {
                System.out.println("Child thread2 counter = " + count);
            }
        };

        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
