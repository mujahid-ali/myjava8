package com.company.interfaceenhancement.functionalinterface;

@FunctionalInterface
public interface InterfaceJava8 {

    public void show();// only one or exactly one abstract method.

    public static void details() {
        System.out.println("Functional interface can have any number of static methods.");
    }

    public default void enquiry() {
        System.out.println("Functional interface can have any number of default methods.");
    }
}
