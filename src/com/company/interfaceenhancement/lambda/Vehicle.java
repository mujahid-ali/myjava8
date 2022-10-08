package com.company.interfaceenhancement.lambda;

@FunctionalInterface
public interface Vehicle {

    void show();

    public default void  getDetails() {
        System.out.println("Details from Vehicle interface default method");
    }
}
