package com.company.interfaceenhancement.defaultmethod;

public class CarJava8 implements VehicleJava8 {

    @Override
    public void details() {
        System.out.println("I am CarJava8 class.");
    }

    @Override
    public void testingDefault() {
        System.out.println("Override is possible for default method");
        }
}
