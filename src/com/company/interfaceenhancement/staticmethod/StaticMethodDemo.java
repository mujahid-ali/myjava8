package com.company.interfaceenhancement.staticmethod;

public interface StaticMethodDemo {

    public static void demoMethod1() {
        System.out.println("This is static method demo from interface " +
                "Static method can be called using interface name." +
                "  There can be more than one static method possible in interface  ");
    }

    public static void demoMethod2() {
        System.out.println("Static method can not be overridden.");
    }
}
