package com.company.interfaceenhancement.defaultmethod;

public interface VehicleJava8 {


    default void printDefault() {
        System.out.println("I am java8 interface default method.");
    }

    default void testingDefault() {
        System.out.println("I am second default method in java8 interface and can be overridden.");
    }
    void details();

    String id = "id1";
}
