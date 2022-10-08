package com.company.interfaceenhancement.functionalinterface;

public class DemoClass implements InterfaceJava8 {


    @Override
    public void show() {
        System.out.println("Functional interface should have exactly one abstract method. ");
    }

    public static void main(String[] args) {
        DemoClass obj1 = new DemoClass();

        obj1.show();
        obj1.enquiry();
        InterfaceJava8.details();
    }
}
